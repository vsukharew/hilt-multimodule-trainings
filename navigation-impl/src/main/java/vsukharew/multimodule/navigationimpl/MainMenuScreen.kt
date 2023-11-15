package vsukharew.multimodule.navigationimpl

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory
import com.github.terrakok.cicerone.androidx.FragmentScreen
import vsukharew.multimodule.main_menu.MainMenuFragment

class MainMenuScreen : FragmentScreen {
    override fun createFragment(factory: FragmentFactory): Fragment {
        return MainMenuFragment()
    }
}