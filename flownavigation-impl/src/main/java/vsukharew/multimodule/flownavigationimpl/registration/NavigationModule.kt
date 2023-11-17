package vsukharew.multimodule.flownavigationimpl.registration

import com.github.terrakok.cicerone.Cicerone
import com.github.terrakok.cicerone.Router
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import vsukharew.multimodule.di.Flow
import vsukharew.multimodule.di.PerFeature
import vsukharew.multimodule.navigationapi.NavigationApi
import vsukharew.multimodule.registration.flow.RegistrationFlowDirections
import vsukharew.multimodule.registration.flow.di.RegistrationFlowComponent

@Module
@InstallIn(RegistrationFlowComponent::class)
object NavigationModule {

    @Provides
    @PerFeature
    fun provideRegistrationFlowNavigation(
        globalCicerone: Cicerone<Router>,
        @Flow flowCicerone: Cicerone<Router>
    ): NavigationApi<RegistrationFlowDirections> {
        return RegistrationFlowNavigation(globalCicerone.router, flowCicerone.router)
    }
}