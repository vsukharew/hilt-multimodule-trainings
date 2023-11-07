package vsukharew.multimodule.order.flow.di

import com.github.terrakok.cicerone.NavigatorHolder
import com.github.terrakok.cicerone.Router
import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn
import vsukharew.multimodule.coreapi.data.ProfileRepo
import vsukharew.multimodule.di.Flow
import vsukharew.multimodule.navigationapi.NavigationApi
import vsukharew.multimodule.order.flow.OrderFlowDirections

@EntryPoint
@InstallIn(OrderFlowComponent::class)
interface OrderFlowEntryPoint {
    fun globalRouter(): Router
    fun profileRepo(): ProfileRepo

    @Flow
    fun flowRouter(): Router

    @Flow
    fun navigatorHolder(): NavigatorHolder

    fun orderFlowNavigation(): NavigationApi<OrderFlowDirections>
}