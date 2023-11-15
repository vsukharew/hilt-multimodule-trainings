package vsukharew.multimodule.navigationimpl

import com.github.terrakok.cicerone.Router
import vsukharew.multimodule.main_menu.MainMenuDirections
import vsukharew.multimodule.navigationapi.NavigationApi
import vsukharew.multimodule.order.flow.OrderFlowScreen
import vsukharew.multimodule.registration.flow.RegistrationFlowScreen
import javax.inject.Inject

class MainMenuNavigation @Inject constructor(
    private val router: Router
) : NavigationApi<MainMenuDirections> {

    override fun navigateTo(direction: MainMenuDirections) {
        val screen = when (direction) {
            is MainMenuDirections.MainMenuScreen.ToCalendar -> {
                CalendarScreen()
            }
            is MainMenuDirections.MainMenuScreen.ToOrder -> {
                OrderFlowScreen()
            }
            is MainMenuDirections.MainMenuScreen.ToRegistration -> {
                RegistrationFlowScreen()
            }
        }
        router.navigateTo(screen)
    }
}