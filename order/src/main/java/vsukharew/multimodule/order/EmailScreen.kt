package vsukharew.multimodule.order

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory
import com.github.terrakok.cicerone.androidx.FragmentScreen

object EmailScreen : FragmentScreen {
    override fun createFragment(factory: FragmentFactory): Fragment {
        return EmailFragment()
    }
}
