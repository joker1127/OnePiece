package com.joker.onepiece.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;


import com.joker.mvvm.base.BaseViewModel;
import com.joker.onepiece.repository.HomeRepository;

public class HomeViewModel extends BaseViewModel<HomeRepository> {
    public HomeViewModel(@NonNull Application application) {
        super(application);
    }

    public void getHomeData() {
        mRepository.getHomeData("0", "2");
    }
}
