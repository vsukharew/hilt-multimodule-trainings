package vsukharew.multimodule.order.email

import androidx.lifecycle.ViewModel
import com.github.terrakok.cicerone.Router
import vsukharew.multimodule.order.address.AddressScreen

internal class EmailViewModel(
    private val flowRouter: Router,
) : ViewModel() {

    fun next() {
        flowRouter.navigateTo(AddressScreen)
    }
}