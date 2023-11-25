package vsukharew.multimodule.registration.flow.di

import com.github.terrakok.cicerone.Router
import dagger.Component
import vsukharew.multimodule.registration_api.RegistrationRouter
import javax.inject.Singleton

@Singleton
@Component(modules = [RegistrationApiModule::class], dependencies = [Router::class])
interface RegistrationApiComponent {
    @Component.Factory
    interface Factory {
        fun create(router: Router): RegistrationApiComponent
    }
    fun registrationRouter(): RegistrationRouter
}