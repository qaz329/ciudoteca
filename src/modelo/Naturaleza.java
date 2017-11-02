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
public class Naturaleza extends Lugar {
    
    private boolean montaña;
    private boolean mar;
    private boolean bosque;
    private boolean desierto;

    public Naturaleza() {
    }

    public Naturaleza(Ciudad ciudad, String nombre, boolean montaña, boolean mar, boolean bosque, boolean desierto) {
        super(ciudad, nombre);
        this.montaña = montaña;
        this.mar = mar;
        this.bosque = bosque;
        this.desierto = desierto;
    }

    public boolean isMontaña() {
        return montaña;
    }

    public void setMontaña(boolean montaña) {
        this.montaña = montaña;
    }

    public boolean isMar() {
        return mar;
    }

    public void setMar(boolean mar) {
        this.mar = mar;
    }

    public boolean isBosque() {
        return bosque;
    }

    public void setBosque(boolean bosque) {
        this.bosque = bosque;
    }

    public boolean isDesierto() {
        return desierto;
    }

    public void setDesierto(boolean desierto) {
        this.desierto = desierto;
    }
    
    
}
