package com.joker.mvvm.base;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.disposables.Disposable;


//
public abstract class BaseRepository {
    private CompositeDisposable mCompositeDisposable;


    public BaseRepository() {

    }

    protected void addDisposable(Disposable disposable) {
        if (mCompositeDisposable == null) {
            mCompositeDisposable = new CompositeDisposable();
        }
        mCompositeDisposable.add(disposable);
    }

    public void unDisposable() {
        if (mCompositeDisposable != null && mCompositeDisposable.isDisposed()) {
            mCompositeDisposable.clear();
        }
    }

}
