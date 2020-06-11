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
public class Fecha {
    private Integer dia;
    private Integer mes;
    private Integer anio;

    
    public Fecha(Integer dia, Integer mes, Integer anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }

    public String toString(){
        return String.format("%d/%d/%d",dia,mes,anio);
    }
    public Integer getDia() {
        return dia;
    }

    public Integer getMes() {
        return mes;
    }

    public Integer getAnio() {
        return anio;
    }
    
   
}
