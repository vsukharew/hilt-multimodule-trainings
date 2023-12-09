package vsukharew.multimodule.order.flow

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.AbstractSavedStateViewModelFactory
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.github.terrakok.cicerone.NavigatorHolder
import dagger.hilt.EntryPoints
import dagger.hilt.android.AndroidEntryPoint
import vsukharew.multimodule.order.R
import vsukharew.multimodule.order.databinding.FragmentOrderFlowBinding
import vsukharew.multimodule.order.email.EmailScreen
import vsukharew.multimodule.order.flow.di.OrderFlowComponentHolder
import vsukharew.multimodule.order.flow.di.OrderFlowEntryPoint
import vsukharew.multimodule.ui.BaseFlowFragment
import vsukharew.multimodule.ui.factoryCast
import javax.inject.Inject

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
@AndroidEntryPoint
internal class OrderFlowFragment : BaseFlowFragment<EmailScreen, OrderFlowViewModel>(R.layout.fragment_order_flow) {

    private var _binding: FragmentOrderFlowBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    private val entryPoint by lazy {
        EntryPoints.get(
            orderFlowComponentHolder.orderFlowComponent(),
            OrderFlowEntryPoint::class.java
        )
    }

    @Inject
    lateinit var orderFlowComponentHolder: OrderFlowComponentHolder

    override val containerId: Int = R.id.order_flow_container_id
    override val viewModel by viewModels<OrderFlowViewModel> {
        object : AbstractSavedStateViewModelFactory(this@OrderFlowFragment, arguments) {
            override fun <T : ViewModel> create(
                key: String,
                modelClass: Class<T>,
                handle: SavedStateHandle
            ): T {
                return entryPoint.run {
                    OrderFlowViewModel(
                        flowRouter()
                    ).factoryCast()
                }
            }
        }
    }
    override val navigatorHolder by lazy { entryPoint.navigatorHolder() }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentOrderFlowBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}