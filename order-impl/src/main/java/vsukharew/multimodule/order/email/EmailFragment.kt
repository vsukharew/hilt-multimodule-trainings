package vsukharew.multimodule.order.email

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
import vsukharew.multimodule.order.R
import vsukharew.multimodule.order.databinding.FragmentEmailBinding
import vsukharew.multimodule.order.flow.di.OrderFlowComponentHolder
import vsukharew.multimodule.order.flow.di.OrderFlowEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
internal class EmailFragment : Fragment(R.layout.fragment_email) {

    private var _binding: FragmentEmailBinding? = null
    private val binding
        get() = _binding!!

    @Inject
    lateinit var componentHolder: OrderFlowComponentHolder

    private val viewModel by viewModels<EmailViewModel> {
        object : AbstractSavedStateViewModelFactory(this@EmailFragment, arguments) {
            override fun <T : ViewModel> create(
                key: String,
                modelClass: Class<T>,
                handle: SavedStateHandle
            ): T {
                val entryPoint = EntryPoints.get(
                    componentHolder.orderFlowComponent(),
                    OrderFlowEntryPoint::class.java
                )
                return entryPoint.run {
                    EmailViewModel(
                        globalRouter(),
                        flowRouter()
                    ) as T
                }
            }
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentEmailBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            binding.next.setOnClickListener {
                viewModel.next()
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}