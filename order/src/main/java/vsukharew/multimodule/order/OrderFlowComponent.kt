package vsukharew.multimodule.order

import dagger.hilt.DefineComponent
import dagger.hilt.components.SingletonComponent
import vsukharew.multimodule.di.PerFeature

@PerFeature
@DefineComponent(parent = SingletonComponent::class)
interface OrderFlowComponent {
    @DefineComponent.Builder
    interface Builder {
        fun build(): OrderFlowComponent
    }
}