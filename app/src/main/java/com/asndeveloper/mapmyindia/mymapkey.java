package com.asndeveloper.mapmyindia;

import android.app.Application;

import com.mappls.sdk.maps.Mappls;
import com.mappls.sdk.services.account.MapplsAccountManager;

public class mymapkey  extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        // My MAp API is Here
        MapplsAccountManager.getInstance().setRestAPIKey("put here");
        MapplsAccountManager.getInstance().setMapSDKKey("put here");
        MapplsAccountManager.getInstance().setAtlasClientId("put here");
        MapplsAccountManager.getInstance().setAtlasClientSecret("put here");
        Mappls.getInstance(getApplicationContext());

    }
}
