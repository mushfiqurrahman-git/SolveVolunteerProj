package com.example.myapplication;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JsonPlaceHolderApi {

    @GET("1ctklg")

    Call<List<Post>> getPosts();
}
