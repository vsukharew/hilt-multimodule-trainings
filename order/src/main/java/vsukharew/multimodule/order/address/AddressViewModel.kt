package vsukharew.multimodule.order.address

import androidx.lifecycle.ViewModel
import com.github.terrakok.cicerone.Router
import dagger.hilt.android.lifecycle.HiltViewModel
import vsukharew.multimodule.coreapi.data.ProfileRepo
import javax.inject.Inject

@HiltViewModel
class AddressViewModel @Inject constructor(
    private val globalRouter: Router,
    private val profileRepo: ProfileRepo,
) : ViewModel() {

    fun createOrder() {
        profileRepo.getProfile()
        globalRouter.exit()
    }
}