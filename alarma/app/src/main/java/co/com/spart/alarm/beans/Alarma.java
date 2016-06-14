package co.com.spart.alarm.beans;

import co.com.spart.alarm.orm.TAlarma;

import static co.com.spart.utils.DateUtils.HH_mm;
import static co.com.spart.utils.DateUtils.getSringFormat;

/**
 * Created by john on 3/06/16.
 */
public class Alarma {
    private Long consecutivo;
    private String usuario;
    private String descripcion;
    private Periodo periodo;
    private Long repetir;

    public Alarma() {
        super();
    }

    public Alarma(TAlarma tAlarma) {
        this.consecutivo = tAlarma.getConsecutivo();
        this.usuario = tAlarma.getUsuario();
        this.descripcion = tAlarma.getDescripcion();
        this.periodo = new Periodo(tAlarma.getDias(), tAlarma.getHora(), tAlarma.getMinuto());
        this.repetir = tAlarma.getRepetir();
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

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
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
        return this.descripcion == null ? "" : this.descripcion;
    }
}
