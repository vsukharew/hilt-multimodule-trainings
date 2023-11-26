package vsukharew.multimodule.order.flow

import com.github.terrakok.cicerone.Router
import vsukharew.multimodule.navigationapi.NavigationApi
import vsukharew.multimodule.order.address.AddressScreen
import vsukharew.multimodule.order.email.EmailScreen
import vsukharew.multimodule.order.flow.OrderFlowDirections

class OrderFlowNavigation(
    private val globalRouter: Router,
    private val flowRouter: Router
) : NavigationApi<OrderFlowDirections> {
    override fun navigateTo(direction: OrderFlowDirections) {
        when (direction) {
            is OrderFlowDirections.OrderFlowScreen.FirstScreenInFlow -> {
                flowRouter.navigateTo(EmailScreen)
            }
            is OrderFlowDirections.EmailScreen.Back -> {
                globalRouter.exit()
            }
            is OrderFlowDirections.EmailScreen.Next -> {
                flowRouter.navigateTo(AddressScreen)
            }
            is OrderFlowDirections.AddressScreen.Back -> {
                flowRouter.exit()
            }
            is OrderFlowDirections.AddressScreen.Next -> {
                globalRouter.exit()
            }
        }
    }
}