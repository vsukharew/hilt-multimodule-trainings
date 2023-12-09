package vsukharew.multimodule.registration.nickname

import androidx.lifecycle.ViewModel
import com.github.terrakok.cicerone.Router
import vsukharew.multimodule.registration.birthdate.BirthDateScreen

internal class NicknameViewModel(
    private val flowRouter: Router
) : ViewModel() {

    fun back() {
        flowRouter.exit()
    }

    fun next() {
        flowRouter.navigateTo(BirthDateScreen())
    }
}