package vsukharew.multimodule.order.flow

import com.github.terrakok.cicerone.Router
import vsukharew.multimodule.order_api.OrderRouter
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class OrderNavigation @Inject constructor(
    private val globalRouter: Router,
) : OrderRouter {

    override fun startOrderFlow() {
        globalRouter.navigateTo(OrderFlowScreen())
    }
}