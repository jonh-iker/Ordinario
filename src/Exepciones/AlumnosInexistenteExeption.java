/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exepciones;

/**
 *
 * @author jonhy
 */
public class AlumnosInexistenteExeption extends Exception {

    /**
     * Creates a new instance of <code>AlumnosInexistenteExeption</code> without
     * detail message.
     */
    public AlumnosInexistenteExeption() {
    }

    /**
     * Constructs an instance of <code>AlumnosInexistenteExeption</code> with
     * the specified detail message.
     *
     * @param msg the detail message.
     */
    public AlumnosInexistenteExeption(String msg) {
        super(msg);
    }
}
