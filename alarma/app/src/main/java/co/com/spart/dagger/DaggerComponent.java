package co.com.spart.dagger;

import javax.inject.Singleton;

import co.com.spart.alarma.Inicio;
import co.com.spart.services.AlarmaService;
import dagger.Component;

/**
 * Created by john on 9/06/16.
 */
@Singleton
@Component(modules = DaggerModule.class)
public interface DaggerComponent {
    void inject(Inicio inicio);
    /**
     * The following are also possible:
     *
     * void inject(InputActivity activity);
     * void inject(BaseActivity activity);
     * void inject(SomeFragmentSubclass fragment);
     *
     * They can all live harmoniously here, because they have different method signatures.
     * I've also seen injectActivity() and injectFragment() variants. I have not done research into
     * the history of this.
     */

    AlarmaService alarmaService();
}
