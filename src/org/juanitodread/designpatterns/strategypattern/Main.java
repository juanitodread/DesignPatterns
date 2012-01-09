package org.juanitodread.designpatterns.strategypattern;

/**
 *
 * @author juan.sandoval
 */
public class Main {

    public static void main(String... args){
        Pato generico = new PatoGordo();
        generico.getVolar();

        generico = new PatoHule();
        generico.getVolar();

        generico = new PatoVolador();
        generico.getVolar();
    }

}