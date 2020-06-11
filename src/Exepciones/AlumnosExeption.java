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
public class AlumnosExeption extends Exception {

    /**
     * Creates a new instance of <code>AlumnosExeption</code> without detail
     * message.
     */
    public AlumnosExeption() {
    }

    /**
     * Constructs an instance of <code>AlumnosExeption</code> with the specified
     * detail message.
     *
     * @param msg the detail message.
     */
    public AlumnosExeption(String msg) {
        super(msg);
    }
}
