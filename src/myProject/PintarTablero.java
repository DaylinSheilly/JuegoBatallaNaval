package myProject;

import javax.swing.*;
import java.awt.*;

public class PintarTablero extends JPanel {
    private Casilla[][] casillas;
    private Casilla casillaSeleccionada;

    public PintarTablero(){
        setBackground(Color.white);
        setPreferredSize(new Dimension(510, 510));
        setLayout(new GridLayout(10,10));
        casillas = new Casilla [10][10];
    }

}
