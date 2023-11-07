package vsukharew.multimodule.order.email

import androidx.lifecycle.ViewModel
import com.github.terrakok.cicerone.Router
import dagger.hilt.android.lifecycle.HiltViewModel
import vsukharew.multimodule.navigationapi.NavigationApi
import vsukharew.multimodule.order.address.AddressScreen
import vsukharew.multimodule.order.flow.OrderFlowDirections
import javax.inject.Inject

class EmailViewModel(
    private val navigationApi: NavigationApi<OrderFlowDirections>
) : ViewModel() {

    fun next() {
        navigationApi.navigateTo(OrderFlowDirections.EmailScreen.Next)
    }
}