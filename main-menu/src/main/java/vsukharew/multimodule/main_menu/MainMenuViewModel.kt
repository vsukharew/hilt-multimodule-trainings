package vsukharew.multimodule.main_menu

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import vsukharew.multimodule.navigationapi.NavigationApi
import javax.inject.Inject

@HiltViewModel
class MainMenuViewModel @Inject constructor(
    private val navigationApi: NavigationApi<MainMenuDirections>
) : ViewModel() {

    fun settings() {
        navigationApi.navigateTo(MainMenuDirections.MainMenuScreen.ToOrder)
    }

    fun registration() {
        navigationApi.navigateTo(MainMenuDirections.MainMenuScreen.ToRegistration)
    }

    fun calendar() {
        navigationApi.navigateTo(MainMenuDirections.MainMenuScreen.ToCalendar)
    }
}