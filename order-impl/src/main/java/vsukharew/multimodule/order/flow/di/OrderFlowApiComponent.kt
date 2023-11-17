package vsukharew.multimodule.order.flow.di

import com.github.terrakok.cicerone.Router
import dagger.Component
import vsukharew.multimodule.order_api.OrderApi
import javax.inject.Singleton

@Singleton
@Component(modules = [OrderApiModule::class], dependencies = [Router::class])
interface OrderFlowApiComponent {
    @Component.Factory
    interface Factory {
        fun create(router: Router): OrderFlowApiComponent
    }
    fun orderApi(): OrderApi
}