package co.com.spart.alarm.beans;

import static co.com.spart.utils.DateUtils.HH_mm;
import static co.com.spart.utils.DateUtils.getSringFormat;

/**
 * Created by john on 3/06/16.
 */
public class Alarma {
    private Long consecutivo;
    private String usuario;
    private Periodo periodo;
    private Long repetir;

    public Alarma() {
        super();
    }

    public Long getConsecutivo() {
        return consecutivo;
    }

    public void setConsecutivo(Long consecutivo) {
        this.consecutivo = consecutivo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public Periodo getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Periodo periodo) {
        this.periodo = periodo;
    }

    public Long getRepetir() {
        return repetir;
    }

    public void setRepetir(Long repetir) {
        this.repetir = repetir;
    }

    @Override
    public String toString() {
        return new StringBuilder(getSringFormat(this.periodo.getTiempo(), HH_mm)).append("Dias a repetir").toString();
    }
}
