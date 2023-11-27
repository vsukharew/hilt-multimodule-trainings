package vsukharew.multimodule.registration.flow

import androidx.lifecycle.SavedStateHandle
import com.github.terrakok.cicerone.Router
import vsukharew.multimodule.registration.nickname.NicknameScreen
import vsukharew.multimodule.ui.BaseFlowViewModel
import javax.inject.Inject

class RegistrationFlowViewModel @Inject constructor(
    flowRouter: Router,
    private val savedStateHandle: SavedStateHandle,
): BaseFlowViewModel<NicknameScreen>(flowRouter) {
    override val startScreen: NicknameScreen = NicknameScreen()
}