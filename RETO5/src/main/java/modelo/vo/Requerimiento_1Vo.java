package modelo.vo;

public class Requerimiento_1Vo {
    private String Ciudad_Residencia;
    private Double Promedio;

    public Requerimiento_1Vo() {

    }
    public Requerimiento_1Vo(String ciudad_Residencia, Double promedio) {
        this.Ciudad_Residencia = ciudad_Residencia;
        this.Promedio = promedio;
    }


    public String getCiudad_Residencia() {
        return Ciudad_Residencia;
    }


    public void setCiudad_Residencia(String ciudad_Residencia) {
        Ciudad_Residencia = ciudad_Residencia;
    }


    public Double getPromedio() {
        return Promedio;
    }


    public void setPromedio(Double promedio) {
        Promedio = promedio;
    }

    

    
}
