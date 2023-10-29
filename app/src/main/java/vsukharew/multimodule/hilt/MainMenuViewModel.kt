package vsukharew.multimodule.hilt

import androidx.lifecycle.ViewModel
import com.github.terrakok.cicerone.Router
import dagger.hilt.android.lifecycle.HiltViewModel
import vsukharew.multimodule.registration.flow.RegistrationFlowScreen
import vsukharew.multimodule.order.OrderFlowScreen
import javax.inject.Inject

@HiltViewModel
class MainMenuViewModel @Inject constructor(
    private val router: Router
) : ViewModel() {

    fun settings() {
        router.navigateTo(OrderFlowScreen())
    }

    fun registration() {
        router.navigateTo(RegistrationFlowScreen())
    }
}