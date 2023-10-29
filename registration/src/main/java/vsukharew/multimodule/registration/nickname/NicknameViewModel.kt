package vsukharew.multimodule.registration.nickname

import androidx.lifecycle.ViewModel
import com.github.terrakok.cicerone.Router
import dagger.hilt.android.lifecycle.HiltViewModel
import vsukharew.multimodule.registration.birthdate.BirthDateScreen
import javax.inject.Inject

@HiltViewModel
class NicknameViewModel @Inject constructor(
    private val globalRouter: Router,
    private val flowRouter: Router,
) : ViewModel() {

    fun back() {
        globalRouter.exit()
    }

    fun next() {
        flowRouter.navigateTo(BirthDateScreen())
    }
}