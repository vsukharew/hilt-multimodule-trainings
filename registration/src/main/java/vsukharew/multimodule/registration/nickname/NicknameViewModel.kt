package vsukharew.multimodule.registration.nickname

import androidx.lifecycle.ViewModel
import vsukharew.multimodule.navigationapi.NavigationApi
import vsukharew.multimodule.registration.flow.RegistrationFlowDirections

class NicknameViewModel(
    private val navigationApi: NavigationApi<RegistrationFlowDirections>
) : ViewModel() {

    fun back() {
        navigationApi.navigateTo(RegistrationFlowDirections.NicknameScreen.Back)
    }

    fun next() {
        navigationApi.navigateTo(RegistrationFlowDirections.NicknameScreen.Next)
    }
}