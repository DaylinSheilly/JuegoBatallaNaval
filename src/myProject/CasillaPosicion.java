package myProject;

import javax.swing.*;
import java.awt.*;

/**
 * This class is used to make a square on the board position
 */

public class CasillaPosicion extends JButton {
    private int fila, columna, insertarElBarco, resultadoDeTiro, resistenciaDeImpactos;
    private String tipoDeBarco;
    private boolean barcoCompleto, parteDelBarco, tieneBarco, fueImpactada;
    private ImageIcon imageHundido, imagenNuevoTamanho, imageFallar;
    private Image imagenOtroTamanho;
    private ImageIconToImage imageTransformada;

    /**
     * Constructor of CasillaPosicion class
     * @param fila
     * @param columna
     */

    public CasillaPosicion(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;
        this.setPreferredSize(new Dimension(46, 46));
        setBackground(new Color(24, 90, 219));

        imageTransformada = new ImageIconToImage();
        tieneBarco = false;
        fueImpactada = false;

        resultadoDeTiro=0;
        insertarElBarco=0;
    }

    /**
     * This function paints the ships inside the square
     * @param nombreDelBarco
     */

    public void pintarParteDelBarco(String nombreDelBarco) {
        this.resultadoDeTiro=0;
        if (nombreDelBarco.equals("fragata")) {
            this.tipoDeBarco = nombreDelBarco;
            this.insertarElBarco = 1;
            this.barcoCompleto = true;
            this.tieneBarco = true;

        } else if (nombreDelBarco.equals("destructor")) {
            this.tipoDeBarco = nombreDelBarco;
            this.insertarElBarco = 2;
            this.barcoCompleto = false;
            this.parteDelBarco = true;
            this.tieneBarco = true;

        } else if (nombreDelBarco.equals("submarino")) {
            this.tipoDeBarco = nombreDelBarco;
            this.insertarElBarco = 3;
            this.barcoCompleto = false;
            this.parteDelBarco = true;
            this.tieneBarco = true;

        } else if (nombreDelBarco.equals("portaviones")) {
            this.tipoDeBarco = nombreDelBarco;
            this.insertarElBarco = 4;
            this.barcoCompleto = false;
            this.parteDelBarco = true;
            this.tieneBarco = true;

        }
        repaint();
    }

    public void determinarPrecision(int resultadoDeTiro) {
        this.insertarElBarco=0;
        if (resultadoDeTiro == 5) {
            this.resultadoDeTiro = 5;
        } else if (resultadoDeTiro == 6) {
            this.resultadoDeTiro = 6;
        } else {
            this.resultadoDeTiro = 7;
        }
        repaint();
    }

    /**
     * In this method, the ships are drawn and placed inside the square
     * @param g
     */

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        switch (insertarElBarco) {
            case 1:
                g.setColor(Color.BLACK);
                g.fillRect(0, 0, 46, 46);
                resistenciaDeImpactos = 1;
                break;
            case 2:
                g.setColor(Color.pink);
                g.fillRect(0, 0, 46, 46);
                resistenciaDeImpactos = 2;
                break;
            case 3:
                g.setColor(Color.MAGENTA);
                g.fillRect(0, 0, 46, 46);
                resistenciaDeImpactos = 3;
                break;
            case 4:
                g.setColor(Color.BLUE);
                g.fillRect(0, 0, 46, 46);
                resistenciaDeImpactos = 4;
                break;
        }
        switch (resultadoDeTiro) {
            case 5:
                g.setColor(Color.red);
                g.fillRect(0, 0, 46, 46);
                resistenciaDeImpactos = 4;
                break;
            case 6:
                imageHundido = new ImageIcon(getClass().getResource("/resources/hundido.png"));
                imagenOtroTamanho = imageHundido.getImage().getScaledInstance(46, 46, Image.SCALE_SMOOTH);
                imagenNuevoTamanho = new ImageIcon(imagenOtroTamanho);
                g.drawImage(imageTransformada.scaledImage(imagenNuevoTamanho.getImage(), 46, 46), 0, 0, this);
                break;
            case 7:
                g.setColor(Color.cyan);
                g.fillRect(0, 0, 46, 46);
                resistenciaDeImpactos = 4;
                break;
        }
    }

    /**
     * In this method, the ships are drawn and placed inside the square
     * @return fila
     */

    public int getFila() {
        return fila;
    }

    /**
     * This method gets the column of the button
     * @return columna
     */
    public int getColumna() {
        return columna;
    }

    /**
     * This method tells if the square has the whole ship or not
     * @param casilla
     * @return if you have the whole boat or not
     */

    public boolean getBarcoCompleto(CasillaPosicion casilla) {
        return casilla.barcoCompleto;
    }

    /**
     * This method tells if you have a ship part or not
     * @return if you have a part of the boat or not
     */

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

    /**
     * This method tells if you have a ship or not
     * @return if you have a ship or not
     */

    public boolean getTieneBarco() {
        return tieneBarco;
    }
}