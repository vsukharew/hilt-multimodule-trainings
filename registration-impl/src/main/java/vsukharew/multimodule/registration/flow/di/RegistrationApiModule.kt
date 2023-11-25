package vsukharew.multimodule.registration.flow.di

import dagger.Binds
import dagger.Module
import dagger.hilt.migration.DisableInstallInCheck
import vsukharew.multimodule.registration.flow.RegistrationNavigation
import vsukharew.multimodule.registration_api.RegistrationRouter
import javax.inject.Singleton

@Module
@DisableInstallInCheck
interface RegistrationApiModule {

    @Binds
    @Singleton
    fun bindRegistrationRouter(impl: RegistrationNavigation): RegistrationRouter
}