package com.joker.libcommon.jetpack;

import android.os.Bundle;
import android.util.Log;

import androidx.lifecycle.ViewModelProviders;

import com.joker.libcommon.base.BaseFragment;
import com.joker.libcommon.base.BaseViewModel;
import com.joker.libcommon.base.TUtil;

public abstract  class LifecycleFragment <T extends BaseViewModel>extends BaseFragment {

    protected   T viewModel;
    @Override
    public void initView(Bundle state) {
        viewModel = ViewModelProviders.of(this).get((Class<T>) TUtil.getClass(this, 0));



//        if (null != mViewModel) {
//            dataObserver();
//            mStateEventKey = getStateEventKey();
//            mStateEventTag = getStateEventTag();
//            eventKeys.add(new StringBuilder((String) mStateEventKey).append(mStateEventTag).toString());
//            LiveBus.getDefault().subscribe(mStateEventKey, mStateEventTag).observe(this, observer);
//        }
    }
}
