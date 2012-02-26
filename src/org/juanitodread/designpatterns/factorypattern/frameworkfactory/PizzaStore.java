/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.juanitodread.designpatterns.factorypattern.frameworkfactory;

import org.juanitodread.designpatterns.factorypattern.beans.Pizza;

/**
 *
 * @author marce
 */
public abstract class PizzaStore {
    
    public PizzaStore(){
        
    }
    
    public Pizza orderPizza(String name){
        
        Pizza pizza = null;
        
        pizza = createPizza(name);
        
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        
        return pizza;
    }
    
    protected abstract Pizza createPizza(String name);
}
