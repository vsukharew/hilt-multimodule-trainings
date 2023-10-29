package vsukharew.multimodule.order

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory
import com.github.terrakok.cicerone.androidx.FragmentScreen

class OrderFlowScreen : FragmentScreen {
    override fun createFragment(factory: FragmentFactory): Fragment {
        return OrderFlowFragment()
    }
}