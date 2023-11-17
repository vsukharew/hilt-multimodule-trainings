package vsukharew.multimodule.calendar

import dagger.Binds
import dagger.Module
import dagger.hilt.migration.DisableInstallInCheck
import vsukharew.multimodule.calendar_api.CalendarApi
import javax.inject.Singleton

@Module
@DisableInstallInCheck
interface CalendarModule {

    @Binds
    @Singleton
    fun bindCalendarInteractor(impl: CalendarInteractorImpl): CalendarInteractor

    @Binds
    @Singleton
    fun bindCalendarApi(impl: CalendarNavigation): CalendarApi
}