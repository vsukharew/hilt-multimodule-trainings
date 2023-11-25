package vsukharew.multimodule.hilt

import com.github.terrakok.cicerone.Cicerone
import com.github.terrakok.cicerone.Router
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped
import vsukharew.multimodule.registration.flow.di.DaggerRegistrationRouterComponent
import vsukharew.multimodule.registration.flow.di.RegistrationRouterComponent
import vsukharew.multimodule.registration_api.RegistrationRouter

@Module
@InstallIn(ViewModelComponent::class)
object RegistrationRouterProxyModule {
    @Provides
    @ViewModelScoped
    fun provideRegistrationRouterComponent(cicerone: Cicerone<Router>): RegistrationRouterComponent {
        return DaggerRegistrationRouterComponent.factory()
            .create(cicerone.router)
    }

    @Provides
    @ViewModelScoped
    fun provideRegistrationRouter(registrationRouterComponent: RegistrationRouterComponent): RegistrationRouter {
        return registrationRouterComponent.registrationRouter()
    }
}