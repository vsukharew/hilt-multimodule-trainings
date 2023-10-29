package vsukharew.multimodule.ui

import android.os.Bundle
import android.view.View
import androidx.annotation.IdRes
import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment
import com.github.terrakok.cicerone.Navigator
import com.github.terrakok.cicerone.NavigatorHolder
import com.github.terrakok.cicerone.androidx.AppNavigator

abstract class BaseFlowFragment<VM : BaseFlowViewModel>(@LayoutRes layoutResId: Int) :
    Fragment(layoutResId) {

    @get:IdRes
    abstract val containerId: Int
    abstract val viewModel: VM
    abstract val navigatorHolder: NavigatorHolder

    private val navigator by lazy {
        AppNavigator(requireActivity(), containerId, childFragmentManager)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        childFragmentManager.findFragmentById(containerId) ?: viewModel.startFlow()
    }

    override fun onResume() {
        super.onResume()
        navigatorHolder.setNavigator(navigator)
    }

    override fun onPause() {
        super.onPause()
        navigatorHolder.removeNavigator()
    }
}