package modelo.vo;

public class Requerimiento_2Vo {
    private int ID_Proyecto;
    private String Proveedor;

    public Requerimiento_2Vo() {

    }

    public Requerimiento_2Vo(int iD_Proyecto, String proveedor) {
        this.ID_Proyecto = iD_Proyecto;
        this.Proveedor = proveedor;
    }

    public int getID_Proyecto() {
        return ID_Proyecto;
    }

    public void setID_Proyecto(int iD_Proyecto) {
        ID_Proyecto = iD_Proyecto;
    }

    public String getProveedor() {
        return Proveedor;
    }

    public void setProveedor(String proveedor) {
        Proveedor = proveedor;
    }

    

    

}
