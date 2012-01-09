package org.juanitodread.designpatterns.strategypattern.comportamiento;

/**
 *
 * @author juan.sandoval
 */
public class NoVolar implements IVolar{

    public void volar() {
        System.out.println("Yo no puedo volar.");
    }

}