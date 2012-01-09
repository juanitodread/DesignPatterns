package org.juanitodread.designpatterns.observerpattern.design;

import java.awt.BorderLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 * Creación de una clase que implementa ISujeto.
 * 
 * @author juan.sandoval
 */
public class Sujeto implements ISujeto{

    private JFrame frame;
    private JTextField txtNombre;
    private JButton btnNotificar;
    private BorderLayout layout;

    private String nombre = "";
    private List<IObservador> observadores = new ArrayList<IObservador>();

    private void pack(){
        frame = new JFrame("Sujeto");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 50);

        txtNombre = new JTextField();

        //btnNotificar = new JButton("Notificar");

        txtNombre.addKeyListener(new KeyListener() {

            public void keyTyped(KeyEvent e) {

            }

            public void keyPressed(KeyEvent e) {

            }

            public void keyReleased(KeyEvent e) {
                setNombre(txtNombre.getText());
            }
        });

//        btnNotificar.addActionListener(new ActionListener() {
//
//            public void actionPerformed(ActionEvent e) {
//                System.out.println("Entre " + txtNombre.getText());
//                setNombre(txtNombre.getText());
//            }
//        });

        layout = new BorderLayout();
        layout.addLayoutComponent(txtNombre, BorderLayout.CENTER);
        //layout.addLayoutComponent(btnNotificar, BorderLayout.SOUTH);
        frame.getContentPane().setLayout(layout);

        frame.getContentPane().add(txtNombre);
        //frame.getContentPane().add(btnNotificar);

        frame.setVisible(true);
    }

    public void loadView(){
        pack();
    }
   

    public void addObservador(IObservador obs) {

        observadores.add(obs);
    }

    public void removeLastObservador() {
        if(!observadores.isEmpty()){
            observadores.remove(observadores.size() - 1);
        }
    }

    public void notificarObservadores() {
        for(IObservador obs : observadores){
            obs.update();
        }
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
        notificarObservadores();
    }

}
