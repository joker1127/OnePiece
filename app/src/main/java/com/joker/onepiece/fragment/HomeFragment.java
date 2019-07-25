package com.joker.onepiece.fragment;

import android.os.Bundle;
import android.util.Log;


import com.joker.mvvm.LatestMovie;
import com.joker.mvvm.jetpack.LifecycleFragment;
import com.joker.onepiece.R;
import com.joker.onepiece.viewmodel.HomeViewModel;


public class HomeFragment extends LifecycleFragment<HomeViewModel> {


    @Override
    public void initView(Bundle state) {
        super.initView(state);
        getData();

    }

    @Override
    public void dataObserver() {

        registerObserver("Home", LatestMovie.class).observe(this, value -> {
            Log.e("SAX", "value: " + value.getTitle());

        });

    }

    @Override
    public int getLayoutResId() {
        return R.layout.fragment_home;
    }


    private void getData() {
        viewModel.getHomeData();
    }

}
