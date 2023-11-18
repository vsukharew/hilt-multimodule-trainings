package vsukharew.multimodule.order.flow

import com.github.terrakok.cicerone.Router
import vsukharew.multimodule.di.PerFeature
import vsukharew.multimodule.order.email.EmailScreen
import vsukharew.multimodule.order_api.OrderApi
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class OrderNavigation @Inject constructor(
    private val globalRouter: Router,
) : OrderApi {

    override fun startOrderFlow() {
        globalRouter.navigateTo(OrderFlowScreen())
    }
}