/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.juanitodread.designpatterns.factorypattern.beans;

import java.util.ArrayList;

/**
 *
 * @author marce
 */
public abstract class Pizza {
    
    private String name;
    private String dough;
    private String sauce;
    private ArrayList toppings = new ArrayList();
    
    public void prepare(){        
        System.out.println("Preparando: " +  getName());
        System.out.println("Amasando: " +  getDough());
        System.out.println("Colocando salsa: " +  getSauce());
        System.out.println("Colocando ingredientes: " +  getToppings());
    }
    
    public void bake(){
        System.out.println("Horneando....");
    }
    
    public void cut(){
       System.out.println("Cortando...."); 
    }
    
    public void box(){
        System.out.println("Empaquetando....");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDough() {
        return dough;
    }

    public void setDough(String dough) {
        this.dough = dough;
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public ArrayList getToppings() {
        return toppings;
    }

    public void setToppings(ArrayList toppings) {
        this.toppings = toppings;
    }        
    
}
