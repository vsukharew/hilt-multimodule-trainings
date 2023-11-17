package vsukharew.multimodule.order.flow.di

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class OrderFlowComponentHolder @Inject constructor(
    private val orderFlowComponentBuilder: OrderFlowComponent.Builder,
) {
    private var orderFlowComponent: OrderFlowComponent? = null

    fun orderFlowComponent(): OrderFlowComponent {
        return orderFlowComponent ?: orderFlowComponentBuilder.build()
            .also { orderFlowComponent = it }
    }
}