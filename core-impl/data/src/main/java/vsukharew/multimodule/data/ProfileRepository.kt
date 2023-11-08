package vsukharew.multimodule.data

import vsukharew.multimodule.coreapi.data.ProfileRepo
import java.util.UUID
import javax.inject.Inject

class ProfileRepository @Inject constructor() : ProfileRepo {
    private val id = UUID.randomUUID()

    override fun getProfile() {
        id.toString()
    }
}