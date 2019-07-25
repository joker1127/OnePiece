package com.joker.mvvm.jetpack;


import com.joker.mvvm.LiveBus;
import com.joker.mvvm.base.BaseRepository;
import com.joker.mvvm.retrofit.APIService;
import com.joker.mvvm.retrofit.RetrofitManager;

public class LifecycleRepository extends BaseRepository {
    protected APIService apiService;


    public LifecycleRepository() {
        if (apiService == null) {
            apiService = RetrofitManager.getRetrofit().create(APIService.class);
        }

    }

    protected void sendData(Object key, Object value) {
//        sendData();
        LiveBus.getInstance().postEvent(key, value);


    }

}
