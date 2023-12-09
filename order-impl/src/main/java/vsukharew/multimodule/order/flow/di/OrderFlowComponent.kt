package vsukharew.multimodule.order.flow.di

import dagger.hilt.DefineComponent
import dagger.hilt.components.SingletonComponent
import vsukharew.multimodule.di.PerFeature

@PerFeature
@DefineComponent(parent = SingletonComponent::class)
internal interface OrderFlowComponent {
    @DefineComponent.Builder
    interface Builder {
        fun build(): OrderFlowComponent
    }
}