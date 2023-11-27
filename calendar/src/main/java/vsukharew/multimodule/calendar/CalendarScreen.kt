package vsukharew.multimodule.calendar

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentFactory
import com.github.terrakok.cicerone.androidx.FragmentScreen
import vsukharew.multimodule.calendar.CalendarFragment

class CalendarScreen : FragmentScreen {
    override fun createFragment(factory: FragmentFactory): Fragment {
        return CalendarFragment()
    }
}