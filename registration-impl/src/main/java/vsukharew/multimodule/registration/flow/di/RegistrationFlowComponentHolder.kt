package vsukharew.multimodule.registration.flow.di

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class RegistrationFlowComponentHolder @Inject constructor(
    private val registrationFlowComponentBuilder: RegistrationFlowComponent.Builder,
) {
    private var registrationFlowComponent: RegistrationFlowComponent? = null

    fun registrationFlowComponent(): RegistrationFlowComponent {
        return registrationFlowComponent ?: registrationFlowComponentBuilder.build()
            .also { registrationFlowComponent = it }
    }
}