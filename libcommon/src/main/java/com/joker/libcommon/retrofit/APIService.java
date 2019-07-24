package com.joker.libcommon.retrofit;


import com.joker.libcommon.LatestMovie;

import io.reactivex.Flowable;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface APIService {

    @POST("v2/movie/in_theaters")
    @FormUrlEncoded
    Flowable<LatestMovie> getHomeData(
            @Field("start") String start,
            @Field("count") String count,
            @Field("apikey") String apikey
    );
}
