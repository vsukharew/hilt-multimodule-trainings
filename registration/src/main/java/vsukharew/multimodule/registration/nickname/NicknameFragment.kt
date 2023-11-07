package vsukharew.multimodule.registration.nickname

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.AbstractSavedStateViewModelFactory
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import dagger.hilt.EntryPoints
import dagger.hilt.android.AndroidEntryPoint
import vsukharew.multimodule.registration.R
import vsukharew.multimodule.registration.flow.di.RegistrationFlowEntryPoint
import vsukharew.multimodule.registration.databinding.FragmentNicknameBinding
import vsukharew.multimodule.registration.flow.di.RegistrationFlowComponentHolder
import javax.inject.Inject

@AndroidEntryPoint
class NicknameFragment : Fragment(R.layout.fragment_nickname) {

    private var _binding: FragmentNicknameBinding? = null
    private val binding
        get() = _binding!!

    @Inject
    lateinit var componentHolder: RegistrationFlowComponentHolder

    private val viewModel by viewModels<NicknameViewModel> {
        object : AbstractSavedStateViewModelFactory(this@NicknameFragment, arguments) {
            override fun <T : ViewModel> create(
                key: String,
                modelClass: Class<T>,
                handle: SavedStateHandle
            ): T {
                val entryPoint = EntryPoints.get(
                    componentHolder.registrationFlowComponent(),
                    RegistrationFlowEntryPoint::class.java
                )
                return entryPoint.run {
                    NicknameViewModel(
                        registrationFlowNavigation(),
                    ) as T
                }
            }
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentNicknameBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            previous.setOnClickListener {
                viewModel.back()
            }
            next.setOnClickListener {
                viewModel.next()
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}