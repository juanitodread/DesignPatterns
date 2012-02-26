/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.juanitodread.designpatterns.factorypattern.simplefactory;

import org.juanitodread.designpatterns.factorypattern.beans.Pizza;
import org.juanitodread.designpatterns.factorypattern.beans.simplefactory.CheesePizza;
import org.juanitodread.designpatterns.factorypattern.beans.simplefactory.PeperoniPizza;
import org.juanitodread.designpatterns.factorypattern.beans.simplefactory.VeggiePizza;

/**
 *
 * @author marce
 */
public class SimplePizzaFactory {
    
    public SimplePizzaFactory(){
        
    }
    
    public Pizza createPizza(String name){
        
        Pizza pizza = null;
        
        if(name.equals("Peperoni")){
            pizza = new PeperoniPizza();
        }else if(name.equals("Vegetariana")){
            pizza = new VeggiePizza();
        }else if(name.equals("Queso")){
           pizza = new CheesePizza(); 
        }  
        
        return pizza;  
    }    
}
