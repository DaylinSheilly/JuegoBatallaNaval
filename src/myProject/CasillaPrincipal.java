
package myProject;

import javax.swing.*;
import java.awt.*;

public class CasillaPrincipal extends JButton {
    private int fila, columna, resultadoDeTiro;
    private  String nombreDelBarco;
    private boolean barcoCompleto, parteDelBarco;
    private ImageIcon imageHundido, imagenNuevoTamanho, imageFallar;
    private Image imagenOtroTamanho;
    private ImageIconToImage imageTransformada;


    public CasillaPrincipal(int fila, int columna){
        this.fila = fila;
        this.columna = columna;
        this.setPreferredSize(new Dimension(46, 46));
        setBackground(new Color(24, 90, 219));

        imageTransformada = new ImageIconToImage();

        resultadoDeTiro = 0;
    }

    public void determinarPrecision(int resultadoDeTiro){
        if(resultadoDeTiro == 1){
            this.resultadoDeTiro = 1;
        }
        else if(resultadoDeTiro == 6){
            this.resultadoDeTiro = 6;
        }else {
            this.resultadoDeTiro = 7;
        }
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        switch (resultadoDeTiro){
            case 1:
                imageFallar = new ImageIcon(getClass().getResource("/resources/fallar.png"));
                imagenOtroTamanho = imageFallar.getImage().getScaledInstance(60,60,Image.SCALE_SMOOTH);
                imagenNuevoTamanho = new ImageIcon(imagenOtroTamanho);
                g.drawImage(imageTransformada.scaledImage(imagenNuevoTamanho.getImage(), 46, 46), fila, columna, this);
                break;
            case 2:
                imageHundido = new ImageIcon(getClass().getResource("/resources/hundido.png"));
                imagenOtroTamanho = imageHundido.getImage().getScaledInstance(46,46,Image.SCALE_SMOOTH);
                imagenNuevoTamanho = new ImageIcon(imagenOtroTamanho);
                g.drawImage(imageTransformada.scaledImage(imagenNuevoTamanho.getImage(), fila, columna), fila, columna, this);
                break;
            case 3:
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

    public String getBarco(CasillaPrincipal casilla){ return  casilla.nombreDelBarco; }

    public boolean getBarcoCompleto(CasillaPrincipal casilla){
        return casilla.barcoCompleto;
    }

    public boolean isParteDelBarco() {
        return parteDelBarco;
    }
}

