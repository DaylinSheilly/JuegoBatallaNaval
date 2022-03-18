package myProject;

import javax.swing.*;
import java.awt.*;
import java.awt.image.ImageObserver;

public class Casilla extends JButton {
    private int fila, columna, nombreDelBarco, insertarElBarco, resultadoDeSeleccion;
    private boolean barcoCompleto, parteDelBarco;
    private ImageIcon imageHundido, imagenNuevoTamanho, imageFallar;
    private Image imagenOtroTamanho;
    private ImageIconToImage imageTransformada;


    public Casilla(int fila, int columna){
        this.fila = fila;
        this.columna = columna;
        this.setPreferredSize(new Dimension(46, 46));
        setBackground(new Color(24, 90, 219));

        imageTransformada = new ImageIconToImage();
    }

    public void insertarBarco(int nombreDelBarco){
        if(nombreDelBarco == 1){
            insertarElBarco = 1;
            barcoCompleto = true;
            repaint();
        }
        if(nombreDelBarco == 2){
            insertarElBarco = 2;
            barcoCompleto = false;
            parteDelBarco = true;
            repaint();
        }
        if(nombreDelBarco == 3){
            insertarElBarco = 3;
            barcoCompleto = false;
            parteDelBarco = true;
            repaint();
        }else{
            insertarElBarco = 4;
            barcoCompleto = false;
            parteDelBarco = true;
            repaint();
        }
    }

    public void determinarPrecision(int resultadoDeSeleccion){
        if(resultadoDeSeleccion == 5){
            insertarElBarco = 5;
            repaint();
        }
        if(resultadoDeSeleccion == 6){
            insertarElBarco = 6;
            repaint();
        }else {
            insertarElBarco = 7;
            repaint();
        }
    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        switch (insertarElBarco){
            case 1: g.setColor(Color.BLACK);
                 g.fillRect(fila, columna, 46, 46);
                break;
            case 2: g.setColor(Color.BLACK);
                 g.fillRect(fila, columna, 46, 46);
                 g.fillRect(fila, columna, 46, 46);
                break;
            case 3: g.setColor(Color.BLACK);
                 g.fillRect(fila, columna, 46, 46);
                 g.fillRect(fila, columna, 46, 46);
                 g.fillRect(fila, columna, 46, 46);
                break;
            case 4: g.setColor(Color.BLACK);
                 g.fillRect(fila, columna, 46, 46);
                 g.fillRect(fila, columna, 46, 46);
                 g.fillRect(fila, columna, 46, 46);
                 g.fillRect(fila, columna, 46, 46);
                 break;
            case 5:
                imageFallar = new ImageIcon(getClass().getResource("/resources/fallar.png"));
                imagenOtroTamanho = imageFallar.getImage().getScaledInstance(60,60,Image.SCALE_SMOOTH);
                imagenNuevoTamanho = new ImageIcon(imagenOtroTamanho);
                g.drawImage(imageTransformada.scaledImage(imagenNuevoTamanho.getImage(), 46, 46), fila, columna, this);
                break;
            case 6:
                imageHundido = new ImageIcon(getClass().getResource("/resources/hundido.png"));
                imagenOtroTamanho = imageHundido.getImage().getScaledInstance(46,46,Image.SCALE_SMOOTH);
                imagenNuevoTamanho = new ImageIcon(imagenOtroTamanho);
                g.drawImage(imageTransformada.scaledImage(imagenNuevoTamanho.getImage(), fila, columna), fila, columna, this);
                break;
            case 7:
                g.setColor(Color.red);
                g.setFont(new Font("SansSerif", Font.BOLD + Font.PLAIN, 50));
                g.drawString("\uF0FB", fila, columna);
                break;
        }
    }

    public int getFila() {
        return fila;
    }

    public int getColumna() {
        return columna;
    }

    public int getBarco(Casilla casilla){ return  casilla.nombreDelBarco; }

    public boolean getBarcoCompleto(Casilla casilla){
        return casilla.barcoCompleto;
    }

    public boolean isParteDelBarco() {
        return parteDelBarco;
    }
}
