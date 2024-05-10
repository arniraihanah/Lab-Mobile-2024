package com.example.praktikum6;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiService {

    @GET("api/users")
    Call<UserResponse> getUsers(@Query("page") int page, @Query("per_page") int per_page); //dia cari atribut di url webnya

    //id adalah placeholder yang akan diganti dengan nilai ID yang diberikan saat panggilan metode ini.
    @GET("api/users/{id}")
    Call<DetailResponse> getUserById(@Path("id") int userId); //langsung value
}
