package in.ironfitness.android.app;

import android.app.Application;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

import in.ironfitness.android.app.ui.network.ProfileData;
import timber.log.Timber;


public class IronFitnessApplication extends Application {
    public static RequestQueue queue;
    @Override
    public void onCreate() {
        super.onCreate();
        Timber.plant(new Timber.DebugTree());
        queue = Volley.newRequestQueue(this);
        ProfileData profileData= new ProfileData();
    }
}
