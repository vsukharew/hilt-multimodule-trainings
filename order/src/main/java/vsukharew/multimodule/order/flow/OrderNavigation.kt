package vsukharew.multimodule.order.flow

import com.github.terrakok.cicerone.Router
import vsukharew.multimodule.navigationapi.OrderRouter
import javax.inject.Inject

class OrderNavigation @Inject constructor(private val router: Router) : OrderRouter {
    override fun navigateToOrder() {
        router.navigateTo(OrderFlowScreen())
    }
}