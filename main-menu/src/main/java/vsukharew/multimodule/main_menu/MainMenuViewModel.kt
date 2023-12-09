package vsukharew.multimodule.main_menu

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import vsukharew.multimodule.calendar_api.CalendarRouter
import vsukharew.multimodule.order_api.OrderRouter
import vsukharew.multimodule.registration_api.RegistrationRouter
import javax.inject.Inject

@HiltViewModel
internal class MainMenuViewModel @Inject constructor(
    private val registrationRouter: RegistrationRouter,
    private val orderRouter: OrderRouter,
    private val calendarRouter: CalendarRouter
) : ViewModel() {

    fun order() {
        orderRouter.startOrderFlow()
    }

    fun registration() {
        registrationRouter.navigateToRegistration()
    }

    fun calendar() {
        calendarRouter.startCalendar()
    }
}