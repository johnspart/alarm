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
    private Long hora;
    private Long minuto;

    public Periodo() {
        super();
    }

    public Periodo(Set<Dias> dias, Long hora, Long minuto) {
        this.dias = dias;
        this.hora = hora;
        this.minuto = minuto;
    }

    public Set<Dias> getDias() {
        return dias;
    }

    public void setDias(Set<Dias> dias) {
        this.dias = dias;
    }

    public Long getHora() {
        return hora;
    }

    public void setHora(Long hora) {
        this.hora = hora;
    }

    public Long getMinuto() {
        return minuto;
    }

    public void setMinuto(Long minuto) {
        this.minuto = minuto;
    }

    public String getDescripcion() {
        return new StringBuilder(this.hora.toString()).append(this.minuto.toString()).toString();
    }
}
