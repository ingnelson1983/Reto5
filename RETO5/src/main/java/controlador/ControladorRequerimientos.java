package controlador;

import java.sql.SQLException;
import java.util.ArrayList;

import modelo.dao.Requerimiento_1Dao;
import modelo.dao.Requerimiento_2Dao;
import modelo.dao.Requerimiento_3Dao;
import modelo.vo.Requerimiento_1Vo;
import modelo.vo.Requerimiento_2Vo;
import modelo.vo.Requerimiento_3Vo;

public class ControladorRequerimientos {

    private final Requerimiento_1Dao requerimiento1Dao;
    private final Requerimiento_2Dao requerimiento2Dao;
    private final Requerimiento_3Dao requerimiento3Dao;

    
    // Su código

    public ControladorRequerimientos() {
        this.requerimiento1Dao = new Requerimiento_1Dao();
        this.requerimiento2Dao = new Requerimiento_2Dao();
        this.requerimiento3Dao = new Requerimiento_3Dao();
    }

    public ArrayList<Requerimiento_1Vo> consultarRequerimiento1() throws SQLException {
        // Su código
        return this.requerimiento1Dao.requerimiento1();
    }

    public ArrayList<Requerimiento_2Vo> consultarRequerimiento2() throws SQLException {
        // Su código
        return this.requerimiento2Dao.requerimiento2();
    }

    public ArrayList<Requerimiento_3Vo> consultarRequerimiento3() throws SQLException {
        // Su código
        return this.requerimiento3Dao.requerimiento3();
    }
}
