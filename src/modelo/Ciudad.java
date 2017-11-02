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
public class Ciudad {
    
    private int id;
    private String nombre;
    private int nHabitantes;
    private static int i = 1;
    
    public Ciudad(String nombre, int nHab){
        this.nombre = nombre;
        this.nHabitantes = nHab;
        this.id = this.i++;
    }

    @Override
    public String toString() {
        return "Ciudad{" + "id=" + id + ", nombre=" + nombre + ", nHabitantes=" + nHabitantes + '}';
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

    public int getnHabitantes() {
        return nHabitantes;
    }

    public void setnHabitantes(int nHabitantes) {
        this.nHabitantes = nHabitantes;
    }
    
    
    
}
