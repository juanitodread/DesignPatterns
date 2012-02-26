/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.juanitodread.designpatterns.factorypattern.simplefactory;

import org.juanitodread.designpatterns.factorypattern.beans.Pizza;

/**
 *
 * @author marce
 */
public class PizzaStore {
    
    SimplePizzaFactory factory;
    
    public PizzaStore(SimplePizzaFactory factory){
        this.factory = factory;
    }
    
    public Pizza orderPizza(String name){
        
        Pizza pizza = null;
        
        pizza = factory.createPizza(name);
        
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        
        return pizza;
    }
    
}
