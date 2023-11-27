package vsukharew.multimodule.registration.flow.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped
import vsukharew.multimodule.navigationapi.RegistrationRouter
import vsukharew.multimodule.registration.flow.RegistrationNavigation

@Module
@InstallIn(ViewModelComponent::class)
interface NavigationModule {
    @Binds
    @ViewModelScoped
    fun bindRegistrationRouter(impl: RegistrationNavigation): RegistrationRouter
}