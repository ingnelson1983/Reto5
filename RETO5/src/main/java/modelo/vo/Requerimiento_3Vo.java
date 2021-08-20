package modelo.vo;

public class Requerimiento_3Vo {
    // Su código
    private int id_Proyecto;
    private String nombre_Material;

    public Requerimiento_3Vo() {

    }

    public Requerimiento_3Vo(int id_Proyecto, String nombre_Material) {
        this.id_Proyecto = id_Proyecto;
        this.nombre_Material = nombre_Material;
    }

    public int getId_Proyecto() {
        return id_Proyecto;
    }

    public void setId_Proyecto(int id_Proyecto) {
        this.id_Proyecto = id_Proyecto;
    }

    public String getNombre_Material() {
        return nombre_Material;
    }

    public void setNombre_Material(String nombre_Material) {
        this.nombre_Material = nombre_Material;
    }

    

    



}
