package vsukharew.multimodule.registration.birthdate

import androidx.lifecycle.ViewModel
import com.github.terrakok.cicerone.Router

class BirthDateViewModel(
    private val globalRouter: Router,
    private val flowRouter: Router,
) : ViewModel() {

    fun signUp() {
        globalRouter.exit()
    }

    fun back() {
        flowRouter.exit()
    }
}