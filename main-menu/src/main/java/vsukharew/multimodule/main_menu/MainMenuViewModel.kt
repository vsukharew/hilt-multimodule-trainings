package vsukharew.multimodule.main_menu

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import vsukharew.multimodule.calendar_api.CalendarApi
import vsukharew.multimodule.navigationapi.NavigationApi
import vsukharew.multimodule.order_api.OrderApi
import javax.inject.Inject

@HiltViewModel
class MainMenuViewModel @Inject constructor(
    private val navigationApi: NavigationApi<MainMenuDirections>,
    private val orderApi: OrderApi,
    private val calendarApi: CalendarApi
) : ViewModel() {

    fun settings() {
        orderApi.startOrderFlow()
    }

    fun registration() {
        navigationApi.navigateTo(MainMenuDirections.MainMenuScreen.ToRegistration)
    }

    fun calendar() {
        calendarApi.startCalendar()
    }
}