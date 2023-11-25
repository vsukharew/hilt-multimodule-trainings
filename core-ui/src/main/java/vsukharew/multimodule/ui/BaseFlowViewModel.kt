package vsukharew.multimodule.ui

import androidx.lifecycle.ViewModel
import com.github.terrakok.cicerone.Router
import com.github.terrakok.cicerone.androidx.FragmentScreen

abstract class BaseFlowViewModel<S : FragmentScreen>(
    protected val flowRouter: Router,
) : ViewModel() {

    abstract val startScreen: S

    fun startFlow() {
        flowRouter.navigateTo(startScreen)
    }
}