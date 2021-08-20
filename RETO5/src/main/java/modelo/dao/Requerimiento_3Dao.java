package modelo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import modelo.vo.Requerimiento_3Vo;
import util.JDBCUtilities;

public class Requerimiento_3Dao {
    public ArrayList<Requerimiento_3Vo> requerimiento3() throws SQLException {
     
            // Su 
            ArrayList<Requerimiento_3Vo> respuesta = new ArrayList<Requerimiento_3Vo>();
            Connection conexion = JDBCUtilities.getConnection();
    
            try{
                String consulta = "select p.ID_Proyecto as proyecto, mc.Nombre_Material as Nombre_Material from MaterialConstruccion mc inner join Compra c  on mc.ID_MaterialConstruccion = c.ID_MaterialConstruccion inner join Proyecto p on c.ID_Proyecto = p.ID_Proyecto where c.ID_Proyecto BETWEEN 20 and 35 order by p.ID_Proyecto asc";
                Statement statement = conexion.createStatement();
                ResultSet resulset = statement.executeQuery(consulta);
    
                while (resulset.next()){
                    Requerimiento_3Vo requerimiento3 = new Requerimiento_3Vo();
                    requerimiento3.setId_Proyecto(resulset.getInt("proyecto"));
                     requerimiento3.setNombre_Material(resulset.getString("Nombre_Material"));
    
                    respuesta.add(requerimiento3);
                }
    
                resulset.close();
                statement.close();
    
            }catch(SQLException e){
                System.err.println("Error: " +e);
            }finally{
                if (conexion != null){
                    conexion.close();
                }
    
            }
    
            return respuesta;
        }
    
}