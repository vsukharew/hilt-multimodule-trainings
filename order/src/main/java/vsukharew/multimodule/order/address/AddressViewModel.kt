package vsukharew.multimodule.order.address

import androidx.lifecycle.ViewModel
import com.github.terrakok.cicerone.Router

class AddressViewModel(
    private val globalRouter: Router
) : ViewModel() {

    fun createOrder() {
        globalRouter.exit()
    }
}