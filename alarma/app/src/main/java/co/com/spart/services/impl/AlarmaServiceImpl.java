package co.com.spart.services.impl;

import org.androidannotations.annotations.EBean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import co.com.spart.alarm.beans.Alarma;
import co.com.spart.alarm.beans.Periodo;
import co.com.spart.services.AlarmaService;

/**
 * Created by john on 8/06/16.
 */
@EBean(scope = EBean.Scope.Singleton)
public class AlarmaServiceImpl implements AlarmaService{
    @Override
    public List<Alarma> getAlarmas() throws Exception {
        List<Alarma> tmp = new ArrayList<Alarma>();

        Alarma alarma = new Alarma();
        Periodo periodo = new Periodo();
        periodo.setTiempo(new Date());
        alarma.setDescripcion("Alarma");
        alarma.setPeriodo(periodo);

        tmp.add(alarma);
        tmp.add(alarma);
        tmp.add(alarma);
        tmp.add(alarma);

        return tmp;
    }
}
