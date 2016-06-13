package co.com.spart.alarm.beans;

/**
 * Created by john on 13/06/16.
 */
public class MenuItem {
    private int iconId;
    private String descripcion;

    public MenuItem() {
        super();
    }

    public MenuItem(int iconId, String descripcion) {
        super();
        this.iconId = iconId;
        this.descripcion = descripcion;
    }

    public int getIconId() {
        return iconId;
    }

    public void setIconId(int iconId) {
        this.iconId = iconId;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
