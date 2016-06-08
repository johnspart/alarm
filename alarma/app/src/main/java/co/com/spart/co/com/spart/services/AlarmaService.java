package co.com.spart.co.com.spart.services;

import java.util.List;

import co.com.spart.alarm.beans.Alarma;

/**
 * Created by john on 3/06/16.
 */
public interface AlarmaService {
    List<Alarma> getAlarmas() throws Exception;
}
