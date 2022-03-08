package myProject;

import javax.swing.*;
import java.awt.*;

public class Casilla extends JButton {
    int fila, columna, nombreDelBarco;
    boolean parteDelBarco;
    private ImageIcon imageBarco, imagenNuevoTamanho;
    private Image imagenOtroTamanho;

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);

        g.setColor(new Color(20, 90, 219));
        g.drawRect(fila, columna, 5, 5);

    }

    public int getBarco(Casilla casilla){
        return  nombreDelBarco;

    }

    public boolean getParteDelBarco(Casilla casilla){
        return parteDelBarco;
    }

    /*public void insertarBarco(int nombreDelBarco){
        if(nombreDelBarco == 1){
            parteDelBarco=false;
            barco.insertarTodoElBarco;
        }
        if(nombreDelBarco == 2){
            parteDelBarco = true;
            barco.insertarTodoElBarco;
        }
    }*/
}
