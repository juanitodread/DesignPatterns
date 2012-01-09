package org.juanitodread.designpatterns.observerpattern.design;

import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 * Creación de una clase que implenta IObservador.
 * 
 * @author juan.sandoval
 */
public class Observador implements IObservador {

    private Sujeto sujeto;
    private String id;

    private JFrame frame;
    private JTextField txtValor;

    private void pack(){
        frame = new 
                JFrame("Observador: " + id);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 50);

        txtValor = new JTextField();

        frame.getContentPane().add(txtValor);
        frame.setVisible(true);
    }

    public Observador(Sujeto sujeto, String id){
        this.id = id;
        this.sujeto = sujeto;
        this.sujeto.addObservador(this);
        pack();
    }

    public void update() {
        //System.out.println("Observador: " + id + " -> El sujeto se ha actualizado, ahora se llama: " + sujeto.getNombre());
        txtValor.setText(sujeto.getNombre());
    }

}
