package vsukharew.multimodule.calendar

import dagger.Binds
import dagger.Module
import dagger.hilt.migration.DisableInstallInCheck
import vsukharew.multimodule.calendar_api.CalendarRouter
import javax.inject.Singleton

@Module
@DisableInstallInCheck
interface CalendarApiModule {

    @Binds
    @Singleton
    fun bindCalendarRouter(impl: CalendarNavigation): CalendarRouter
}