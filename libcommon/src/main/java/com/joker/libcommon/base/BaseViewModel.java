package com.joker.libcommon.base;

import android.app.Application;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;


//第一层封装，封装基本的生命周期
public abstract class BaseViewModel<T extends BaseRepository> extends AndroidViewModel {

    public T mRepository;

    public BaseViewModel(@NonNull Application application) {
        super(application);

        mRepository = TUtil.getObject(this, 0);
    }

    @Override
    protected void onCleared() {
        super.onCleared();
        if (mRepository != null) {
            mRepository.unDisposable();
        }
    }
}
