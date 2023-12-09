package vsukharew.multimodule.registration.birthdate

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory
import com.github.terrakok.cicerone.androidx.FragmentScreen

internal class BirthDateScreen : FragmentScreen {
    override fun createFragment(factory: FragmentFactory): Fragment = BirthDateFragment()
}