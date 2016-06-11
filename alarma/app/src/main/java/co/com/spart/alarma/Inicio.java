package co.com.spart.alarma;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.Bean;
import org.androidannotations.annotations.Click;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ItemClick;
import org.androidannotations.annotations.ViewById;

import co.com.spart.services.AlarmaService;
import co.com.spart.services.impl.AlarmaServiceImpl;

@EActivity(R.layout.activity_inicio)
public class Inicio extends AppCompatActivity {

    @ViewById(R.id.list)
    ListView lstAlarmas;

    ArrayAdapter<String> arrAdapterAlarmas;

    @Bean(AlarmaServiceImpl.class)
    AlarmaService alarmaService;

    @AfterViews
    protected void afterViews() {
        try {
            this.arrAdapterAlarmas = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,android.R.id.text1, this.alarmaService.getAlarmas());
        } catch (Exception e) {
            e.printStackTrace();
        }

        this.lstAlarmas.setAdapter(this.arrAdapterAlarmas);

    }

    @ItemClick(R.id.list)
    public void selecccionAlarma(String item){
        Snackbar.make(this.lstAlarmas, item, Snackbar.LENGTH_LONG)
                .setAction("Action", null).show();
    }
}
