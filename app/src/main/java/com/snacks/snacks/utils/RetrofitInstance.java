package com.snacks.snacks.utils;

import retrofit2.Retrofit;
public class RetrofitInstance {

    private static final String BASE_URL = Constants.BASE_URL;

    private static Retrofit retrofit;

    private static Retrofit getRetrofitInstance(){

        if (retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .build();
        }

        return retrofit;
    }

    public static <S> S createService(Class<S> serviceClass){
        return getRetrofitInstance().create(serviceClass);
    }

}
