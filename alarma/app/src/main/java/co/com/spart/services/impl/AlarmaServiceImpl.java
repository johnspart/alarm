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
    public List<String> getAlarmas() throws Exception {
        List<String> tmp = new ArrayList<String>();

        Alarma alarma = new Alarma();
        Periodo periodo = new Periodo();
        periodo.setTiempo(new Date());
        alarma.setPeriodo(periodo);

        tmp.add(alarma.toString());
        tmp.add("asdasdsad");
        tmp.add("lsodasds");
        tmp.add("sdasdasd");
        tmp.add("sdasdoakjsdop");

        return tmp;
    }
}
