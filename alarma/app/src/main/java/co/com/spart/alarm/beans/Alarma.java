package co.com.spart.alarm.beans;

import java.util.Timer;

/**
 * Created by john on 3/06/16.
 */
public class Alarma {
    private Long consecutivo;
    private String usuario;
    private Periodo periodo;
    private Long repetir;


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
}
