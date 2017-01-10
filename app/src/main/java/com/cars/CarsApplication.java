package com.cars;

import android.app.Application;
import io.realm.Realm;
import io.realm.RealmConfiguration;

public class CarsApplication extends Application {
    @Override
    public void onCreate() {
        Realm.init(this);
        RealmConfiguration config = new RealmConfiguration.Builder().build();
        Realm.setDefaultConfiguration(config);
    }
}
