/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

/**
 *
 * @author jonhy
 */
public class Alumno {
    private String matricula;
    private String nombre;
    private String paterno;
    private String materno;
    private Carrera carrera;
    private Fecha fecha;

    public Alumno(String matricula){
    
    }

    public Alumno(String matricula, String nombre, String paterno, String materno, Carrera carrera, Fecha fecha) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
        this.carrera = carrera;
        this.fecha = fecha;
    }
    

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Alumno) {
            Alumno alumno= (Alumno)obj;
            return this.matricula.compareTo(alumno.getMatricula())==0;
        }
        return false;
    }
    
    
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }
    
}
