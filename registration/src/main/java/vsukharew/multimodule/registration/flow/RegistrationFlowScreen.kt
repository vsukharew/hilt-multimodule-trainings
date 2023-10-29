package vsukharew.multimodule.registration.flow

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory
import com.github.terrakok.cicerone.androidx.FragmentScreen

class RegistrationFlowScreen : FragmentScreen {
    override fun createFragment(factory: FragmentFactory): Fragment {
        return RegistrationFlowFragment()
    }
}