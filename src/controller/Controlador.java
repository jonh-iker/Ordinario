/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import Exepciones.AlumnosExeption;
import Exepciones.AlumnosInexistenteExeption;
import java.util.ArrayList;
import objects.Alumno;

/**
 *
 * @author jonhy
 */
public class Controlador {
    private ArrayList<Alumno>alumnos;
    
    public Controlador(){
    alumnos= new ArrayList<>();
    }
    public void addAlumno(Alumno alumno) throws AlumnosExeption{
        if(alumnos.contains(alumno)){
        throw new AlumnosExeption();
        }
        alumnos.add(alumno);
    }
    public ArrayList<Alumno> getAlumnos(){
    return alumnos;
    }
    public Alumno getAlumno(String matricula) throws AlumnosInexistenteExeption{
    int index= alumnos.indexOf(new Alumno(matricula));
        if (index < 0) {
            throw new AlumnosInexistenteExeption();
        }
        return alumnos.get(index);
    }
    
    
     public int getAlumnoscounting(){
    return alumnos.size();
    }
     
     public Alumno getAlumnoindex(int index){
     return alumnos.get(index);
     }
}
