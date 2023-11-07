package vsukharew.multimodule.navigationapi

interface NavigationApi<D> {
    fun navigateTo(direction: D)
}