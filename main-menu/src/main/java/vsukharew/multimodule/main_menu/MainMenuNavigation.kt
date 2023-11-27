package vsukharew.multimodule.main_menu

import com.github.terrakok.cicerone.Router
import vsukharew.multimodule.navigationapi.MainMenuRouter
import javax.inject.Inject

class MainMenuNavigation @Inject constructor(private val router: Router) : MainMenuRouter {
    override fun navigateToMainMenu() {
        router.replaceScreen(MainMenuScreen())
    }
}