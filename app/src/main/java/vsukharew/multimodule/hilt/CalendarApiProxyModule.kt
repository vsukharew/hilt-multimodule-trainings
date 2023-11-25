package vsukharew.multimodule.hilt

import com.github.terrakok.cicerone.Cicerone
import com.github.terrakok.cicerone.Router
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped
import vsukharew.multimodule.calendar.CalendarApiComponent
import vsukharew.multimodule.calendar.DaggerCalendarApiComponent
import vsukharew.multimodule.calendar_api.CalendarRouter

@Module
@InstallIn(ViewModelComponent::class)
internal class CalendarApiProxyModule {
    // Pass as method args any dependencies from :app you need to build component
    @Provides
    @ViewModelScoped
    fun calendarNavigationApiComponent(cicerone: Cicerone<Router>): CalendarApiComponent {
        return DaggerCalendarApiComponent.factory()
            .create(cicerone.router)
    }

    @Provides
    @ViewModelScoped
    fun calendarRouter(calendarApiComponent: CalendarApiComponent): CalendarRouter {
        return calendarApiComponent.calendarRouter()
    }
}