/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.juanitodread.designpatterns.observerpattern.design;

/**
 *
 * @author juan.sandoval
 */
public class Main {

    public static void main(String... args){
        Sujeto suj = new Sujeto();        
        Observador uno = new Observador(suj, "UNO");
        Observador dos = new Observador(suj, "DOS");
        Observador tres = new Observador(suj, "TRES");
        suj.loadView();
    }

}
