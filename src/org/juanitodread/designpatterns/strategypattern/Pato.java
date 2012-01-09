package org.juanitodread.designpatterns.strategypattern;

import org.juanitodread.designpatterns.strategypattern.comportamiento.IVolar;

/**
 *
 * @author juan.sandoval
 */
public abstract class Pato {
    private String nombre;
    private int edad;
    private IVolar vuela;

    public abstract void getVolar();

    public Pato(){
        this.nombre = "";
        this.edad = 0;
    }

    public Pato(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public IVolar getVuela() {
        return vuela;
    }

    public void setVuela(IVolar vuela) {
        this.vuela = vuela;
    }   
}

