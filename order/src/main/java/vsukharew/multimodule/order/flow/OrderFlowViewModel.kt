package vsukharew.multimodule.order.flow

import com.github.terrakok.cicerone.Router
import vsukharew.multimodule.order.email.EmailScreen
import vsukharew.multimodule.ui.BaseFlowViewModel

class OrderFlowViewModel(flowRouter: Router) : BaseFlowViewModel<EmailScreen>(flowRouter) {
    override val startScreen: EmailScreen = EmailScreen
}