package com.example.exmaps;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("?results=20")
    Call<UserResponse> getUsers();
}
