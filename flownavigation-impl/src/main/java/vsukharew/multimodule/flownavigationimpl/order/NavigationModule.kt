package vsukharew.multimodule.flownavigationimpl.order

import com.github.terrakok.cicerone.Cicerone
import com.github.terrakok.cicerone.Router
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import vsukharew.multimodule.di.Flow
import vsukharew.multimodule.di.PerFeature
import vsukharew.multimodule.navigationapi.NavigationApi
import vsukharew.multimodule.order.flow.OrderFlowDirections
import vsukharew.multimodule.order.flow.di.OrderFlowComponent

@Module
@InstallIn(OrderFlowComponent::class)
object NavigationModule {

    @Provides
    @PerFeature
    fun provideOrderFlowNavigation(
        globalCicerone: Cicerone<Router>,
        @Flow flowCicerone: Cicerone<Router>
    ): NavigationApi<OrderFlowDirections> {
        return OrderFlowNavigation(globalCicerone.router, flowCicerone.router)
    }
}