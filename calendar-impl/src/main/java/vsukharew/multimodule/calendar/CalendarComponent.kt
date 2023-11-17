package vsukharew.multimodule.calendar

import com.github.terrakok.cicerone.Router
import dagger.Component
import vsukharew.multimodule.calendar_api.CalendarApi
import javax.inject.Singleton

@Singleton
@Component(modules = [CalendarModule::class], dependencies = [Router::class])
interface CalendarComponent {
    @Component.Factory
    interface Factory {
        fun create(router: Router): CalendarComponent
    }
    fun calendarApi(): CalendarApi
}