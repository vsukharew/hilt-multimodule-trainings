package vsukharew.multimodule.order.flow

import vsukharew.multimodule.navigationapi.NavigationApi
import vsukharew.multimodule.ui.BaseFlowViewModel

class OrderFlowViewModel(navigationApi: NavigationApi<OrderFlowDirections>) : BaseFlowViewModel<OrderFlowDirections>(navigationApi) {
    override val startScreen: OrderFlowDirections
        get() = OrderFlowDirections.OrderFlowScreen.FirstScreenInFlow
}