package vsukharew.multimodule.registration.flow

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.AbstractSavedStateViewModelFactory
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import dagger.hilt.EntryPoints
import dagger.hilt.android.AndroidEntryPoint
import vsukharew.multimodule.registration.R
import vsukharew.multimodule.registration.flow.di.RegistrationFlowEntryPoint
import vsukharew.multimodule.registration.databinding.FragmentRegistrationFlowBinding
import vsukharew.multimodule.registration.flow.di.RegistrationFlowComponentHolder
import vsukharew.multimodule.registration.nickname.NicknameScreen
import vsukharew.multimodule.ui.BaseFlowFragment
import javax.inject.Inject

/**
 * A simple [Fragment] subclass as the second destination in the navigation.
 */
@AndroidEntryPoint
internal class RegistrationFlowFragment :
    BaseFlowFragment<NicknameScreen, RegistrationFlowViewModel>(R.layout.fragment_registration_flow) {

    private var _binding: FragmentRegistrationFlowBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    @Inject
    lateinit var componentHolder: RegistrationFlowComponentHolder

    private val entryPoint by lazy {
        EntryPoints.get(
            componentHolder.registrationFlowComponent(),
            RegistrationFlowEntryPoint::class.java
        )
    }

    override val containerId: Int = R.id.registration_flow_container

    override val viewModel by viewModels<RegistrationFlowViewModel> {
        object : AbstractSavedStateViewModelFactory(this@RegistrationFlowFragment, arguments) {
            override fun <T : ViewModel> create(
                key: String,
                modelClass: Class<T>,
                handle: SavedStateHandle
            ): T {
                return entryPoint.run {
                    RegistrationFlowViewModel(
                        flowRouter(),
                        handle
                    ) as T
                }
            }
        }
    }

    override val navigatorHolder by lazy { entryPoint.navigatorHolder() }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentRegistrationFlowBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}