package vsukharew.multimodule.calendar

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped

@Module
@InstallIn(ViewModelComponent::class)
interface CalendarModule {

    @Binds
    @ViewModelScoped
    fun bindCalendarInteractor(impl: CalendarInteractorImpl): CalendarInteractor
}