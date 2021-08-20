package modelo.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import modelo.vo.Requerimiento_1Vo;
import util.JDBCUtilities;

public class Requerimiento_1Dao {
    public ArrayList<Requerimiento_1Vo> requerimiento1() throws SQLException {
        // Su 
        ArrayList<Requerimiento_1Vo> respuesta = new ArrayList<Requerimiento_1Vo>();
        Connection conexion = JDBCUtilities.getConnection();

        try{
            String consulta = "select Ciudad_Residencia, AVG(Salario) as 'Promedio' from Lider l  group by Ciudad_Residencia  having (AVG(Salario)<500000) order by AVG(Salario) desc";
            Statement statement = conexion.createStatement();
            ResultSet resulset = statement.executeQuery(consulta);

            while (resulset.next()){
                Requerimiento_1Vo requerimiento1 = new Requerimiento_1Vo();
                requerimiento1.setCiudad_Residencia(resulset.getString("Ciudad_Residencia"));
                 requerimiento1.setPromedio(resulset.getDouble("Promedio"));

                respuesta.add(requerimiento1);
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