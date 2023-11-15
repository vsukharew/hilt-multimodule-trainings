package vsukharew.multimodule.navigationimpl

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped
import vsukharew.multimodule.main_menu.MainMenuDirections
import vsukharew.multimodule.navigationapi.NavigationApi

@Module
@InstallIn(ViewModelComponent::class)
interface MainMenuNavigationModule {
    @Binds
    @ViewModelScoped
    fun provideMainMenuNavigationApi(impl: MainMenuNavigation): NavigationApi<MainMenuDirections>
}