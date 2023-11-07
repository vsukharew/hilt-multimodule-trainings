package vsukharew.multimodule.navigationimpl

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped
import vsukharew.multimodule.calendar.CalendarDirections
import vsukharew.multimodule.navigationapi.NavigationApi

@Module
@InstallIn(ViewModelComponent::class)
interface CalendarNavigationModule {

    @Binds
    @ViewModelScoped
    fun provideCalendarNavigationApi(impl: CalendarNavigation): NavigationApi<CalendarDirections>
}