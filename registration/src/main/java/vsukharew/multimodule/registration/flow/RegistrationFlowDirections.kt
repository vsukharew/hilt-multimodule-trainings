package vsukharew.multimodule.registration.flow

sealed class RegistrationFlowDirections {
    sealed class RegistrationFlowScreen : RegistrationFlowDirections() {
        data object FirstScreenInFlow : RegistrationFlowScreen()
    }
    sealed class NicknameScreen : RegistrationFlowDirections() {
        data object Next : NicknameScreen()
        data object Back : NicknameScreen()
    }
    sealed class BirthDateScreen : RegistrationFlowDirections() {
        data object Next : BirthDateScreen()
        data object Back : BirthDateScreen()
    }
}
