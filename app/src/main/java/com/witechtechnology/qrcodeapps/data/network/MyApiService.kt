package com.witechtechnology.qrcodeapps.data.network

import com.witechtechnology.qrcodeapps.data.response.TalentResponse
import com.witechtechnology.qrcodeapps.data.response.UserResponse
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.Header
import retrofit2.http.POST

interface MyApiService {
    @FormUrlEncoded
    @POST("scan")
    fun getInfoTalent(
        @Header("Authorization") token: String,
        @Field("code") code: String
    ): Call<TalentResponse>

    @FormUrlEncoded
    @POST("auth/login")
    fun login(
        @Field("username") username: String,
        @Field("password") password: String
    ): Call<UserResponse>
}