package vsukharew.multimodule.ui

import androidx.lifecycle.ViewModel
import com.github.terrakok.cicerone.Router
import com.github.terrakok.cicerone.androidx.FragmentScreen

abstract class BaseFlowViewModel (
    protected val flowRouter: Router,
) : ViewModel() {

    abstract val startScreen: FragmentScreen

    fun startFlow() {
        flowRouter.navigateTo(startScreen)
    }
}