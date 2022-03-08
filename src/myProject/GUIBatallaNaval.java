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
    private JPanel espacio1, espacio2, espacio3, espacio4, espacio5, espacio6, espacio7
            , panelInfo, tableroPosicion, tableroPrincipal;
    private JButton fragata, portavion, submarino, destructor, ayuda, salir, trampa;
    private JLabel infoFallo, imagenFallo, infoImpacto, infoHundido, imagenHundido;
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
        setBackground(new Color(208, 206, 206));
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
        espacio1.setPreferredSize(new Dimension(50, 400));
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

        fragata = new JButton("Fragata");
        fragata.setFont(new Font("SansSerif", Font.BOLD + Font.PLAIN, 14));
        fragata.setForeground(Color.black);
        fragata.setBackground(Color.white);
        fragata.setPreferredSize(new Dimension(119,20));
        constraints.gridx = 2;
        constraints.gridy = 2;
        constraints.fill = GridBagConstraints.CENTER;
        constraints.anchor = GridBagConstraints.CENTER;

        this.add(fragata, constraints);

        portavion = new JButton("Portaviones");
        portavion.setFont(new Font("SansSerif", Font.BOLD + Font.PLAIN, 14));
        portavion.setForeground(Color.black);
        portavion.setBackground(Color.white);
        portavion.setPreferredSize(new Dimension(119,20));
        constraints.gridx = 3;
        constraints.gridy = 2;
        constraints.fill = GridBagConstraints.CENTER;
        constraints.anchor = GridBagConstraints.CENTER;

        this.add(portavion, constraints);

        submarino = new JButton("Submarino");
        submarino.setFont(new Font("SansSerif", Font.BOLD + Font.PLAIN, 14));
        submarino.setForeground(Color.black);
        submarino.setBackground(Color.white);
        submarino.setPreferredSize(new Dimension(119,20));
        constraints.gridx = 4;
        constraints.gridy = 2;
        constraints.fill = GridBagConstraints.CENTER;
        constraints.anchor = GridBagConstraints.CENTER;

        this.add(submarino, constraints);

        destructor = new JButton("Destructor");
        destructor.setFont(new Font("SansSerif", Font.BOLD + Font.PLAIN, 14));
        destructor.setForeground(Color.black);
        destructor.setBackground(Color.white);
        destructor.setPreferredSize(new Dimension(119,20));
        constraints.gridx = 5;
        constraints.gridy = 2;
        constraints.fill = GridBagConstraints.CENTER;
        constraints.anchor = GridBagConstraints.CENTER;

        this.add(destructor, constraints);

        espacio6 = new JPanel();
        espacio6.setOpaque(false);
        espacio6.setPreferredSize(new Dimension(50, 50));
        constraints.gridx = 6;
        constraints.gridy = 2;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.CENTER;

        this.add(espacio6, constraints);

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

        salir = new JButton("salir");
        salir.setFont(new Font("SansSerif", Font.BOLD + Font.PLAIN, 14));
        salir.setForeground(Color.white);
        salir.setBackground(new Color(192, 0, 0));
        constraints.gridx = 9;
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        constraints.fill = GridBagConstraints.CENTER;
        constraints.anchor = GridBagConstraints.CENTER;

        add(salir, constraints);

        espacio3 = new JPanel();
        espacio3.setOpaque(false);
        espacio3.setPreferredSize(new Dimension(50, 400));
        constraints.gridx = 11;
        constraints.gridy = 1;
        constraints.gridheight = 8;
        constraints.fill = GridBagConstraints.VERTICAL;

        this.add(espacio3, constraints);

        espacio4 = new JPanel();
        espacio4.setOpaque(false);
        espacio4.setPreferredSize(new Dimension(50, 30));
        constraints.gridx = 0;
        constraints.gridy = 3;
        constraints.gridwidth = 12;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.CENTER;
        constraints.anchor = GridBagConstraints.CENTER;

        this.add(espacio4, constraints);

        panelInfo = new JPanel();
        panelInfo.setBorder(BorderFactory.createTitledBorder("Información"));
        panelInfo.setBackground(Color.white);
        constraints.gridx = 8;
        constraints.gridy = 5;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.CENTER;
        constraints.anchor = GridBagConstraints.CENTER;

        addInfo();

        this.add(panelInfo, constraints);

        espacio5 = new JPanel();
        espacio5.setOpaque(false);
        espacio5.setPreferredSize(new Dimension(50, 30));
        constraints.gridx = 8;
        constraints.gridy = 6;
        constraints.gridwidth = 1;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.CENTER;
        constraints.anchor = GridBagConstraints.CENTER;

        this.add(espacio5, constraints);

        trampa = new JButton("tablero de posición del oponente");
        trampa.setFont(new Font("SansSerif", Font.PLAIN, 10));
        trampa.setForeground(Color.black);
        trampa.setBackground(new Color(231, 230, 230));
        constraints.gridx = 8;
        constraints.gridy = 7;
        constraints.gridwidth = 1;
        constraints.fill = GridBagConstraints.CENTER;
        constraints.anchor = GridBagConstraints.CENTER;

        add(trampa, constraints);

        tableroPosicion = new JPanel();
        tableroPosicion.setBackground(Color.white);
        tableroPosicion.setPreferredSize(new Dimension(510, 510));
        constraints.gridx = 1;
        constraints.gridy = 4;
        constraints.gridwidth = 6;
        constraints.gridheight = 4;
        constraints.fill = GridBagConstraints.CENTER;
        constraints.anchor = GridBagConstraints.CENTER;

        this.add(tableroPosicion, constraints);

        tableroPrincipal = new JPanel();
        tableroPrincipal.setBackground(Color.white);
        tableroPrincipal.setPreferredSize(new Dimension(510, 510));
        constraints.gridx = 10;
        constraints.gridy = 4;
        constraints.gridwidth = 1;
        constraints.gridheight = 4;
        constraints.fill = GridBagConstraints.CENTER;
        constraints.anchor = GridBagConstraints.CENTER;

        this.add(tableroPrincipal, constraints);

        espacio7 = new JPanel();
        espacio7.setOpaque(false);
        espacio7.setPreferredSize(new Dimension(50, 50));
        constraints.gridx = 0;
        constraints.gridy = 8;
        constraints.gridwidth = 12;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.CENTER;
        constraints.anchor = GridBagConstraints.CENTER;

        this.add(espacio7, constraints);

        revalidate();
        repaint();
    }

    public void addInfo()
    {
        panelInfo.setLayout(new GridBagLayout());
        GridBagConstraints constraintsPanelInfo = new GridBagConstraints();

        infoFallo = new JLabel("Fallo");
        infoFallo.setFont(new Font("SansSerif", Font.BOLD + Font.PLAIN, 14));
        infoFallo.setForeground(Color.black);
        infoFallo.setBackground(Color.white);
        infoFallo.setPreferredSize(new Dimension(100,75));
        infoFallo.setAlignmentY(SwingConstants.CENTER);
        infoFallo.setHorizontalAlignment(JLabel.CENTER);
        infoFallo.setVerticalAlignment(JLabel.CENTER);
        constraintsPanelInfo.gridx = 1;
        constraintsPanelInfo.gridy = 0;
        constraintsPanelInfo.fill = GridBagConstraints.CENTER;
        constraintsPanelInfo.anchor = GridBagConstraints.CENTER;

        panelInfo.add(infoFallo, constraintsPanelInfo);

        imagenFallo = new JLabel();
        unaImagen = new ImageIcon(getClass().getResource("/resources/4.png"));
        imagenOtroTamanho = unaImagen.getImage().getScaledInstance(100,75,Image.SCALE_SMOOTH);
        imagenNuevoTamanho = new ImageIcon(imagenOtroTamanho);
        imagenFallo.setIcon(imagenNuevoTamanho);
        imagenFallo.setPreferredSize(new Dimension(100,75));
        constraintsPanelInfo.gridx = 0;
        constraintsPanelInfo.gridy = 0;
        constraintsPanelInfo.fill = GridBagConstraints.CENTER;
        constraintsPanelInfo.anchor = GridBagConstraints.CENTER;

        panelInfo.add(imagenFallo, constraintsPanelInfo);

        infoImpacto = new JLabel("Impacto");
        infoImpacto.setFont(new Font("SansSerif", Font.BOLD + Font.PLAIN, 14));
        infoImpacto.setForeground(Color.black);
        infoImpacto.setBackground(Color.white);
        infoImpacto.setPreferredSize(new Dimension(100,75));
        infoImpacto.setAlignmentY(SwingConstants.CENTER);
        infoImpacto.setHorizontalAlignment(JLabel.CENTER);
        infoImpacto.setVerticalAlignment(JLabel.CENTER);
        constraintsPanelInfo.gridx = 1;
        constraintsPanelInfo.gridy = 1;
        constraintsPanelInfo.fill = GridBagConstraints.CENTER;
        constraintsPanelInfo.anchor = GridBagConstraints.CENTER;

        panelInfo.add(infoImpacto, constraintsPanelInfo);

        infoImpacto = new JLabel("\uF0FB");
        infoImpacto.setFont(new Font("SansSerif", Font.BOLD + Font.PLAIN, 14));
        infoImpacto.setForeground(Color.red);
        infoImpacto.setBackground(Color.white);
        infoImpacto.setPreferredSize(new Dimension(100,75));
        infoImpacto.setAlignmentY(SwingConstants.CENTER);
        infoImpacto.setHorizontalAlignment(JLabel.CENTER);
        infoImpacto.setVerticalAlignment(JLabel.CENTER);
        constraintsPanelInfo.gridx = 0;
        constraintsPanelInfo.gridy = 1;
        constraintsPanelInfo.fill = GridBagConstraints.CENTER;
        constraintsPanelInfo.anchor = GridBagConstraints.CENTER;

        panelInfo.add(infoImpacto, constraintsPanelInfo);

        infoHundido = new JLabel("Hundido");
        infoHundido.setFont(new Font("SansSerif", Font.BOLD + Font.PLAIN, 14));
        infoHundido.setForeground(Color.black);
        infoHundido.setBackground(Color.white);
        infoHundido.setPreferredSize(new Dimension(100,75));
        infoHundido.setAlignmentY(SwingConstants.CENTER);
        infoHundido.setHorizontalAlignment(JLabel.CENTER);
        infoHundido.setVerticalAlignment(JLabel.CENTER);
        constraintsPanelInfo.gridx = 1;
        constraintsPanelInfo.gridy = 2;
        constraintsPanelInfo.fill = GridBagConstraints.CENTER;
        constraintsPanelInfo.anchor = GridBagConstraints.CENTER;

        panelInfo.add(infoHundido, constraintsPanelInfo);

        imagenHundido = new JLabel();
        unaImagen = new ImageIcon(getClass().getResource("/resources/4.png"));
        imagenOtroTamanho = unaImagen.getImage().getScaledInstance(100,75,Image.SCALE_SMOOTH);
        imagenNuevoTamanho = new ImageIcon(imagenOtroTamanho);
        imagenHundido.setIcon(imagenNuevoTamanho);
        imagenHundido.setPreferredSize(new Dimension(100,75));
        constraintsPanelInfo.gridx = 0;
        constraintsPanelInfo.gridy = 2;
        constraintsPanelInfo.fill = GridBagConstraints.CENTER;
        constraintsPanelInfo.anchor = GridBagConstraints.CENTER;

        panelInfo.add(imagenHundido, constraintsPanelInfo);
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

/*
        unaImagen = new ImageIcon(getClass().getResource("/resources/4.png"));
        imagenOtroTamanho = unaImagen.getImage().getScaledInstance(50,50,Image.SCALE_SMOOTH);
        imagenNuevoTamanho = new ImageIcon(imagenOtroTamanho);
        */