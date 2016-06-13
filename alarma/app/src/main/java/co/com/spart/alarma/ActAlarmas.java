package co.com.spart.alarma;

import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.Toast;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ItemClick;
import org.androidannotations.annotations.ViewById;

import co.com.spart.alarm.beans.Alarma;
import co.com.spart.services.AlarmaService;
import co.com.spart.services.impl.AlarmaServiceImpl;
import co.com.spart.utils.AlarmArrayAdapter;

@EActivity(R.layout.content_alarmas)
public class ActAlarmas extends AppCompatActivity {

    @ViewById(R.id.list)
    ListView lstAlarmas;

    AlarmArrayAdapter arrAdapterAlarmas;

    @Bean(AlarmaServiceImpl.class)
    AlarmaService alarmaService;

    @AfterViews
    protected void afterViews() {
        try {
            this.arrAdapterAlarmas = new AlarmArrayAdapter(this, this.alarmaService.getAlarmas());
        } catch (Exception e) {
            e.printStackTrace();
        }

        this.lstAlarmas.setAdapter(this.arrAdapterAlarmas);

    }

    @ItemClick(R.id.list)
    public void selecccionAlarma(Alarma item) {
        Toast.makeText(super.getApplicationContext(), item.toString(), Toast.LENGTH_LONG).show();
    }
}
