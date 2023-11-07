package vsukharew.multimodule.registration.birthdate

import androidx.lifecycle.ViewModel
import vsukharew.multimodule.navigationapi.NavigationApi
import vsukharew.multimodule.registration.flow.RegistrationFlowDirections

class BirthDateViewModel(
    private val navigationApi: NavigationApi<RegistrationFlowDirections>,
) : ViewModel() {

    fun signUp() {
        navigationApi.navigateTo(RegistrationFlowDirections.BirthDateScreen.Next)
    }
}