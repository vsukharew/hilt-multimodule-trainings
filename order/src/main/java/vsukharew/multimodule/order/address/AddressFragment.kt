package vsukharew.multimodule.order.address

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
import vsukharew.multimodule.order.databinding.FragmentAddressBinding
import vsukharew.multimodule.order.flow.di.OrderFlowComponentHolder
import vsukharew.multimodule.order.flow.di.OrderFlowEntryPoint
import vsukharew.multimodule.ui.factoryCast
import javax.inject.Inject

@AndroidEntryPoint
internal class AddressFragment : Fragment(R.layout.fragment_address) {
    private var _binding: FragmentAddressBinding? = null
    private val binding
        get() = _binding!!

    @Inject
    lateinit var componentHolder: OrderFlowComponentHolder

    private val viewModel by viewModels<AddressViewModel> {
        object : AbstractSavedStateViewModelFactory(this@AddressFragment, arguments) {
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
                    AddressViewModel(
                        globalRouter()
                    ).factoryCast()
                }
            }
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentAddressBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            binding.createOrder.setOnClickListener {
                viewModel.createOrder()
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }   
}