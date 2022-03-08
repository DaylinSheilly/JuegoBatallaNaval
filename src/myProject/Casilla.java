package myProject;

import javax.swing.*;
import java.awt.*;

public class Casilla extends JButton {
    int fila, columna, nombreDelBarco;
    boolean barcoCompleto;
    private ImageIcon imageBarco, imagenNuevoTamanho;
    private Image imagenOtroTamanho;

    public Casilla( int fila, int columna, int nombreDelBarco){

    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);

        g.setColor(new Color(20, 90, 219));
        g.drawRect(fila, columna, 5, 5);

    }

    public int getBarco(Casilla casilla){
        return  nombreDelBarco;

    }

    public boolean getBarcoCompleto(Casilla casilla){
        return barcoCompleto;
    }

}
