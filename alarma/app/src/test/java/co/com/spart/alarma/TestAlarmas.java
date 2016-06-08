package co.com.spart.alarma;

import org.junit.Test;
import static org.junit.Assert.*;

import java.util.List;

import co.com.spart.alarm.beans.Alarma;
import co.com.spart.co.com.spart.services.AlarmaService;

/**
 * Created by john on 3/06/16.
 */
public class TestAlarmas {
    private Inicio Inicio;
    private AlarmaService alarmaService;

    @Test
    public void obtenerListaAlarmas() throws Exception{
        List<Alarma> alarmas = null;

        alarmas = this.alarmaService.getAlarmas();

        assertNotNull(Inicio.getResources().getString(R.string.error_getAlarmNoCorrect), alarmas);
    }
}
