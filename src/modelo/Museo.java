/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author joane
 */
public class Museo extends Lugar {
    
    private int precio;
    private String descripcionHorario;

    public Museo() {}
    
    public Museo(Ciudad ciudad, String nombre, int precio, String descripcionHorario) {
        super(ciudad, nombre);
        this.precio = precio;
        this.descripcionHorario = descripcionHorario;
    }
    
    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getDescripcionHorario() {
        return descripcionHorario;
    }

    public void setDescripcionHorario(String descripcionHorario) {
        this.descripcionHorario = descripcionHorario;
    }
    
    
    
}
