package app.nunome.sary.webapi

import retrofit2.http.GET
import retrofit2.http.Path

interface UserService {

    @GET("users/{userId}")
    suspend fun getUser(@Path("userId") userId: String): User
}