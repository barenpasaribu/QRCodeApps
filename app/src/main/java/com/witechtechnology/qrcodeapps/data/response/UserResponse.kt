package com.witechtechnology.qrcodeapps.data.response

data class UserResponse(
    val meta: Meta,
    val success: Boolean,
    val data: Data?
) {
    data class Data(
        val access_token: String,
        val expires_in: String,
        val refresh_token: String,
        val token_type: String
    )

    data class Meta(
        val message: String
    )
}
