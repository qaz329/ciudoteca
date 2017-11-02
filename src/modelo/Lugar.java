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
public class Lugar {
    
    private int id;
    private String nombre;
    private Ciudad ciudad;
    private String descripcion;
    private static int i = 1;

    public Lugar() {}
    
    public Lugar(Ciudad ciudad, String nombre) {
        this.ciudad = ciudad;
        this.nombre = nombre;
        this.id = this.i++;
    }

    @Override
    public String toString() {
        return "Lugar{" + "id=" + id + ", nombre=" + nombre + ", ciudad=" + ciudad + ", descripcion=" + descripcion + '}';
    }
        
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Ciudad getCiudad() {
        return ciudad;
    }

    public void setCiudad(Ciudad ciudad) {
        this.ciudad = ciudad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
}
