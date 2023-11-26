package vsukharew.multimodule.registration.flow

import com.github.terrakok.cicerone.Router
import vsukharew.multimodule.navigationapi.NavigationApi
import vsukharew.multimodule.registration.birthdate.BirthDateScreen
import vsukharew.multimodule.registration.nickname.NicknameScreen

class RegistrationFlowNavigation(
    private val globalRouter: Router,
    private val flowRouter: Router
) : NavigationApi<RegistrationFlowDirections> {
    override fun navigateTo(direction: RegistrationFlowDirections) {
        when (direction) {
            is RegistrationFlowDirections.RegistrationFlowScreen.FirstScreenInFlow -> {
                flowRouter.navigateTo(NicknameScreen())
            }
            is RegistrationFlowDirections.NicknameScreen.Next -> {
                flowRouter.navigateTo(BirthDateScreen())
            }
            is RegistrationFlowDirections.NicknameScreen.Back -> {
                globalRouter.exit()
            }
            RegistrationFlowDirections.BirthDateScreen.Next -> {
                globalRouter.exit()
            }
            RegistrationFlowDirections.BirthDateScreen.Back -> {
                flowRouter.exit()
            }
        }
    }
}