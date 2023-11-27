package vsukharew.multimodule.main_menu

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import vsukharew.multimodule.navigationapi.CalendarRouter
import vsukharew.multimodule.navigationapi.OrderRouter
import vsukharew.multimodule.navigationapi.RegistrationRouter
import javax.inject.Inject

@HiltViewModel
class MainMenuViewModel @Inject constructor(
    private val calendarRouter: CalendarRouter,
    private val orderRouter: OrderRouter,
    private val registrationRouter: RegistrationRouter,
) : ViewModel() {

    fun order() {
        orderRouter.navigateToOrder()
    }

    fun registration() {
        registrationRouter.navigateToRegistration()
    }

    fun calendar() {
        calendarRouter.navigateToCalendar()
    }
}