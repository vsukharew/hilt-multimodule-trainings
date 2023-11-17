package vsukharew.multimodule.order.flow.di

import com.github.terrakok.cicerone.Cicerone
import com.github.terrakok.cicerone.Router
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import vsukharew.multimodule.di.PerFeature
import vsukharew.multimodule.di.Flow
import vsukharew.multimodule.order.flow.di.OrderFlowComponent

@Module
@InstallIn(OrderFlowComponent::class)
object NavigationModule {
    @Provides
    @PerFeature
    @Flow
    fun provideCicerone(): Cicerone<Router> = Cicerone.create()

    @Provides
    @PerFeature
    @Flow
    fun provideRouter(@Flow cicerone: Cicerone<Router>) = cicerone.router

    @Provides
    @PerFeature
    @Flow
    fun provideNavigationHolder(@Flow cicerone: Cicerone<Router>) = cicerone.getNavigatorHolder()
}