package com.unitomega.reddit_test_app;

import com.unitomega.reddit_test_app.model.Post_simple;

import retrofit2.Call;
import retrofit2.http.GET;


public interface PostAPI {

    String BASE_URL = "top/.json?count=50?sr_detail";

    @GET(BASE_URL)
    Call<Post_simple> getPosts();

}
