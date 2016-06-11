package co.com.spart.alarma;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import co.com.spart.alarm.beans.Alarma;
import co.com.spart.services.AlarmaService;
import co.com.spart.services.impl.AlarmaServiceImpl;

import static org.junit.Assert.assertNotNull;

/**
 * Created by john on 3/06/16.
 */
@RunWith(MockitoJUnitRunner.class)
public class TestAlarmas {
    @Mock
    private AlarmaServiceImpl alarmaService;

    @Before
    public void before() throws Exception{
        MockitoAnnotations.initMocks(this);

        //Mockito.when(this.alarmaService.getAlarmas()).thenReturn(new ArrayList<String>());
    }

    @Test
    public void obtenerListaAlarmas() throws Exception{
        List<String> alarmas = null;

        alarmas = this.alarmaService.getAlarmas();

        assertNotNull("Error el metodo getAlarmas, no se ejecuto correctamente", alarmas);
    }
}
