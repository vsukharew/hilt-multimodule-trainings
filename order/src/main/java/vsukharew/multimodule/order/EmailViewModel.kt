package vsukharew.multimodule.order

import androidx.lifecycle.ViewModel
import com.github.terrakok.cicerone.Router
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class EmailViewModel @Inject constructor(private val flowRouter: Router) : ViewModel() {

    fun next() {
        flowRouter.navigateTo(AddressScreen)
    }
}