package co.com.spart.services.impl;

import com.j256.ormlite.dao.Dao;

import org.androidannotations.annotations.EBean;
import org.androidannotations.annotations.EService;
import org.androidannotations.ormlite.annotations.OrmLiteDao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import co.com.spart.alarm.beans.Alarma;
import co.com.spart.alarm.orm.DataBaseHelper;
import co.com.spart.alarm.orm.TAlarma;
import co.com.spart.constants.Dias;
import co.com.spart.services.AlarmaService;

/**
 * Created by john on 8/06/16.
 */
@EService()
public class AlarmaServiceImpl implements AlarmaService{

    @OrmLiteDao(helper = DataBaseHelper.class)
    Dao<TAlarma, String> tAlarmaDAO;

    public AlarmaServiceImpl(){
        TAlarma t = new TAlarma();
        t.setConsecutivo(2L);
        t.setUsuario("usuario@gmail.com");
        t.setDescripcion("Descripcion de la alarma");
        t.setDias(new HashSet<Dias>(Arrays.asList(Dias.values())));
        t.setHora(10L);
        t.setMinuto(12L);
        try {
            this.tAlarmaDAO.create(t);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Alarma> getAlarmas() throws Exception {
        List<Alarma> tmp = new ArrayList<Alarma>();
        for (TAlarma tAlarma : this.tAlarmaDAO.queryForAll()){
            tmp.add(new Alarma(tAlarma));
        }

        return tmp;
    }
}
