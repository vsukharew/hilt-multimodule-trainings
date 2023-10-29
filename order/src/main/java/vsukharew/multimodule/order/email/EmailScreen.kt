package vsukharew.multimodule.order.email

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory
import com.github.terrakok.cicerone.androidx.FragmentScreen

object EmailScreen : FragmentScreen {
    override fun createFragment(factory: FragmentFactory): Fragment {
        return EmailFragment()
    }
}
