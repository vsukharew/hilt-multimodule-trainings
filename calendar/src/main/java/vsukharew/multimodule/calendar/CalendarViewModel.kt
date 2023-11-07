package vsukharew.multimodule.calendar

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import vsukharew.multimodule.navigationapi.NavigationApi
import javax.inject.Inject

@HiltViewModel
class CalendarViewModel @Inject constructor(
    private val navigationApi: NavigationApi<CalendarDirections>,
) : ViewModel() {

    fun back() {
        navigationApi.navigateTo(CalendarDirections.Back)
    }
}