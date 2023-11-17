package vsukharew.multimodule.order.address

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory
import com.github.terrakok.cicerone.androidx.FragmentScreen

object AddressScreen : FragmentScreen {
    override fun createFragment(factory: FragmentFactory): Fragment {
        return AddressFragment()
    }
}