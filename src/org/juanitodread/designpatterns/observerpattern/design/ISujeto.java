package org.juanitodread.designpatterns.observerpattern.design;

/**
 * Interfaz que tiene que implementar el sujeto a observar.
 * 
 * @author juan.sandoval
 */
public interface ISujeto {

    public void addObservador(IObservador obs);
    public void removeLastObservador();
    public void notificarObservadores();

}
