package vsukharew.multimodule.ui

import androidx.lifecycle.ViewModel

fun <T> ViewModel.factoryCast(): T {
    @Suppress("UNCHECKED_CAST")
    // needed for viewModel factories
    return this as T
}