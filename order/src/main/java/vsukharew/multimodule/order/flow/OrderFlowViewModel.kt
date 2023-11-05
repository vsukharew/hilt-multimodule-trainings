package vsukharew.multimodule.order.flow

import com.github.terrakok.cicerone.Router
import com.github.terrakok.cicerone.androidx.FragmentScreen
import dagger.hilt.android.lifecycle.HiltViewModel
import vsukharew.multimodule.order.email.EmailScreen
import vsukharew.multimodule.ui.BaseFlowViewModel
import javax.inject.Inject

class OrderFlowViewModel(flowRouter: Router) : BaseFlowViewModel(flowRouter) {
    override val startScreen: FragmentScreen
        get() = EmailScreen
}