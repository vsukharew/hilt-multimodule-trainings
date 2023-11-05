package vsukharew.multimodule.registration.flow.di

import com.github.terrakok.cicerone.NavigatorHolder
import com.github.terrakok.cicerone.Router
import dagger.hilt.EntryPoint
import dagger.hilt.InstallIn
import vsukharew.multimodule.di.Flow

@EntryPoint
@InstallIn(RegistrationFlowComponent::class)
interface RegistrationFlowEntryPoint {
    fun globalRouter(): Router

    @Flow
    fun navigatorHolder(): NavigatorHolder

    @Flow
    fun flowRouter(): Router
}