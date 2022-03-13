package myProject;

import javax.swing.*;
import java.awt.*;

public class PintarBarcos extends JLabel {

    private int parteDelBarco, columna, fila;
    private boolean barcoCompleto;

    /**
     * Case 1: inicio del barco en vertical
     * Case 2: final del barco en vertical
     * Case 3: inicio del barco en horizontal
     * Case 4: final del barco en horizontal
     * Case 5: cuerpo del barco
     * Case 1: start of the boat vertically
     * Case 2: vertical end of the boat
     * Case 3: boat start horizontal
     * Case 4: horizontal end of the boat
     * Case 5: boat body
     * @param
     */

    public PintarBarcos(int fila, int columna){
        fila = 0;
        columna = 0;
        parteDelBarco = 0;
        barcoCompleto = false;
    }

    /*public void insertarBarco(int nombreDelBarco, int fila, int columna){
        if(nombreDelBarco == 1){
            barcoCompleto = true;
            parteDelBarco++;
        }
        if(nombreDelBarco == 2){
            barcoCompleto = false;
            parteDelBarco++;
        }
        if(nombreDelBarco == 3){
            barcoCompleto = false;
            parteDelBarco++;
        }else{
            barcoCompleto = false;
            parteDelBarco++;
        }
    }*/

    public void insertarBarco(){
        parteDelBarco++;
        repaint();
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
}
