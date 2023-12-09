package vsukharew.multimodule.registration.birthdate

import androidx.lifecycle.ViewModel
import com.github.terrakok.cicerone.Router

internal class BirthDateViewModel(
    private val globalRouter: Router,
) : ViewModel() {

    fun signUp() {
        globalRouter.exit()
    }
}