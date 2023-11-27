package vsukharew.multimodule.main_menu

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.scopes.ActivityScoped
import vsukharew.multimodule.navigationapi.MainMenuRouter

@Module
@InstallIn(ActivityComponent::class)
interface NavigationModule {
    @Binds
    @ActivityScoped
    fun bindMainMenuRouter(impl: MainMenuNavigation): MainMenuRouter
}