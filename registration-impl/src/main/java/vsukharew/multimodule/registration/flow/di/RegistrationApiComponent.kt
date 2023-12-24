package vsukharew.multimodule.registration.flow.di

import com.github.terrakok.cicerone.Router
import dagger.Component
import vsukharew.multimodule.registration_api.RegistrationRouter
import javax.inject.Singleton

@Singleton
@Component(modules = [RegistrationApiModule::class], dependencies = [Router::class])
interface RegistrationApiComponent {
    fun registrationRouter(): RegistrationRouter
}