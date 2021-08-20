package modelo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import modelo.vo.Requerimiento_2Vo;
import util.JDBCUtilities;

public class Requerimiento_2Dao {
    public ArrayList<Requerimiento_2Vo> requerimiento2() throws SQLException {

        

            // Su 
            ArrayList<Requerimiento_2Vo> respuesta = new ArrayList<Requerimiento_2Vo>();
            Connection conexion = JDBCUtilities.getConnection();
    
            try{
                String consulta = "select p.ID_Proyecto as proyecto, c.Proveedor as proveedor from Compra c inner join Proyecto p  on c.ID_Proyecto = p.ID_Proyecto where p.Ciudad = 'Bogota' order by p.ID_Proyecto ";
                Statement statement = conexion.createStatement();
                ResultSet resulset = statement.executeQuery(consulta);
    
                while (resulset.next()){
                    Requerimiento_2Vo requerimiento2 = new Requerimiento_2Vo();
                    requerimiento2.setID_Proyecto (resulset.getInt("proyecto"));
                     requerimiento2.setProveedor(resulset.getString("proveedor"));
    
                    respuesta.add(requerimiento2);
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