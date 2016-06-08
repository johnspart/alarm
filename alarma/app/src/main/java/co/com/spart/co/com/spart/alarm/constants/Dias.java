package co.com.spart.co.com.spart.alarm.constants;

/**
 * Created by john on 7/06/16.
 */
public enum Dias {
    LUNES("Lun"),
    MARTES("Mar"),
    MiERCOLES("Mie"),
    JUEVES("Jue"),
    VIERNES("Vie"),
    SABADO("Sab"),
    DOMIGO("Dom");

    private String descripcion;


    Dias(String descripcion){
        this.descripcion = descripcion;
    }

    public String getDescripcion(){
        return  this.descripcion;
    }
}
