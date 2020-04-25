package com.snacks.snacks.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance {

    private static final String BASE_URL = Constants.BASE_URL;

    private static Retrofit retrofit;

    private static Gson gson = new GsonBuilder().create();

    private static Retrofit getRetrofitInstance(){

        if (retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .build();
        }

        return retrofit;
    }

    public static <S> S createService(Class<S> serviceClass){
        return getRetrofitInstance().create(serviceClass);
    }

}
