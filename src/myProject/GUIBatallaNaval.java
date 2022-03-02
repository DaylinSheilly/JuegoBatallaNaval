package myProject;

import javax.swing.*;
import java.awt.*;

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
    private JPanel espacio1, espacio2;
    private JButton fragata, portavion, submarino, destructor, ayuda;
    private ImageIcon unaImagen, imagenNuevoTamanho;
    private Image imagenOtroTamanho;

    /**
     * Constructor of GUIBatallaNaval class
     */
    public GUIBatallaNaval(){
        initGUI();

        //Default JFrame configuration
        this.setTitle("Batalla Naval");
        //this.setSize(200,100);
        this.pack();
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
        this.getContentPane().setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        //Create Listener Object and Control Object
        //Set up JComponents
        headerProject = new Header("Batalla Naval", new Color(68, 114, 196));
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 12;
        constraints.fill = GridBagConstraints.HORIZONTAL;

        this.add(headerProject, constraints);

        espacio1 = new JPanel();
        espacio1.setOpaque(false);
        espacio1.setPreferredSize(new Dimension(50, 100));
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridheight = 8;
        constraints.fill = GridBagConstraints.VERTICAL;

        this.add(espacio1, constraints);

        espacio2 = new JPanel();
        espacio2.setOpaque(false);
        espacio2.setPreferredSize(new Dimension(50, 50));
        constraints.gridx = 1;
        constraints.gridy = 2;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.CENTER;
        constraints.anchor = GridBagConstraints.CENTER;

        this.add(espacio2, constraints);

        fragata = new JButton();
        unaImagen = new ImageIcon(getClass().getResource("/resources/1.png"));
        imagenOtroTamanho = unaImagen.getImage().getScaledInstance(50,50,Image.SCALE_SMOOTH);
        imagenNuevoTamanho = new ImageIcon(imagenOtroTamanho);
        fragata.setIcon(imagenNuevoTamanho);
        constraints.gridx = 2;
        constraints.gridy = 2;
        constraints.fill = GridBagConstraints.CENTER;
        constraints.anchor = GridBagConstraints.CENTER;

        this.add(fragata, constraints);

        portavion = new JButton();
        unaImagen = new ImageIcon(getClass().getResource("/resources/2.png"));
        imagenOtroTamanho = unaImagen.getImage().getScaledInstance(50,50,Image.SCALE_SMOOTH);
        imagenNuevoTamanho = new ImageIcon(imagenOtroTamanho);
        portavion.setIcon(imagenNuevoTamanho);
        constraints.gridx = 3;
        constraints.gridy = 2;
        constraints.fill = GridBagConstraints.CENTER;
        constraints.anchor = GridBagConstraints.CENTER;

        this.add(portavion, constraints);

        submarino = new JButton();
        unaImagen = new ImageIcon(getClass().getResource("/resources/3.png"));
        imagenOtroTamanho = unaImagen.getImage().getScaledInstance(50,50,Image.SCALE_SMOOTH);
        imagenNuevoTamanho = new ImageIcon(imagenOtroTamanho);
        submarino.setIcon(imagenNuevoTamanho);
        constraints.gridx = 4;
        constraints.gridy = 2;
        constraints.fill = GridBagConstraints.CENTER;
        constraints.anchor = GridBagConstraints.CENTER;

        this.add(submarino, constraints);

        destructor = new JButton();
        unaImagen = new ImageIcon(getClass().getResource("/resources/4.png"));
        imagenOtroTamanho = unaImagen.getImage().getScaledInstance(50,50,Image.SCALE_SMOOTH);
        imagenNuevoTamanho = new ImageIcon(imagenOtroTamanho);
        destructor.setIcon(imagenNuevoTamanho);
        constraints.gridx = 5;
        constraints.gridy = 2;
        constraints.fill = GridBagConstraints.CENTER;
        constraints.anchor = GridBagConstraints.CENTER;

        this.add(destructor, constraints);

        ayuda = new JButton(" ? ");
        ayuda.setFont(new Font("SansSerif", Font.BOLD + Font.PLAIN, 14));
        ayuda.setForeground(Color.white);
        ayuda.setBackground(new Color(0, 112, 192));
        constraints.gridx = 7;
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        constraints.fill = GridBagConstraints.CENTER;
        constraints.anchor = GridBagConstraints.CENTER;

        add(ayuda, constraints);

        revalidate();
        repaint();
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
    private class Escucha {

    }
}