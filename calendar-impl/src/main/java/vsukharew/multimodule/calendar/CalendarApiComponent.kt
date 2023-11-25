package vsukharew.multimodule.calendar

import com.github.terrakok.cicerone.Router
import dagger.Component
import vsukharew.multimodule.calendar_api.CalendarRouter
import javax.inject.Singleton

@Singleton
@Component(modules = [CalendarApiModule::class], dependencies = [Router::class])
interface CalendarApiComponent {
    @Component.Factory
    interface Factory {
        fun create(router: Router): CalendarApiComponent
    }
    fun calendarRouter(): CalendarRouter
}