package vsukharew.multimodule.order.flow

sealed class OrderFlowDirections {
    sealed class OrderFlowScreen : OrderFlowDirections() {
        data object FirstScreenInFlow : OrderFlowScreen()
    }
    sealed class EmailScreen : OrderFlowDirections() {
        data object Back : EmailScreen()
        data object Next : EmailScreen()
    }
    sealed class AddressScreen : OrderFlowDirections() {
        data object Back : AddressScreen()
        data object Next : AddressScreen()
    }
}
