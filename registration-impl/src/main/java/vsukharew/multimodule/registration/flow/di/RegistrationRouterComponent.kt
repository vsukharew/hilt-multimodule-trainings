package vsukharew.multimodule.registration.flow.di

import com.github.terrakok.cicerone.Router
import dagger.Component
import vsukharew.multimodule.registration_api.RegistrationRouter
import javax.inject.Singleton

@Singleton
@Component(modules = [RegistrationRouterModule::class], dependencies = [Router::class])
interface RegistrationRouterComponent {
    @Component.Factory
    interface Factory {
        fun create(router: Router): RegistrationRouterComponent
    }
    fun registrationRouter(): RegistrationRouter
}