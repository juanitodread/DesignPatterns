/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.juanitodread.designpatterns.factorypattern.beans.simplefactory;

import org.juanitodread.designpatterns.factorypattern.beans.Pizza;
import java.util.ArrayList;

/**
 *
 * @author marce
 */
public class PeperoniPizza extends Pizza{        
    
    private ArrayList topping = new ArrayList();    
    
    public PeperoniPizza(){
        this.setName("Pizza de Peperoni");
        this.setDough("Masa con Queso");
        this.setSauce("Tomate");
        topping.add("Peperoni");
        this.setToppings(topping);
    }
}
