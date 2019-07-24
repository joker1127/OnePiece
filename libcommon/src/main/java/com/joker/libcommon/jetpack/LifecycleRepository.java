package com.joker.libcommon.jetpack;


import com.joker.libcommon.base.BaseRepository;
import com.joker.libcommon.retrofit.APIService;
import com.joker.libcommon.retrofit.RetrofitManager;

public class LifecycleRepository extends BaseRepository {
   protected APIService apiService;


    public LifecycleRepository() {
        if (apiService == null) {
            apiService = RetrofitManager.getRetrofit().create(APIService.class);
        }

    }

}
