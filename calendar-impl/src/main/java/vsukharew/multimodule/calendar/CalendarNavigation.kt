package vsukharew.multimodule.calendar

import com.github.terrakok.cicerone.Router
import vsukharew.multimodule.calendar_api.CalendarApi
import javax.inject.Inject

class CalendarNavigation @Inject constructor(
    private val router: Router
) : CalendarApi {
    override fun startCalendar() {
        router.navigateTo(CalendarScreen())
    }
}