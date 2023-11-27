package vsukharew.multimodule.calendar

import com.github.terrakok.cicerone.Router
import vsukharew.multimodule.navigationapi.CalendarRouter
import javax.inject.Inject

class CalendarNavigation @Inject constructor(private val router: Router) : CalendarRouter {
    override fun navigateToCalendar() {
        router.navigateTo(CalendarScreen())
    }
}