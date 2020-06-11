/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import Interfaces.AlumnosListener;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import objects.Alumno;
import objects.Carrera;
import objects.Fecha;

/**
 *
 * @author jonhy
 */
public class AlumnoDialog extends JDialog{
    
    private JPanel plwork;
    private JPanel plbutton;
    
    private JButton aceptar;
    private JButton cancelar;
    
    private AlumnosListener listener;
    
    public AlumnoDialog(JFrame owner){
        super(owner, "Datos del Alumno", true);
        super.setSize(400,300);
        super.setLayout(new BorderLayout());
        super.setLocationRelativeTo(owner);
        
        aceptar= new JButton("Aceptar");
        aceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Alumno alumno;
                alumno = new Alumno("014407124", "Audrey", "Becerra", "Calderon", Carrera.LENGUAS_MODERNAS, new Fecha(8,8, 2001));
                listener.aceptarbutton(alumno);
            }
        });
        cancelar= new JButton("Cancelar");
        cancelar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AlumnoDialog.this.setVisible(false);
            }
        });
        
        plwork= new JPanel();
        plbutton=new JPanel();
        plbutton.setLayout(new FlowLayout(FlowLayout.RIGHT));
        plbutton.setBackground(Color.red);
        plbutton.add(aceptar);
        plbutton.add(cancelar);
        
        super.add(plwork,BorderLayout.CENTER);
        super.add(plbutton,BorderLayout.SOUTH);
        
        super.setVisible(false);
    }

    public void setListener(AlumnosListener listener) {
        this.listener = listener;
    }

   
}
