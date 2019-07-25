package com.joker.mvvm.jetpack;

import android.os.Bundle;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelProviders;

import com.joker.mvvm.LiveBus;
import com.joker.mvvm.base.BaseFragment;
import com.joker.mvvm.base.BaseViewModel;
import com.joker.mvvm.TUtil;


public abstract class LifecycleFragment<T extends BaseViewModel> extends BaseFragment {

    protected T viewModel;

    @Override
    public void initView(Bundle state) {
        viewModel = ViewModelProviders.of(this).get((Class<T>) TUtil.getClass(this, 0));


        if (null != viewModel) {
            dataObserver();
//            mStateEventKey = getStateEventKey();
        }
    }

    public abstract void dataObserver();

    protected <T> MutableLiveData<T> registerObserver(Object key, Class<T> tClass) {
        return LiveBus.getInstance().subscribe(key);
    }
}
