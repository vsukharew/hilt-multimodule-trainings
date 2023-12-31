package vsukharew.multimodule.order.flow.di

import com.github.terrakok.cicerone.NavigatorHolder
import com.github.terrakok.cicerone.Router
import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn
import vsukharew.multimodule.coreapi.data.ProfileRepo
import vsukharew.multimodule.di.Flow

@EntryPoint
@InstallIn(OrderFlowComponent::class)
internal interface OrderFlowEntryPoint {
    fun globalRouter(): Router
    fun profileRepo(): ProfileRepo

    @Flow
    fun flowRouter(): Router

    @Flow
    fun navigatorHolder(): NavigatorHolder
}