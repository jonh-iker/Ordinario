/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import Exepciones.AlumnosExeption;
import Interfaces.AlumnosListener;
import controller.Controlador;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import objects.Alumno;

/**
 *
 * @author jonhy
 */
public class PrincipalFrame extends JFrame {
    private EncabezadoPanel enlpanel;
    private SearchPanel srlpanel;
    private WorkPanel wklpanel;
    private Controlador controlador;
    private AlumnoDialog dlgalumno;
    
    public PrincipalFrame(){
        super("control escolar");
        super.setLayout(new BorderLayout());
        super.setSize(800,500);
        super.setLocationRelativeTo(null);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setVisible(true);
        
        dlgalumno= new AlumnoDialog(this);
        dlgalumno.setListener(new AlumnosListener() {
            @Override
            public void aceptarbutton(Alumno alumno) {
                try {
                    controlador.addAlumno(alumno);
                } catch (AlumnosExeption ex) {
                    JOptionPane.showMessageDialog(PrincipalFrame.this,"matricula ya ingresada");
                }
            }
        });
        
        controlador= new Controlador();
        enlpanel= new EncabezadoPanel();
        srlpanel= new SearchPanel();
        wklpanel= new WorkPanel(controlador);
        
        super.setJMenuBar(crearmenu());
        
        super.add(enlpanel,BorderLayout.NORTH);
        super.add(srlpanel,BorderLayout.SOUTH);
        super.add(wklpanel,BorderLayout.CENTER);
    }
     private JMenuBar crearmenu(){
    JMenuBar mbmain= new JMenuBar();
    
    JMenu archivo= new JMenu("Archivo");
    JMenuItem minuevo= new JMenuItem("Nuevo Alumno..");
        minuevo.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            dlgalumno.setVisible(true);
        }
    });
    JMenuItem misalir= new JMenuItem("Salir");
        misalir.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            System.exit(0);;
        }
    });
        archivo.add(minuevo);
        archivo.addSeparator();
        archivo.add(misalir);
        
        JMenu ayuda= new JMenu("Ayuda");
        JMenuItem miacercade= new JMenuItem("Acerca de...");
        
        mbmain.add(archivo);
        mbmain.add(ayuda);
        
        return mbmain;
    }
}
