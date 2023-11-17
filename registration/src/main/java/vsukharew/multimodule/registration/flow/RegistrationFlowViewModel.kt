package vsukharew.multimodule.registration.flow

import androidx.lifecycle.SavedStateHandle
import vsukharew.multimodule.navigationapi.NavigationApi
import vsukharew.multimodule.ui.BaseFlowViewModelLegacy
import javax.inject.Inject

class RegistrationFlowViewModel @Inject constructor(
    navigationApi: NavigationApi<RegistrationFlowDirections>,
    private val savedStateHandle: SavedStateHandle,
): BaseFlowViewModelLegacy<RegistrationFlowDirections>(navigationApi) {
    override val startScreen: RegistrationFlowDirections
        get() = RegistrationFlowDirections.RegistrationFlowScreen.FirstScreenInFlow
}