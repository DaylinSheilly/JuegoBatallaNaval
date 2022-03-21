package myProject;

import javax.swing.*;
import java.awt.*;

public class CasillaPosicion extends JButton {
    private int fila, columna, insertarElBarco, resultadoDeSeleccion, resistenciaDeImpactos;
    private String tipoDeBarco;
    private boolean barcoCompleto, parteDelBarco, tieneBarco, fueImpactada;
    private ImageIcon imageHundido, imagenNuevoTamanho, imageFallar;
    private Image imagenOtroTamanho;
    private ImageIconToImage imageTransformada;


    public CasillaPosicion(int fila, int columna){
        this.fila = fila;
        this.columna = columna;
        this.setPreferredSize(new Dimension(46, 46));
        setBackground(new Color(24, 90, 219));

        imageTransformada = new ImageIconToImage();
        tieneBarco = false;
        fueImpactada = false;
    }

    public void pintarParteDelBarco(String nombreDelBarco){
        if(nombreDelBarco.equals("fragata")){
            this.tipoDeBarco = nombreDelBarco;
            this.insertarElBarco = 1;
            this.barcoCompleto = true;

        }
        else if(nombreDelBarco.equals("destructor")){
            this.tipoDeBarco = nombreDelBarco;
            this.insertarElBarco = 2;
            this.barcoCompleto = false;
            this.parteDelBarco = true;

        }
        else if(nombreDelBarco.equals("submarino")){
            this.tipoDeBarco = nombreDelBarco;
            this.insertarElBarco = 3;
            this.barcoCompleto = false;
            this.parteDelBarco = true;

        }else if (nombreDelBarco.equals("portaviones")){
            this.tipoDeBarco = nombreDelBarco;
            this.insertarElBarco = 4;
            this.barcoCompleto = false;
            this.parteDelBarco = true;

        }
        repaint();
    }


    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        switch (insertarElBarco){
            case 1:
                g.setColor(Color.BLACK);
                g.fillRect(0, 0, 46, 46);
                resistenciaDeImpactos = 1;
                break;
            case 2: g.setColor(Color.pink);
                g.fillRect(0, 0, 46, 46);
                resistenciaDeImpactos = 2;
                break;
            case 3: g.setColor(Color.MAGENTA);
                g.fillRect(0, 0, 46, 46);
                resistenciaDeImpactos = 3;
                break;
            case 4: g.setColor(Color.BLUE);
                g.fillRect(0, 0, 46, 46);
                resistenciaDeImpactos = 4;
                break;
        }
    }

    public int getFila() {
        return fila;
    }

    public int getColumna() {
        return columna;
    }

    public boolean getBarcoCompleto(CasillaPosicion casilla){
        return casilla.barcoCompleto;
    }

    public boolean isParteDelBarco() {
        return parteDelBarco;
    }

    public int getResistenciaDeImpactos() {
        return resistenciaDeImpactos;
    }

    public void setTieneBarco(boolean tieneBarco) {
        this.tieneBarco = tieneBarco;
    }
    public boolean isTieneBarco() {
        return tieneBarco;
    }

    public void setTipoDeBarco(String nombreDelBarco) {
        this.tipoDeBarco = nombreDelBarco;
    }
    public String getTipoDeBarco() {
        return tipoDeBarco;
    }

    public void setFueImpactada(boolean fueImpactada) {
        this.fueImpactada = fueImpactada;
    }
    public boolean getFueImpactada() {
        return fueImpactada;
    }
}
