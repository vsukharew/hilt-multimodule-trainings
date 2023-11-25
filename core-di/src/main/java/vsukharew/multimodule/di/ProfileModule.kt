package vsukharew.multimodule.di

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import vsukharew.multimodule.coreapi.data.ProfileRepo
import vsukharew.multimodule.data.ProfileRepository
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
interface ProfileModule {

    @Binds
    @Singleton
    fun bindProfileRepo(profileRepository: ProfileRepository): ProfileRepo
}