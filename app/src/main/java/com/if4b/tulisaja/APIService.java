//02
package com.if4b.tulisaja;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface APIService {
    @FormUrlEncoded
    @POST("getAllPost")
    Call<ValueData<List<Post>>> getPost(@Field("key") String key);

    @FormUrlEncoded
    @POST("loginUser")
    Call<ValueNoData> login(@Field("key") String key,
                            @Field("username")String username,
                            @Field("password")String password);
    @FormUrlEncoded
    @POST("RegisterUser")
    Call<ValueNoData> register(@Field("key") String key,
                            @Field("username")String username,
                            @Field("password")String password);

    @FormUrlEncoded
    @POST("insertPost")
    Call<ValueNoData> addPost(@Field("key") String key,
                               @Field("username")String username,
                               @Field("content")String content);


}
