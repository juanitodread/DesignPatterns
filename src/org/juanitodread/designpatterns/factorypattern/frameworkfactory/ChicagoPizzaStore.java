/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.juanitodread.designpatterns.factorypattern.frameworkfactory;

import org.juanitodread.designpatterns.factorypattern.beans.Pizza;
import org.juanitodread.designpatterns.factorypattern.beans.frameworkfactory.ChicagoCheesePizzaStyle;
import org.juanitodread.designpatterns.factorypattern.beans.frameworkfactory.ChicagoPeperoniPizzaStyle;

/**
 *
 * @author marce
 */
public class ChicagoPizzaStore extends PizzaStore{

    @Override
    protected Pizza createPizza(String name) {
       
       Pizza pizza = null;
        
        if(name.equals("Peperoni")){
            pizza = new ChicagoPeperoniPizzaStyle();
        }else if(name.equals("Queso")){
           pizza = new ChicagoCheesePizzaStyle();
        }  
        
        return pizza; 
        
    }
}
