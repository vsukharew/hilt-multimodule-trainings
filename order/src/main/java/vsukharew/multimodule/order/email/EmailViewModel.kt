package vsukharew.multimodule.order.email

import androidx.lifecycle.ViewModel
import com.github.terrakok.cicerone.Router
import dagger.hilt.android.lifecycle.HiltViewModel
import vsukharew.multimodule.order.address.AddressScreen
import javax.inject.Inject

@HiltViewModel
class EmailViewModel @Inject constructor(private val flowRouter: Router) : ViewModel() {

    fun next() {
        flowRouter.navigateTo(AddressScreen)
    }
}