package com.joker.onepiece.fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.joker.libcommon.LatestMovie;
import com.joker.libcommon.jetpack.LifecycleFragment;
import com.joker.libcommon.retrofit.APIService;
import com.joker.libcommon.retrofit.RetrofitManager;
import com.joker.onepiece.R;
import com.joker.onepiece.viewmodel.HomeViewModel;


import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subscribers.DisposableSubscriber;

public class HomeFragment extends LifecycleFragment<HomeViewModel> {


    @Override
    public void initView(Bundle state) {
        super.initView(state);
        getData();

    }

    @Override
    public int getLayoutResId() {
        return R.layout.fragment_home;
    }


    private void getData(){
        viewModel.getHomeData();
    }

}
