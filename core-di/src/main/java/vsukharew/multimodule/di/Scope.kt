package vsukharew.multimodule.di

import javax.inject.Qualifier
import javax.inject.Scope

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class Flow

@Scope
@Retention(AnnotationRetention.BINARY)
annotation class PerFeature