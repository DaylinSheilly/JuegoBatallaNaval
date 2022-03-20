package myProject;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

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
    private PintarTablero tableroPrincipal, tableroPosicion;
    private CasillaPrincipal[][] casillasPrincipal;
    private ModelBatallaNaval game;
    private CasillaPrincipal casillaPrincipalSeleccionada;
    private CasillaPosicion[][] casillasPosicion;
    private CasillaPosicion casillaPosicionSeleccionada;
    private Escucha escucha;
    private JPanel espacio1, espacio2, espacio3, espacio4, espacio5, espacio6, espacio7, panelInfo, panelOrientacion;
    private JButton fragata, portavion, submarino, destructor, ayuda, salir, trampa, opcionHorizontal, opcionVertical;
    private JLabel infoFallo, imagenFallo, infoImpacto, infoHundido, imagenHundido;
    private ImageIcon unaImagen, imagenNuevoTamanho;
    private Image imagenOtroTamanho;
    private int cantidadFragatas, cantidadDestructores, cantidadSubmarinos, cantidadPortaviones, orientacion;
    private boolean acceso, trampaAbilitada = false;
    private String cualBarco = "";

    /**
     * Constructor of GUIBatallaNaval class
     */
    public GUIBatallaNaval() {
        initGUI();

        //Default JFrame configuration
        this.setTitle("Batalla Naval");
        //this.setSize(1320,700);
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
     */
    private void initGUI() {
        //Set up JFrame Container's Layout
        this.getContentPane().setLayout(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        //Create Listener Object and Control Object
        escucha = new Escucha();
        game = new ModelBatallaNaval();
        //Set up JComponents

        cantidadFragatas = 4;
        cantidadDestructores = 3;
        cantidadSubmarinos = 2;
        cantidadPortaviones = 1;
        orientacion = 0;

        casillaPosicionSeleccionada = new CasillaPosicion(0, 0);
        casillaPrincipalSeleccionada = new CasillaPrincipal(0, 0);

        headerProject = new Header("Batalla Naval", new Color(68, 114, 196));
        constraints.gridx = 0;
        constraints.gridy = 0;
        constraints.gridwidth = 12;
        constraints.fill = GridBagConstraints.HORIZONTAL;

        this.add(headerProject, constraints);

        //-------------------------------------------------------------------------------------------------------------------------

        espacio1 = new JPanel();
        espacio1.setOpaque(false);
        espacio1.setPreferredSize(new Dimension(50, 600));
        constraints.gridx = 0;
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        constraints.gridheight = 8;
        constraints.fill = GridBagConstraints.VERTICAL;

        this.add(espacio1, constraints);

        //-------------------------------------------------------------------------------------------------------------------------

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

        //-------------------------------------------------------------------------------------------------------------------------

        fragata = new JButton();
        unaImagen = new ImageIcon(getClass().getResource("/resources/1.png"));
        imagenOtroTamanho = unaImagen.getImage().getScaledInstance(25, 25, Image.SCALE_SMOOTH);
        imagenNuevoTamanho = new ImageIcon(imagenOtroTamanho);
        fragata.setIcon(imagenNuevoTamanho);
        fragata.addMouseListener(escucha);
        constraints.gridx = 2;
        constraints.gridy = 2;
        constraints.fill = GridBagConstraints.CENTER;
        constraints.anchor = GridBagConstraints.CENTER;

        this.add(fragata, constraints);

        //-------------------------------------------------------------------------------------------------------------------------

        destructor = new JButton();
        unaImagen = new ImageIcon(getClass().getResource("/resources/2.png"));
        imagenOtroTamanho = unaImagen.getImage().getScaledInstance(50, 25, Image.SCALE_SMOOTH);
        imagenNuevoTamanho = new ImageIcon(imagenOtroTamanho);
        destructor.setIcon(imagenNuevoTamanho);
        destructor.addMouseListener(escucha);
        constraints.gridx = 3;
        constraints.gridy = 2;
        constraints.fill = GridBagConstraints.CENTER;
        constraints.anchor = GridBagConstraints.CENTER;

        this.add(destructor, constraints);

        //-------------------------------------------------------------------------------------------------------------------------

        submarino = new JButton();
        unaImagen = new ImageIcon(getClass().getResource("/resources/3.png"));
        imagenOtroTamanho = unaImagen.getImage().getScaledInstance(75, 25, Image.SCALE_SMOOTH);
        imagenNuevoTamanho = new ImageIcon(imagenOtroTamanho);
        submarino.setIcon(imagenNuevoTamanho);
        submarino.addMouseListener(escucha);
        constraints.gridx = 4;
        constraints.gridy = 2;
        constraints.fill = GridBagConstraints.CENTER;
        constraints.anchor = GridBagConstraints.CENTER;

        this.add(submarino, constraints);

        //-------------------------------------------------------------------------------------------------------------------------

        portavion = new JButton();
        unaImagen = new ImageIcon(getClass().getResource("/resources/4.png"));
        imagenOtroTamanho = unaImagen.getImage().getScaledInstance(100, 25, Image.SCALE_SMOOTH);
        imagenNuevoTamanho = new ImageIcon(imagenOtroTamanho);
        portavion.setIcon(imagenNuevoTamanho);
        portavion.addMouseListener(escucha);
        constraints.gridx = 5;
        constraints.gridy = 2;
        constraints.fill = GridBagConstraints.CENTER;
        constraints.anchor = GridBagConstraints.CENTER;

        this.add(portavion, constraints);

        //-------------------------------------------------------------------------------------------------------------------------

        espacio6 = new JPanel();
        espacio6.setOpaque(false);
        espacio6.setPreferredSize(new Dimension(50, 50));
        constraints.gridx = 6;
        constraints.gridy = 2;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.CENTER;

        this.add(espacio6, constraints);

        //-------------------------------------------------------------------------------------------------------------------------

        ayuda = new JButton(" ? ");
        ayuda.setFont(new Font("SansSerif", Font.BOLD + Font.PLAIN, 14));
        ayuda.setForeground(Color.white);
        ayuda.setBackground(new Color(0, 112, 192));
        ayuda.addMouseListener(escucha);
        constraints.gridx = 7;
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        constraints.fill = GridBagConstraints.CENTER;
        constraints.anchor = GridBagConstraints.CENTER;

        add(ayuda, constraints);

        //-------------------------------------------------------------------------------------------------------------------------

        salir = new JButton("salir");
        salir.setFont(new Font("SansSerif", Font.BOLD + Font.PLAIN, 14));
        salir.setForeground(Color.white);
        salir.setBackground(new Color(192, 0, 0));
        salir.addMouseListener(escucha);
        constraints.gridx = 9;
        constraints.gridy = 1;
        constraints.gridwidth = 1;
        constraints.fill = GridBagConstraints.CENTER;
        constraints.anchor = GridBagConstraints.CENTER;

        add(salir, constraints);

        //-------------------------------------------------------------------------------------------------------------------------

        espacio3 = new JPanel();
        espacio3.setOpaque(false);
        espacio3.setPreferredSize(new Dimension(50, 50));
        constraints.gridx = 11;
        constraints.gridy = 1;
        constraints.gridheight = 8;
        constraints.fill = GridBagConstraints.VERTICAL;

        this.add(espacio3, constraints);

        //-------------------------------------------------------------------------------------------------------------------------

        espacio4 = new JPanel();
        espacio4.setOpaque(false);
        espacio4.setPreferredSize(new Dimension(50, 50));
        constraints.gridx = 0;
        constraints.gridy = 3;
        constraints.gridwidth = 12;
        constraints.gridheight = 1;
        constraints.fill = GridBagConstraints.CENTER;
        constraints.anchor = GridBagConstraints.CENTER;

        this.add(espacio4, constraints);

        //-------------------------------------------------------------------------------------------------------------------------

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

        //-------------------------------------------------------------------------------------------------------------------------

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

        //-------------------------------------------------------------------------------------------------------------------------

        trampa = new JButton("tablero de posición del oponente");
        trampa.setFont(new Font("SansSerif", Font.PLAIN, 10));
        trampa.setForeground(Color.black);
        trampa.setBackground(new Color(231, 230, 230));
        trampa.addMouseListener(escucha);
        constraints.gridx = 8;
        constraints.gridy = 7;
        constraints.gridwidth = 1;
        constraints.fill = GridBagConstraints.CENTER;
        constraints.anchor = GridBagConstraints.CENTER;

        add(trampa, constraints);

        tableroPosicion = new PintarTablero();
        tableroPosicion.decoradoDelTablero();

        casillasPosicion = new CasillaPosicion[11][11];

        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                casillasPosicion[i][j] = new CasillaPosicion(i, j);
                casillasPosicion[i][j].removeMouseListener(escucha);
                tableroPosicion.add(casillasPosicion[i][j]);
                if (i == 0 || j == 0) {
                    casillasPosicion[i][j].setVisible(false);
                }
            }
        }
        constraints.gridx = 1;
        constraints.gridy = 4;
        constraints.gridwidth = 6;
        constraints.gridheight = 4;
        constraints.fill = GridBagConstraints.CENTER;
        constraints.anchor = GridBagConstraints.CENTER;

        this.add(tableroPosicion, constraints);

        //-------------------------------------------------------------------------------------------------------------------------


        tableroPrincipal = new PintarTablero();
        tableroPrincipal.decoradoDelTablero();

        casillasPrincipal = new CasillaPrincipal[11][11];

        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                casillasPrincipal[i][j] = new CasillaPrincipal(i, j);
                casillasPrincipal[i][j].removeMouseListener(escucha);
                tableroPrincipal.add(casillasPrincipal[i][j]);
                if (i == 0 || j == 0) {
                    casillasPrincipal[i][j].setVisible(false);
                }
            }
        }
        constraints.gridx = 10;
        constraints.gridy = 4;
        constraints.gridwidth = 1;
        constraints.gridheight = 4;
        constraints.fill = GridBagConstraints.CENTER;
        constraints.anchor = GridBagConstraints.CENTER;

        this.add(tableroPrincipal, constraints);

        //-------------------------------------------------------------------------------------------------------------------------

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

        //-------------------------------------------------------------------------------------------------------------------------

        panelOrientacion = new JPanel();
        opcionHorizontal = new JButton();
        opcionVertical = new JButton();

        //-------------------------------------------------------------------------------------------------------------------------

        revalidate();
        repaint();
    }

    public void addInfo() {
        panelInfo.setLayout(new GridBagLayout());
        GridBagConstraints constraintsPanelInfo = new GridBagConstraints();

        infoFallo = new JLabel("Fallo");
        infoFallo.setFont(new Font("SansSerif", Font.BOLD + Font.PLAIN, 14));
        infoFallo.setForeground(Color.black);
        infoFallo.setBackground(Color.white);
        infoFallo.setPreferredSize(new Dimension(100, 75));
        infoFallo.setAlignmentY(SwingConstants.CENTER);
        infoFallo.setHorizontalAlignment(JLabel.CENTER);
        infoFallo.setVerticalAlignment(JLabel.CENTER);
        constraintsPanelInfo.gridx = 1;
        constraintsPanelInfo.gridy = 0;
        constraintsPanelInfo.fill = GridBagConstraints.CENTER;
        constraintsPanelInfo.anchor = GridBagConstraints.CENTER;

        panelInfo.add(infoFallo, constraintsPanelInfo);

        imagenFallo = new JLabel();
        unaImagen = new ImageIcon(getClass().getResource("/resources/fallar.png"));
        imagenOtroTamanho = unaImagen.getImage().getScaledInstance(47, 75, Image.SCALE_SMOOTH);
        imagenNuevoTamanho = new ImageIcon(imagenOtroTamanho);
        imagenFallo.setIcon(imagenNuevoTamanho);
        imagenFallo.setPreferredSize(new Dimension(47, 75));
        constraintsPanelInfo.gridx = 0;
        constraintsPanelInfo.gridy = 0;
        constraintsPanelInfo.fill = GridBagConstraints.CENTER;
        constraintsPanelInfo.anchor = GridBagConstraints.CENTER;

        panelInfo.add(imagenFallo, constraintsPanelInfo);

        infoImpacto = new JLabel("Impacto");
        infoImpacto.setFont(new Font("SansSerif", Font.BOLD + Font.PLAIN, 14));
        infoImpacto.setForeground(Color.black);
        infoImpacto.setBackground(Color.white);
        infoImpacto.setPreferredSize(new Dimension(100, 75));
        infoImpacto.setAlignmentY(SwingConstants.CENTER);
        infoImpacto.setHorizontalAlignment(JLabel.CENTER);
        infoImpacto.setVerticalAlignment(JLabel.CENTER);
        constraintsPanelInfo.gridx = 1;
        constraintsPanelInfo.gridy = 1;
        constraintsPanelInfo.fill = GridBagConstraints.CENTER;
        constraintsPanelInfo.anchor = GridBagConstraints.CENTER;

        panelInfo.add(infoImpacto, constraintsPanelInfo);

        infoImpacto = new JLabel("\uF0FB");
        infoImpacto.setFont(new Font("SansSerif", Font.BOLD + Font.PLAIN, 50));
        infoImpacto.setForeground(Color.red);
        infoImpacto.setBackground(Color.white);
        infoImpacto.setPreferredSize(new Dimension(100, 75));
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
        infoHundido.setPreferredSize(new Dimension(100, 75));
        infoHundido.setAlignmentY(SwingConstants.CENTER);
        infoHundido.setHorizontalAlignment(JLabel.CENTER);
        infoHundido.setVerticalAlignment(JLabel.CENTER);
        constraintsPanelInfo.gridx = 1;
        constraintsPanelInfo.gridy = 2;
        constraintsPanelInfo.fill = GridBagConstraints.CENTER;
        constraintsPanelInfo.anchor = GridBagConstraints.CENTER;

        panelInfo.add(infoHundido, constraintsPanelInfo);

        imagenHundido = new JLabel();
        unaImagen = new ImageIcon(getClass().getResource("/resources/hundido.png"));
        imagenOtroTamanho = unaImagen.getImage().getScaledInstance(100, 50, Image.SCALE_SMOOTH);
        imagenNuevoTamanho = new ImageIcon(imagenOtroTamanho);
        imagenHundido.setIcon(imagenNuevoTamanho);
        imagenHundido.setPreferredSize(new Dimension(100, 50));
        constraintsPanelInfo.gridx = 0;
        constraintsPanelInfo.gridy = 2;
        constraintsPanelInfo.fill = GridBagConstraints.CENTER;
        constraintsPanelInfo.anchor = GridBagConstraints.CENTER;

        panelInfo.add(imagenHundido, constraintsPanelInfo);
    }

    /**
     * Main process of the Java program
     *
     * @param args Object used in order to send input data from command line when
     *             the program is execute by console.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            GUIBatallaNaval miProjectGUIBatallaNaval = new GUIBatallaNaval();
        });
    }

    /**
     * inner class that extends an Adapter Class or implements Listeners used by GUIBatallaNaval class
     */
    private class Escucha extends MouseAdapter {

        @Override
        public void mouseClicked(MouseEvent e) {

            for (int x = 0; x < 11; x++) {
                for (int y = 0; y < 11; y++) {
                    if (e.getSource() == casillasPosicion[x][y]) {
                        casillaPosicionSeleccionada = casillasPosicion[x][y];
                        if(cualBarco.equals("fragata"))
                        {
                            cantidadFragatas--;
                            game.casillasDelBote(casillaPosicionSeleccionada);
                        }
                        else if(orientacion==1) {
                            if (cualBarco.equals("destructor")) {
                                cantidadDestructores--;
                                game.casillasDelBote(casillaPosicionSeleccionada,
                                        casillasPosicion[x][y + 1]);
                            } else if (cualBarco.equals("submarino")) {
                                cantidadSubmarinos--;
                                game.casillasDelBote(casillaPosicionSeleccionada,
                                        casillasPosicion[x][y + 1], casillasPosicion[x][y + 2]);
                            } else if (cualBarco.equals("portavion")) {
                                cantidadPortaviones--;
                                game.casillasDelBote(casillaPosicionSeleccionada,
                                        casillasPosicion[x][y + 1], casillasPosicion[x][y + 2], casillasPosicion[x][y + 3]);
                            }
                        }
                        else if(orientacion==0) {
                            if (cualBarco.equals("destructor")) {
                                cantidadDestructores--;
                                game.casillasDelBote(casillaPosicionSeleccionada,
                                        casillasPosicion[x + 1][y]);
                            } else if (cualBarco.equals("submarino")) {
                                cantidadSubmarinos--;
                                game.casillasDelBote(casillaPosicionSeleccionada,
                                        casillasPosicion[x + 1][y], casillasPosicion[x + 2][y]);
                            } else if (cualBarco.equals("portavion")) {
                                cantidadPortaviones--;
                                game.casillasDelBote(casillaPosicionSeleccionada,
                                        casillasPosicion[x + 1][y], casillasPosicion[x + 2][y], casillasPosicion[x + 3][y]);
                            }
                        }
                        break;
                    }
                    if (e.getSource() == casillasPrincipal[x][y]) {
                        casillaPrincipalSeleccionada = casillasPrincipal[x][y];
                        game.dispararACasilla(casillaPrincipalSeleccionada);
                        break;
                    }
                    añadirEscuchasColocarBarcos();
                    removerEscuchasTableroPosiciones();
                }
            }
            if(e.getSource()==ayuda)
            {

            }
            else if(e.getSource()==salir)
            {
                System.exit(0);
            }
            else if(e.getSource()==fragata)
            {
                cualBarco = "fragata";
                removerEscuchasColocarBarcos();
                añadirEscuchasTableroPosiciones();
            }
            else if(e.getSource()==destructor)
            {
                cualBarco = "destructor";
                orientacion = JOptionPane.showOptionDialog( null,"Orientacion",
                        "Seleccione la orientación del barco",JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.QUESTION_MESSAGE,null,// null para icono por defecto.
                        new Object[] { "Vertical", "Horizontal"},"opcion 1");
                removerEscuchasColocarBarcos();
                añadirEscuchasTableroPosiciones();
            }
            else if(e.getSource()==submarino)
            {
                cualBarco = "submarino";
                orientacion = JOptionPane.showOptionDialog( null,"Orientacion",
                        "Seleccione la orientación del barco",JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.QUESTION_MESSAGE,null,// null para icono por defecto.
                        new Object[] { "Vertical", "Horizontal"},"opcion 1");
                removerEscuchasColocarBarcos();
                añadirEscuchasTableroPosiciones();
            }
            else if(e.getSource()==portavion)
            {
                cualBarco = "portavion";
                orientacion = JOptionPane.showOptionDialog( null,"Orientacion",
                        "Seleccione la orientación del barco",JOptionPane.YES_NO_CANCEL_OPTION,
                        JOptionPane.QUESTION_MESSAGE,null,// null para icono por defecto.
                        new Object[] { "Vertical", "Horizontal"},"opcion 1");
                removerEscuchasColocarBarcos();
                añadirEscuchasTableroPosiciones();
            }

            else if(e.getSource()==trampa)
            {
                if(!acceso) {
                    String password = JOptionPane.showInputDialog("Digite la contraseña de permisos de administrador");
                    if (password.equals("Profe ponga 5.0 por favor")) {
                        JOptionPane.showMessageDialog(null, "Contraseña Correcta");
                        trampa.setBackground(new Color(146, 208, 80));
                        acceso=true;
                        trampaAbilitada=true;

                    }
                    else {
                        trampa.setVisible(false);
                        JOptionPane.showMessageDialog(null, "Para reintentar debes reabrir el juego");
                        acceso=false;
                    }
                }
                else {
                    if(trampaAbilitada) {
                        trampa.setBackground(new Color(231, 230, 230));
                        trampaAbilitada=false;

                    }
                    else{
                        trampa.setBackground(new Color(146, 208, 80));
                        trampaAbilitada=true;

                    }
                }
            }
            ocultarBotonesBarcos();
        }
    }

    public void ocultarBotonesBarcos()
    {
        if(cantidadFragatas <= 1)
        {
            fragata.setVisible(false);
        }
        if(cantidadDestructores <= 1)
        {
            destructor.setVisible(false);
        }
        if(cantidadSubmarinos <= 1)
        {
            submarino.setVisible(false);
        }
        if(cantidadPortaviones <= 0)
        {
            portavion.setVisible(false);
        }
        if(cantidadFragatas<=1 & cantidadSubmarinos<=1 & cantidadDestructores<=1 & cantidadPortaviones<=0)
        {
            System.out.println("Ya no hay mas barcos pa colocar");
            removerEscuchasTableroPosiciones();
            añadirEscuchasTableroPrincipal();
            removerEscuchasColocarBarcos();
        }
    }

    public void añadirEscuchasTableroPosiciones()
    {
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                casillasPosicion[i][j].removeMouseListener(escucha);
                casillasPosicion[i][j].addMouseListener(escucha);
            }
        }
    }
    public void removerEscuchasTableroPosiciones()
    {
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                casillasPosicion[i][j].removeMouseListener(escucha);
            }
        }
    }
    public void añadirEscuchasTableroPrincipal()
    {
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                casillasPrincipal[i][j].removeMouseListener(escucha);
                casillasPrincipal[i][j].addMouseListener(escucha);
            }
        }
    }
    public void removerEscuchasTableroPrincipal()
    {
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                casillasPrincipal[i][j].removeMouseListener(escucha);
            }
        }
    }

    public void removerEscuchasColocarBarcos(){
        fragata.removeMouseListener(escucha);
        destructor.removeMouseListener(escucha);
        submarino.removeMouseListener(escucha);
        portavion.removeMouseListener(escucha);
    }
    public void añadirEscuchasColocarBarcos(){
        fragata.removeMouseListener(escucha);
        fragata.addMouseListener(escucha);
        destructor.removeMouseListener(escucha);
        destructor.addMouseListener(escucha);
        submarino.removeMouseListener(escucha);
        submarino.addMouseListener(escucha);
        portavion.removeMouseListener(escucha);
        portavion.addMouseListener(escucha);
    }
}



