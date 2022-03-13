package myProject;

import javax.swing.*;
import java.awt.*;

public class Casilla extends JButton {
    int fila, columna, nombreDelBarco, parteDelBarco;
    boolean barcoCompleto;

    public Casilla(int fila, int columna){
        this.fila = fila;
        this.columna = columna;
        this.setPreferredSize(new Dimension(5, 5));

    }

    public void insertarBarco(int nombreDelBarco){
        if(nombreDelBarco == 1){
            parteDelBarco = 1;
            barcoCompleto = true;
            repaint();
        }
        if(nombreDelBarco == 2){
            parteDelBarco = 2;
            barcoCompleto = false;
            repaint();
        }
        if(nombreDelBarco == 3){
            parteDelBarco = 3;
            barcoCompleto = false;
            repaint();
        }else{
            parteDelBarco = 4;
            barcoCompleto = false;
            repaint();
        }
    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        switch (parteDelBarco){
            case 1: g.setColor(Color.BLACK);
                 g.drawRect(fila, columna, 5, 5);
                break;
            case 2: g.setColor(Color.BLACK);
                 g.drawRect(fila, columna, 5, 5);
                 g.drawRect(fila, columna, 5, 5);
                break;
            case 3: g.setColor(Color.BLACK);
                 g.drawRect(fila, columna, 5, 5);
                 g.drawRect(fila, columna, 5, 5);
                 g.drawRect(fila, columna, 5, 5);
                break;
            case 4: g.setColor(Color.BLACK);
                 g.drawRect(fila, columna, 5, 5);
                 g.drawRect(fila, columna, 5, 5);
                 g.drawRect(fila, columna, 5, 5);
                 g.drawRect(fila, columna, 5, 5);
                 break;
        }
    }

    public int getFila() {
        return fila;
    }

    public int getColumna() {
        return columna;
    }

    public int getBarco(Casilla casilla){ return  nombreDelBarco; }

    public boolean getBarcoCompleto(Casilla casilla){
        return barcoCompleto;
    }

}
