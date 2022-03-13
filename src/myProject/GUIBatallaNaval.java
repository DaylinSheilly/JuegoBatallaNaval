package myProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * This class is used for ...
 * @autor Paola-J Rodriguez-C paola.rodriguez@correounivalle.edu.co
 * @version v.1.0.0 date:21/11/2021
 *
 * (ejemplo v.17.3.8 se lee: versión 17 del sofware, la tercera actualización del software
 *  * y la octava corrección de errores)
 */
public class GUIBatallaNaval extends JFrame {

    private Header headerProject;
    private PintarTablero tableroPosicion, tableroPrincipal;

    /**
     * Constructor of GUIBatallaNaval class
     */
    public GUIBatallaNaval(){
        initGUI();

        //Default JFrame configuration
        this.setTitle("The Title app");
        this.setSize(200,100);
        //this.pack();
        this.setResizable(true);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    /**
     * This method is used to set up the default JComponent Configuration,
     * create Listener and control Objects used for the GUIBatallaNaval class
     *
     */
    private void initGUI() {
        //Set up JFrame Container's Layout
        //Create Listener Object and Control Object
        //Set up JComponents
        headerProject = new Header("Header ...", Color.BLACK);
        this.add(headerProject,BorderLayout.NORTH); //Change this line if you change JFrame Container's Layout

        tableroPosicion = new PintarTablero();
        tableroPrincipal = new PintarTablero();


    }

    /**
     * Main process of the Java program
     * @param args Object used in order to send input data from command line when
     *             the program is execute by console.
     */
    public static void main(String[] args){
        EventQueue.invokeLater(() -> {
            GUIBatallaNaval miProjectGUIBatallaNaval = new GUIBatallaNaval();
        });
    }

    /**
     * inner class that extends an Adapter Class or implements Listeners used by GUIBatallaNaval class
     */
    /*private class Escucha implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == casillaSeleccionada){
                Casilla casillaSeleccionada = (Casilla)e.getSource(); //convierte el objeto casilla en objeto
            }
        }
    }*/
}
