package vsukharew.multimodule.registration.flow.di

import dagger.hilt.DefineComponent
import dagger.hilt.components.SingletonComponent
import vsukharew.multimodule.di.PerFeature

@PerFeature
@DefineComponent(parent = SingletonComponent::class)
interface RegistrationFlowComponent {
    @DefineComponent.Builder
    interface Builder {
        fun build(): RegistrationFlowComponent
    }
}