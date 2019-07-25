package com.joker.onepiece.repository;

import android.util.Log;


import com.joker.mvvm.LatestMovie;
import com.joker.mvvm.base.BaseBean;
import com.joker.mvvm.jetpack.LifecycleRepository;

import org.reactivestreams.Publisher;

import io.reactivex.Flowable;
import io.reactivex.FlowableTransformer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subscribers.DisposableSubscriber;

public class HomeRepository extends LifecycleRepository {

    private Flowable<LatestMovie> mHomeListObservable;

    public void getHomeData(String start, String count) {
        mHomeListObservable = apiService.getHomeData(start, count, "0df993c66c0c636e29ecbb5344252a4a");

        addDisposable(
                mHomeListObservable.compose(new FlowableTransformer<BaseBean, BaseBean>() {
                    @Override
                    public Publisher<BaseBean> apply(Flowable<BaseBean> upstream) {
                        return upstream.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
                    }
                }).subscribeWith(new DisposableSubscriber<BaseBean>() {
                    @Override
                    public void onNext(BaseBean latestMovie) {
                        if (latestMovie != null) {
                            sendData("Home",latestMovie);

                        }


                    }

                    @Override
                    public void onError(Throwable t) {

                    }

                    @Override
                    public void onComplete() {

                    }
                })

        );
    }

}
