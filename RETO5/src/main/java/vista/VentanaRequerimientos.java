package vista;

import java.awt.BorderLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.table.AbstractTableModel;

import controlador.ControladorRequerimientos;
import modelo.vo.Requerimiento_1Vo;
import modelo.vo.Requerimiento_2Vo;
import modelo.vo.Requerimiento_3Vo;

public class VentanaRequerimientos extends JFrame {
    private JTable tabla;
    private ControladorRequerimientos controlador;
    
    public VentanaRequerimientos(){
        controlador =  new ControladorRequerimientos();
        initUI();
        setLocationRelativeTo(null);

    }
    public void initUI(){
        setTitle("RETO 5 - MINTIC");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800,600);

        var tbd =  new JTabbedPane();
        getContentPane().add(tbd, BorderLayout.CENTER);

        var panel =  new JPanel();
        panel.setLayout(new BorderLayout());
        
        tbd.addTab("VENTANA REQUERIMIENTOS", panel);

        var panelEntrada =  new JPanel();
       // panelEntrada.add(new JLabel("Requerimientos Label"));

        var btnConsulta =  new JButton("Consulta Requerimiento 1");
        btnConsulta.addActionListener(e -> cargarTablaConsulta());
        panelEntrada.add(btnConsulta);
        panel.add(panelEntrada, BorderLayout.PAGE_START);

        //BOTON CONSULTA2
        var btnConsulta2 =  new JButton("Consulta Requerimiento 2");
        btnConsulta2.addActionListener(e -> cargarTablaConsulta2());
        panelEntrada.add(btnConsulta2);
        panel.add(panelEntrada, BorderLayout.PAGE_START);


        //BOTON CONSULTA3
        var btnConsulta3 =  new JButton("Consulta Requerimiento 3");
        btnConsulta3.addActionListener(e -> cargarTablaConsulta3());
        panelEntrada.add(btnConsulta3);
        panel.add(panelEntrada, BorderLayout.PAGE_START);


        //Adicionar Tabla
        tabla = new JTable();
        panel.add(new JScrollPane(tabla), BorderLayout.CENTER);


    }
    private void cargarTablaConsulta() {
        try{
            var lista =  controlador.consultarRequerimiento1();
            var tableModel = new Requerimiento1TableModel();
            tableModel.setData(lista);
            tabla.setModel(tableModel);
            tableModel.setData(lista);

        }catch (Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage(), getTitle(), JOptionPane.ERROR_MESSAGE);

        }
    }

    //CARGAR TABLA 2
    private void cargarTablaConsulta2() {
        try{
            var lista =  controlador.consultarRequerimiento2();
            var tableModel = new Requerimiento2TableModel();
            tableModel.setData(lista);
            tabla.setModel(tableModel);
            tableModel.setData(lista);

        }catch (Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage(), getTitle(), JOptionPane.ERROR_MESSAGE);

        }
    }

    //CARGAR TABLA 3
    private void cargarTablaConsulta3() {
        try{
            var lista =  controlador.consultarRequerimiento3();
            var tableModel = new Requerimiento3TableModel();
            tableModel.setData(lista);
            tabla.setModel(tableModel);
            tableModel.setData(lista);

        }catch (Exception e){
            JOptionPane.showMessageDialog(this, e.getMessage(), getTitle(), JOptionPane.ERROR_MESSAGE);

        }
    }



    private class Requerimiento1TableModel extends AbstractTableModel
    {

        private ArrayList<Requerimiento_1Vo> data;
        public void setData(ArrayList<Requerimiento_1Vo> data) 
        {
            this.data = data;
        }


        @Override
        public String getColumnName(int column) {
   
            switch (column){
                case 0:
                    return "Ciudad Residencia";
                case 1:
                return "Promedio";
            }
            return null;
        }
        

        @Override
        public int getRowCount() {
            // TODO Auto-generated method stub
            return data.size();
        }

        @Override
        public int getColumnCount() {
            // TODO Auto-generated method stub
            return 2;
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            // TODO Auto-generated method stub
            var registro =  data.get(rowIndex);
            switch (columnIndex){
                case 0:
                    return registro.getCiudad_Residencia();
                case 1:
                    return Math.round(registro.getPromedio());
            }
            return null;
        }
        
    }


    //REQUERIMIENTO 2
    private class Requerimiento2TableModel extends AbstractTableModel
    {

        private ArrayList<Requerimiento_2Vo> data;
        public void setData(ArrayList<Requerimiento_2Vo> data) 
        {
            this.data = data;
        }


        @Override
        public String getColumnName(int column) {
   
            switch (column){
                case 0:
                    return "Proyecto";
                case 1:
                return "Proveedor";
            }
            return null;
        }
        

        @Override
        public int getRowCount() {
            // TODO Auto-generated method stub
            return data.size();
        }

        @Override
        public int getColumnCount() {
            // TODO Auto-generated method stub
            return 2;
        }

        @Override
        public Object getValueAt(int rowIndex, int columnIndex) {
            // TODO Auto-generated method stub
            var registro =  data.get(rowIndex);
            switch (columnIndex){
                case 0:
                    return registro.getID_Proyecto();
                case 1:
                    return registro.getProveedor();
            }
            return null;
        }
        
    }


       //REQUERIMIENTO 3
       private class Requerimiento3TableModel extends AbstractTableModel
       {
   
           private ArrayList<Requerimiento_3Vo> data;
           public void setData(ArrayList<Requerimiento_3Vo> data) 
           {
               this.data = data;
           }
   
   
           @Override
           public String getColumnName(int column) {
      
               switch (column){
                   case 0:
                       return "Proyecto";
                   case 1:
                   return "Nombre Material";
               }
               return null;
           }
           
   
           @Override
           public int getRowCount() {
               // TODO Auto-generated method stub
               return data.size();
           }
   
           @Override
           public int getColumnCount() {
               // TODO Auto-generated method stub
               return 2;
           }
   
           @Override
           public Object getValueAt(int rowIndex, int columnIndex) {
               // TODO Auto-generated method stub
               var registro =  data.get(rowIndex);
               switch (columnIndex){
                   case 0:
                       return registro.getId_Proyecto();
                   case 1:
                       return registro.getNombre_Material();
               }
               return null;
           }
           
       }
    
}
