package vsukharew.multimodule.hilt

import com.github.terrakok.cicerone.Cicerone
import com.github.terrakok.cicerone.Router
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped
import vsukharew.multimodule.order.flow.di.DaggerOrderApiComponent
import vsukharew.multimodule.order.flow.di.OrderApiComponent
import vsukharew.multimodule.order_api.OrderRouter

@Module
@InstallIn(ViewModelComponent::class)
internal object OrderApiProxyModule {
    @Provides
    @ViewModelScoped
    fun provideOrderFlowApiComponent(cicerone: Cicerone<Router>): OrderApiComponent {
        return DaggerOrderApiComponent.factory()
            .create(cicerone.router)
    }

    @Provides
    @ViewModelScoped
    fun provideOrderRouter(orderFlowComponent: OrderApiComponent): OrderRouter {
        return orderFlowComponent.orderRouter()
    }
}