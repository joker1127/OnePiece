package com.joker.libcommon.base;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;


//第一层封装，封装基本的生命周期
public abstract class BaseFragment extends Fragment {

    protected FragmentActivity activity;
    private View rootView;


    protected boolean mIsFirstVisible = true;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle state) {
        rootView = inflater.inflate(getLayoutResId(), null, false);

        initView(state);
        return rootView;
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.activity = (FragmentActivity) context;
    }


    @Override
    public void onDetach() {
        super.onDetach();
        this.activity = null;
    }

    @Override
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        if (!hidden) {
            onVisible();
        } else {
            onInVisible();
        }
    }

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        if (isVisibleToUser) {
            onVisible();
        } else {
            onInVisible();
        }
    }

    /**
     * 当界面不可见时的操作
     */
    protected void onInVisible() {

    }


    protected void onVisible() {
        if (mIsFirstVisible && isResumed()) {
            lazyLoad();
            mIsFirstVisible = false;
        }
    }


    /**
     * 数据懒加载
     */
    protected void lazyLoad() {

    }

    public abstract int getLayoutResId();

    /**
     * 初始化views
     *
     * @param state
     */
    public abstract void initView(Bundle state);
}
