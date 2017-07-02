package in.ironfitness.android.app;

import android.app.Application;

import timber.log.Timber;


public class IronFitnessApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Timber.plant(new Timber.DebugTree());
    }
}
