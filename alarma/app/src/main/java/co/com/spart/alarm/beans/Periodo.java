package co.com.spart.alarm.beans;

import java.util.Date;
import java.util.Set;

import co.com.spart.constants.Dias;
import co.com.spart.utils.DateUtils;

/**
 * Created by john on 7/06/16.
 */
public class Periodo {

    private Set<Dias> dias;
    private Date tiempo;

    public Set<Dias> getDias() {
        return dias;
    }

    public void setDias(Set<Dias> dias) {
        this.dias = dias;
    }

    public Date getTiempo() {
        return tiempo;
    }

    public void setTiempo(Date tiempo) {
        this.tiempo = tiempo;
    }

    public String getDescripcion() {
        return new StringBuilder(DateUtils.getSringFormat(this.tiempo, DateUtils.HH_mm)).toString();
    }
}
