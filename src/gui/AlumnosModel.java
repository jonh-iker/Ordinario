/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import controller.Controlador;
import javax.swing.table.AbstractTableModel;
import objects.Alumno;

/**
 *
 * @author jonhy
 */
public class AlumnosModel extends AbstractTableModel{

    private Controlador control;
    
    public AlumnosModel(Controlador controlador){
    
    }

 
    
    @Override
    public int getRowCount() {
        return control.getAlumnoscounting();
    }
    @Override
    public int getColumnCount() {
        return 6;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Alumno a= control.getAlumnoindex(rowIndex);
        switch(columnIndex){
            case 0: 
                return a.getMatricula();
            case 1: 
                return a.getNombre();       
            case 2: 
                return a.getPaterno();
            case 3: 
                return a.getMaterno();
            case 4: 
                return a.getFecha();
            case 5: 
                return a.getCarrera();
           default:
                 throw new AssertionError();    
            
        }
    }

    @Override
    public String getColumnName(int column) {
        switch(column){
            case 0: 
                return "matricula";
            case 1: 
                return "nombre";
            case 2: 
                return "A.paterno";
            case 3: 
                return "A.materno";
            case 4: 
                return "fecha de nacimiento";
            case 5: 
                return "carrera";
             default:
                 throw new AssertionError();
        }
        
    }
    
   
   
}
