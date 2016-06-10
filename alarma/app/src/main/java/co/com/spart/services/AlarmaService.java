package co.com.spart.services;

import java.util.List;

import javax.inject.Singleton;

import co.com.spart.alarm.beans.Alarma;
import co.com.spart.dagger.DaggerModule;
import dagger.Component;

/**
 * Created by john on 3/06/16.
 */

public interface AlarmaService {
    List<String> getAlarmas() throws Exception;
}
