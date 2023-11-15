package vsukharew.multimodule.main_menu

sealed class MainMenuDirections {
    sealed class MainMenuScreen : MainMenuDirections() {
        data object ToCalendar : MainMenuScreen()
        data object ToOrder : MainMenuScreen()
        data object ToRegistration : MainMenuScreen()
    }
}
