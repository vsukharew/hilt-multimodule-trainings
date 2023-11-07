package vsukharew.multimodule.order.address

import androidx.lifecycle.ViewModel
import com.github.terrakok.cicerone.Router
import dagger.hilt.android.lifecycle.HiltViewModel
import vsukharew.multimodule.coreapi.data.ProfileRepo
import vsukharew.multimodule.navigationapi.NavigationApi
import vsukharew.multimodule.order.flow.OrderFlowDirections
import javax.inject.Inject


class AddressViewModel(
    private val navigationApi: NavigationApi<OrderFlowDirections>
) : ViewModel() {

    fun createOrder() {
        navigationApi.navigateTo(OrderFlowDirections.AddressScreen.Next)
    }
}