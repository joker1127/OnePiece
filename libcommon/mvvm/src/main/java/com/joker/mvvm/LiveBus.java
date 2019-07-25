package com.joker.mvvm;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;

import java.util.concurrent.ConcurrentHashMap;


public class LiveBus {

    private static LiveBus instance;

    private final ConcurrentHashMap<Object, MutableLiveData<Object>> busLiveData;

    private LiveBus() {
        busLiveData = new ConcurrentHashMap<>();
    }

    public static LiveBus getInstance() {

        if (instance == null) {
            synchronized (LiveBus.class) {
                instance = new LiveBus();
            }
        }
        return instance;
    }

    public <T> BusLiveData<T> subscribe(Object key) {

        if (!busLiveData.containsKey(key)) {
            busLiveData.put(key, new BusLiveData<Object>(true));
        } else {
            ((BusLiveData) busLiveData.get(key)).isFirstSubscribe = false;
        }
        return (BusLiveData) busLiveData.get(key);
    }


    public <T> MutableLiveData<T> postEvent(Object eventKey, T value) {
        MutableLiveData<T> mutableLiveData = subscribe(eventKey);
        mutableLiveData.postValue(value);
        return mutableLiveData;
    }


    public static class BusLiveData<T> extends MutableLiveData<T> {

        private boolean isFirstSubscribe;

        BusLiveData(boolean isFirstSubscribe) {
            this.isFirstSubscribe = isFirstSubscribe;
        }

        @Override
        public void observe(@NonNull LifecycleOwner owner, @NonNull Observer<? super T> observer) {
            super.observe(owner, new ObserverWrapper<>(observer, isFirstSubscribe));
        }


    }

    private static class ObserverWrapper<T> implements Observer<T> {

        private Observer<T> observer;

        private boolean isChanged;

        private ObserverWrapper(Observer<T> observer, boolean isFirstSubscribe) {
            this.observer = observer;
            isChanged = isFirstSubscribe;
        }

        @Override
        public void onChanged(@Nullable T t) {
            if (isChanged) {
                if (observer != null) {
                    observer.onChanged(t);
                }
            } else {
                isChanged = true;
            }
        }

    }

}

