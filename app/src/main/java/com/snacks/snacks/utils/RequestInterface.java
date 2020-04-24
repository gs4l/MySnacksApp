package com.snacks.snacks.utils;

import com.snacks.snacks.models.GeneralResponseModel;
import com.snacks.snacks.models.HomeModel;
import com.snacks.snacks.models.OtpModel;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;
import retrofit2.http.Query;

public interface RequestInterface {

    @GET("api/home")
    Call<HomeModel> getHomeData(
            @Query("id") int id
    );

    @Multipart
    @POST("api/login")
    Call<GeneralResponseModel> login(
            @Part("name") String uname,
            @Part("password") String passwd
    );

    @GET("api/getsnack")
    Call<OtpModel> getOtp(
            @Query("id") int id
    );
}
