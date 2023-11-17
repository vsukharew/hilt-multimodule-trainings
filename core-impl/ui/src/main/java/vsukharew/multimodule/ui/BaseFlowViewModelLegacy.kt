package vsukharew.multimodule.ui

import androidx.lifecycle.ViewModel
import vsukharew.multimodule.navigationapi.NavigationApi

abstract class BaseFlowViewModelLegacy<S>(
    protected val navigationApi: NavigationApi<S>
) : ViewModel() {

    abstract val startScreen: S

    fun startFlow() {
        navigationApi.navigateTo(startScreen)
    }
}