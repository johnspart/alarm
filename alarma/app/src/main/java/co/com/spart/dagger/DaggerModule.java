package co.com.spart.dagger;

import javax.inject.Singleton;

import co.com.spart.services.AlarmaService;
import co.com.spart.services.impl.AlarmaServiceImpl;
import dagger.Module;
import dagger.Provides;

/**
 * Created by john on 9/06/16.
 */
@Module
public class DaggerModule {

    private DaggerApplication daggerApplication;

    public DaggerModule(DaggerApplication daggerApplication){
        this.daggerApplication = daggerApplication;
    }

    @Provides
    @Singleton
    AlarmaService getAlarmaService() {
        return new AlarmaServiceImpl();
    }
}
