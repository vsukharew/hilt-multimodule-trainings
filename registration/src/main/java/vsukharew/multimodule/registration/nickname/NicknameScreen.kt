package vsukharew.multimodule.registration.nickname

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory
import com.github.terrakok.cicerone.androidx.FragmentScreen
import vsukharew.multimodule.registration.nickname.NicknameFragment

class NicknameScreen : FragmentScreen {
    override fun createFragment(factory: FragmentFactory): Fragment {
        return NicknameFragment()
    }
}