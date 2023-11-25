package vsukharew.multimodule.registration.birthdate

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.addCallback
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.AbstractSavedStateViewModelFactory
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import dagger.hilt.EntryPoints
import dagger.hilt.android.AndroidEntryPoint
import vsukharew.multimodule.registration.R
import vsukharew.multimodule.registration.databinding.FragmentBirthdateBinding
import vsukharew.multimodule.registration.flow.di.RegistrationFlowComponentHolder
import vsukharew.multimodule.registration.flow.di.RegistrationFlowEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class BirthDateFragment : Fragment(R.layout.fragment_birthdate) {

    private var _binding: FragmentBirthdateBinding? = null
    private val binding
        get() = _binding!!

    private val viewModel by viewModels<BirthDateViewModel> {
        object : AbstractSavedStateViewModelFactory(this@BirthDateFragment, arguments) {
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
                    BirthDateViewModel(
                        globalRouter(),
                        flowRouter()
                    ) as T
                }
            }
        }
    }

    @Inject
    lateinit var componentHolder: RegistrationFlowComponentHolder

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentBirthdateBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            signUp.setOnClickListener {
                viewModel.signUp()
            }
        }
        activity?.onBackPressedDispatcher?.addCallback(
            owner = viewLifecycleOwner,
            onBackPressed = { viewModel.back() }
        )
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}