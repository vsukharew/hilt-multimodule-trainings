package vsukharew.multimodule.order

import com.github.terrakok.cicerone.Router
import com.github.terrakok.cicerone.androidx.FragmentScreen
import dagger.hilt.android.lifecycle.HiltViewModel
import vsukharew.multimodule.ui.BaseFlowViewModel

class OrderFlowViewModel(flowRouter: Router) : BaseFlowViewModel(flowRouter) {
    override val startScreen: FragmentScreen
        get() = EmailScreen
}