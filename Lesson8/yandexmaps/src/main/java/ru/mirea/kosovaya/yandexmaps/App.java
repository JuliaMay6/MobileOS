package ru.mirea.kosovaya.yandexmaps;

import com.yandex.mapkit.MapKitFactory;

import android.app.Application;

public class App extends Application {
    private final String MAPKIT_API_KEY = "3836296e-3ca8-40f0-9847-b31b971c0a33";
    @Override
    public void onCreate() {
        super.onCreate();
        // Set the api key before calling initialize on MapKitFactory.
        MapKitFactory.setApiKey(MAPKIT_API_KEY);
    }
}
