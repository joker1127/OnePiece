package com.joker.onepiece.app;

import android.app.Application;
import android.content.Context;

import androidx.multidex.MultiDex;

import com.tencent.bugly.Bugly;
import com.tencent.bugly.beta.Beta;
import com.tencent.tinker.loader.app.TinkerApplication;
import com.tencent.tinker.loader.shareutil.ShareConstants;

public class OnePiece extends TinkerApplication {

    public OnePiece() {
        super(ShareConstants.TINKER_ENABLE_ALL, "com.joker.onepiece.app.OnePieceLink",
                "com.tencent.tinker.loader.TinkerLoader", false);
    }

    @Override
    public void onCreate() {
        super.onCreate();

        Beta.autoInit = true;

        /**
         * true表示初始化时自动检查升级
         * false表示不会自动检查升级，需要手动调用Beta.checkUpgrade()方法
         */
        Beta.autoCheckUpgrade = true;
        Bugly.init(getApplicationContext(), "eddfa8375a", false);
//        Bugly.setIsDevelopmentDevice(getApplicationContext(), true);
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        // you must install multiDex whatever tinker is installed!
        MultiDex.install(base);


        // 安装tinker
        Beta.installTinker();
    }


}
