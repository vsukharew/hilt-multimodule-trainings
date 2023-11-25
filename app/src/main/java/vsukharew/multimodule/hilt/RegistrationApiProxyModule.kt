package vsukharew.multimodule.hilt

import com.github.terrakok.cicerone.Cicerone
import com.github.terrakok.cicerone.Router
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped
import vsukharew.multimodule.registration.flow.di.DaggerRegistrationApiComponent
import vsukharew.multimodule.registration.flow.di.RegistrationApiComponent
import vsukharew.multimodule.registration_api.RegistrationRouter

@Module
@InstallIn(ViewModelComponent::class)
object RegistrationApiProxyModule {
    @Provides
    @ViewModelScoped
    fun provideRegistrationRouterComponent(cicerone: Cicerone<Router>): RegistrationApiComponent {
        return DaggerRegistrationApiComponent.factory()
            .create(cicerone.router)
    }

    @Provides
    @ViewModelScoped
    fun provideRegistrationRouter(registrationApiComponent: RegistrationApiComponent): RegistrationRouter {
        return registrationApiComponent.registrationRouter()
    }
}