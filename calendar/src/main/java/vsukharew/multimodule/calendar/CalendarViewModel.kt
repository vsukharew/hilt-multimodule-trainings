package vsukharew.multimodule.calendar

import androidx.lifecycle.ViewModel
import com.github.terrakok.cicerone.Router
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
internal class CalendarViewModel @Inject constructor(
    private val router: Router,
) : ViewModel() {
    fun back() {
        router.exit()
    }
}