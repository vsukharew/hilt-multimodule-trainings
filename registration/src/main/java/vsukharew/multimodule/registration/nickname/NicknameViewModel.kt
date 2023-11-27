package vsukharew.multimodule.registration.nickname

import androidx.lifecycle.ViewModel
import com.github.terrakok.cicerone.Router
import vsukharew.multimodule.registration.birthdate.BirthDateScreen

class NicknameViewModel(
    private val flowRouter: Router,
    private val globalRouter: Router,
) : ViewModel() {

    fun back() {
        globalRouter.exit()
    }

    fun next() {
        flowRouter.navigateTo(BirthDateScreen())
    }
}