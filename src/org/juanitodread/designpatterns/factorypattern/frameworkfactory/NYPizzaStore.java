/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.juanitodread.designpatterns.factorypattern.frameworkfactory;

import org.juanitodread.designpatterns.factorypattern.beans.Pizza;
import org.juanitodread.designpatterns.factorypattern.beans.frameworkfactory.NewYorkCheesePizzaStyle;
import org.juanitodread.designpatterns.factorypattern.beans.frameworkfactory.NewYorkVeggiePizzaStyle;

/**
 *
 * @author marce
 */
public class NYPizzaStore extends PizzaStore{

    @Override
    protected Pizza createPizza(String name) {
       
       Pizza pizza = null;
        
        if(name.equals("Vegetariana")){
            pizza = new NewYorkVeggiePizzaStyle();
        }else if(name.equals("Queso")){
           pizza = new NewYorkCheesePizzaStyle();
        }  
        
        return pizza; 
        
    }
    
}
