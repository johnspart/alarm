package co.com.spart.alarm.orm;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

import java.util.Set;

import co.com.spart.alarm.beans.Alarma;
import co.com.spart.constants.Dias;

/**
 * Created by john on 14/06/16.
 */
@DatabaseTable(tableName = "TAlarma")
public class TAlarma {
    @DatabaseField(id = true)
    private String idAlarma;
    @DatabaseField(generatedId = true, canBeNull = false)
    private Long consecutivo;
    @DatabaseField(canBeNull = false)
    private String usuario;
    @DatabaseField
    private String descripcion;
    @DatabaseField()
    private Set<Dias> dias;
    @DatabaseField(canBeNull = false)
    private Long hora;
    @DatabaseField(canBeNull = false)
    private Long minuto;
    @DatabaseField
    private Long repetir;

    public TAlarma() {
        super();
    }

    public TAlarma(Alarma alarma) {
        this.consecutivo = alarma.getConsecutivo();
        this.usuario = alarma.getUsuario();
        this.descripcion = alarma.getDescripcion();
        this.dias = alarma.getPeriodo().getDias();
        this.hora = alarma.getPeriodo().getHora();
        this.minuto = alarma.getPeriodo().getMinuto();
        this.repetir = alarma.getRepetir();
    }

    public String getIdAlarma() {
        this.idAlarma = new StringBuilder(this.consecutivo.toString()).append(this.usuario).toString();
        return idAlarma;
    }

    public void setIdAlarma(String idAlarma) {
        this.idAlarma = idAlarma;
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

    public Long getRepetir() {
        return repetir;
    }

    public void setRepetir(Long repetir) {
        this.repetir = repetir;
    }
}
