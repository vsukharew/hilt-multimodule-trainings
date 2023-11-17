package vsukharew.multimodule.hilt

import com.github.terrakok.cicerone.Cicerone
import com.github.terrakok.cicerone.Router
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.android.scopes.ViewModelScoped
import vsukharew.multimodule.order.flow.di.DaggerOrderFlowApiComponent
import vsukharew.multimodule.order.flow.di.OrderFlowApiComponent
import vsukharew.multimodule.order_api.OrderApi

@Module
@InstallIn(ViewModelComponent::class)
internal object OrderApiProxyModule {
    @Provides
    @ViewModelScoped
    fun provideOrderFlowApiComponent(cicerone: Cicerone<Router>): OrderFlowApiComponent {
        return DaggerOrderFlowApiComponent.factory()
            .create(cicerone.router)
    }

    @Provides
    @ViewModelScoped
    fun provideOrderApi(orderFlowComponent: OrderFlowApiComponent): OrderApi {
        return orderFlowComponent.orderApi()
    }
}