package vsukharew.multimodule.order.flow.di

import dagger.Binds
import dagger.Module
import dagger.hilt.migration.DisableInstallInCheck
import vsukharew.multimodule.di.PerFeature
import vsukharew.multimodule.order.flow.OrderNavigation
import vsukharew.multimodule.order_api.OrderApi
import javax.inject.Singleton

@Module
@DisableInstallInCheck
interface OrderApiModule {
    @Binds
    @Singleton
    fun bindOrderFlowNavigation(navigation: OrderNavigation): OrderApi
}