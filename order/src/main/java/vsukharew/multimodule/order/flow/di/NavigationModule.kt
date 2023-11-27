package vsukharew.multimodule.order.flow.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped
import vsukharew.multimodule.navigationapi.OrderRouter
import vsukharew.multimodule.order.flow.OrderNavigation

@Module
@InstallIn(ViewModelComponent::class)
interface NavigationModule {
    @Binds
    @ViewModelScoped
    fun bindOrderRouter(impl: OrderNavigation): OrderRouter
}