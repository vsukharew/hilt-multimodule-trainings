package vsukharew.multimodule.registration.flow

import com.github.terrakok.cicerone.Router
import vsukharew.multimodule.registration_api.RegistrationRouter
import javax.inject.Inject

class RegistrationNavigation @Inject constructor(private val router: Router) : RegistrationRouter {
    override fun navigateToRegistration() {
        router.navigateTo(RegistrationFlowScreen())
    }
}