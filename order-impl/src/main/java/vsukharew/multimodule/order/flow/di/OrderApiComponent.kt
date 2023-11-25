package vsukharew.multimodule.order.flow.di

import com.github.terrakok.cicerone.Router
import dagger.Component
import vsukharew.multimodule.order_api.OrderRouter
import javax.inject.Singleton

@Singleton
@Component(modules = [OrderApiModule::class], dependencies = [Router::class])
interface OrderApiComponent {
    @Component.Factory
    interface Factory {
        fun create(router: Router): OrderApiComponent
    }
    fun orderRouter(): OrderRouter
}