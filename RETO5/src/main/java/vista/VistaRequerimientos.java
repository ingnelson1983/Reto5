package vista;

import java.util.ArrayList;

import controlador.ControladorRequerimientos;
import modelo.vo.Requerimiento_1Vo;
import modelo.vo.Requerimiento_2Vo;
import modelo.vo.Requerimiento_3Vo;

public class VistaRequerimientos {

    public static final ControladorRequerimientos controlador = new ControladorRequerimientos();

    public static void requerimiento1() {
       // System.out.println("LISTADO");
        try {
            // Su código
            ArrayList<Requerimiento_1Vo> requerimiento_1 = controlador.consultarRequerimiento1();

            //Encabezado del resultado
          //  System.out.println("Ciudad, Promedio");

            for (Requerimiento_1Vo proyecto : requerimiento_1){
                System.out.printf("%s %d %n",
                    proyecto.getCiudad_Residencia(),Math.round(proyecto.getPromedio()));
            }
        } catch (Exception e) {
            System.out.println("Se ha producido el siguiente error:" + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void requerimiento2() {
      //  System.out.println("LISTADO");
        try {
            // Su código
            ArrayList<Requerimiento_2Vo> requerimiento_2 = controlador.consultarRequerimiento2();

            //Encabezado del resultado
          //  System.out.println("Proyecto, Proveedor");

            for (Requerimiento_2Vo proyecto : requerimiento_2){
                System.out.printf("%d %s %n",
                    proyecto.getID_Proyecto(),proyecto.getProveedor());
            }
        } catch (Exception e) {
            System.out.println("Se ha producido el siguiente error:" + e.getMessage());
            e.printStackTrace();
        }
    }

    public static void requerimiento3() {
      //  System.out.println("LISTADO");
        try {
            // Su código
            ArrayList<Requerimiento_3Vo> requerimiento_3 = controlador.consultarRequerimiento3();

            //Encabezado del resultado
           // System.out.println("Proyecto, Nombre Material");

            for (Requerimiento_3Vo proyecto : requerimiento_3){
                System.out.printf("%d %s %n",
                    proyecto.getId_Proyecto(),proyecto.getNombre_Material());
            }
        } catch (Exception e) {
            System.out.println("Se ha producido el siguiente error:" + e.getMessage());
            e.printStackTrace();
        }
    }
}
