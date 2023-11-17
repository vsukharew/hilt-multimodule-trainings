package vsukharew.multimodule.hilt

import com.github.terrakok.cicerone.Cicerone
import com.github.terrakok.cicerone.Router
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped
import vsukharew.multimodule.calendar.CalendarComponent
import vsukharew.multimodule.calendar.DaggerCalendarComponent
import vsukharew.multimodule.calendar_api.CalendarApi

@Module
@InstallIn(ViewModelComponent::class)
internal class CalendarApiProxyModule {
    // Pass as method args any dependencies from :app you need to build component
    @Provides
    @ViewModelScoped
    fun calendarNavigationApiComponent(cicerone: Cicerone<Router>): CalendarComponent {
        return DaggerCalendarComponent.factory()
            .create(cicerone.router)
    }

    @Provides
    @ViewModelScoped
    fun calendarApi(calendarComponent: CalendarComponent): CalendarApi {
        return calendarComponent.calendarApi()
    }
}