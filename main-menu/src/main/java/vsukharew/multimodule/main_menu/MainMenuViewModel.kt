package vsukharew.multimodule.main_menu

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import vsukharew.multimodule.calendar_api.CalendarApi
import vsukharew.multimodule.order_api.OrderApi
import vsukharew.multimodule.registration_api.RegistrationRouter
import javax.inject.Inject

@HiltViewModel
class MainMenuViewModel @Inject constructor(
    private val registrationRouter: RegistrationRouter,
    private val orderApi: OrderApi,
    private val calendarApi: CalendarApi
) : ViewModel() {

    fun order() {
        orderApi.startOrderFlow()
    }

    fun registration() {
        registrationRouter.navigateToRegistration()
    }

    fun calendar() {
        calendarApi.startCalendar()
    }
}