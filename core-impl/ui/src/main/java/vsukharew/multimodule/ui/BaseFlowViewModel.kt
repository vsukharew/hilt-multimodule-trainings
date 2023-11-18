package vsukharew.multimodule.ui

import androidx.lifecycle.ViewModel
import vsukharew.multimodule.navigationapi.NavigationApi

abstract class BaseFlowViewModel<S>(
//    protected val flowRouter: Router,
    protected val navigationApi: NavigationApi<S>
) : ViewModel() {

    abstract val startScreen: S

    fun startFlow() {
        navigationApi.navigateTo(startScreen)
//        flowRouter.navigateTo(startScreen)
    }
}