package co.com.spart.dagger;

import android.app.Application;

/**
 * Created by john on 9/06/16.
 */
public class DaggerApplication extends Application {
    private DaggerComponent daggerComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        this.initializeInjector();
    }

    private void initializeInjector() {
        this.daggerComponent = Dagger.applicationModule(new DaggerModule(this))
                .build();
    }

    public DaggerComponent getDaggerComponent() {
        return this.daggerComponent;
    }


}
