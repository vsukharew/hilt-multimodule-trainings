package vsukharew.multimodule.order.address

import androidx.lifecycle.ViewModel
import com.github.terrakok.cicerone.Router


internal class AddressViewModel(
    private val globalRouter: Router,
    private val flowRouter: Router
) : ViewModel() {

    fun back() {
        flowRouter.exit()
    }

    fun createOrder() {
        globalRouter.exit()
    }
}