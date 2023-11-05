package vsukharew.multimodule.data

import vsukharew.multimodule.coreapi.data.ProfileRepo
import java.util.UUID
import javax.inject.Inject

class ProfileRepository @Inject constructor(
    private val excessiveCompilation: ExcessiveCompilation,
    private val excessiveCompilation2: ExcessiveCompilation2,
) : ProfileRepo {
    private val id = UUID.randomUUID()

    override fun getProfile() {
        excessiveCompilation.toString()
        id.toString()
    }
}

class ExcessiveCompilation @Inject constructor() {
    private var i = 0
}

class ExcessiveCompilation2 @Inject constructor() {
    private var i = 0
}