package vsukharew.multimodule.calendar

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped
import vsukharew.multimodule.navigationapi.CalendarRouter

@Module
@InstallIn(ViewModelComponent::class)
internal interface CalendarModule {
    @Binds
    @ViewModelScoped
    fun bindCalendarInteractor(impl: CalendarInteractorImpl): CalendarInteractor

    @Binds
    @ViewModelScoped
    fun bindCalendarRouter(impl: CalendarNavigation): CalendarRouter
}