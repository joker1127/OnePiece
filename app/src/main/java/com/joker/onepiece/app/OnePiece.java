package com.joker.onepiece.app;

import android.app.Application;

import com.tencent.bugly.Bugly;
import com.tencent.bugly.beta.Beta;

public class OnePiece extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Beta.autoInit = true;

        /**
         * true表示初始化时自动检查升级
         * false表示不会自动检查升级，需要手动调用Beta.checkUpgrade()方法
         */
        Beta.autoCheckUpgrade = true;
        Bugly.init(getApplicationContext(), "eddfa8375a", true);
//        Bugly.setIsDevelopmentDevice(getApplicationContext(), true);
    }
}
