package vsukharew.multimodule.navigationimpl

import com.github.terrakok.cicerone.Router
import vsukharew.multimodule.calendar.CalendarDirections
import vsukharew.multimodule.navigationapi.NavigationApi
import javax.inject.Inject

class CalendarNavigation @Inject constructor(
    private val router: Router
) : NavigationApi<CalendarDirections> {
    override fun navigateTo(direction: CalendarDirections) {
        when (direction) {
            is CalendarDirections.Back -> router.exit()
        }
    }
}