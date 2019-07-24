package com.joker.onepiece.repository;

import com.joker.libcommon.LatestMovie;
import com.joker.libcommon.base.BaseRepository;
import com.joker.libcommon.jetpack.LifecycleRepository;

import org.reactivestreams.Publisher;

import io.reactivex.Flowable;
import io.reactivex.FlowableTransformer;
import io.reactivex.Scheduler;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;
import io.reactivex.subscribers.DisposableSubscriber;

public class HomeRepository extends LifecycleRepository {

    private Flowable<LatestMovie> mHomeListObservable;

    public void getHomeData(String start, String count) {
        mHomeListObservable = apiService.getHomeData(start, count, "0df993c66c0c636e29ecbb5344252a4a");

        addDisposable(
                mHomeListObservable.compose(new FlowableTransformer<LatestMovie, LatestMovie>() {
                    @Override
                    public Publisher<LatestMovie> apply(Flowable<LatestMovie> upstream) {
                        return upstream.subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread());
                    }
                }).subscribeWith(new DisposableSubscriber<LatestMovie>() {
                    @Override
                    public void onNext(LatestMovie latestMovie) {

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
