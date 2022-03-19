
package myProject;

import javax.swing.*;
import java.awt.*;

public class CasillaPrincipal extends JButton {
    private int fila, columna, resultadoDeTiro;
    private ImageIcon imageHundido, imagenNuevoTamanho, imageFallar;
    private Image imagenOtroTamanho;
    private ImageIconToImage imageTransformada;
    private boolean tieneBarco;


    public CasillaPrincipal(int fila, int columna){
        this.fila = fila;
        this.columna = columna;
        this.setPreferredSize(new Dimension(46, 46));
        setBackground(new Color(24, 90, 219));

        imageTransformada = new ImageIconToImage();

        resultadoDeTiro = 0;
        tieneBarco = false;
    }

    public void determinarPrecision(int resultadoDeTiro){
        if(resultadoDeTiro == 5){
            this.resultadoDeTiro = 5;
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
            case 5:
                imageFallar = new ImageIcon(getClass().getResource("/resources/fallar.png"));
                imagenOtroTamanho = imageFallar.getImage().getScaledInstance(46,46,Image.SCALE_SMOOTH);
                imagenNuevoTamanho = new ImageIcon(imagenOtroTamanho);
                g.drawImage(imageTransformada.scaledImage(imagenNuevoTamanho.getImage(), 46, 46), 0, 0, this);

                g.setColor(Color.white);
                g.drawString("\uF0FB", 0, 0);
                break;
            case 6:
                imageHundido = new ImageIcon(getClass().getResource("/resources/hundido.png"));
                imagenOtroTamanho = imageHundido.getImage().getScaledInstance(46,46,Image.SCALE_SMOOTH);
                imagenNuevoTamanho = new ImageIcon(imagenOtroTamanho);
                g.drawImage(imageTransformada.scaledImage(imagenNuevoTamanho.getImage(), 46, 46), 0, 0, this);

                g.setColor(Color.white);
                g.drawString("\uF0FB", 0, 0);
                break;
            case 7:
                g.drawString("\uF0FB", 0, 0);
                g.setColor(Color.red);
                g.setFont(new Font("SansSerif", Font.BOLD + Font.PLAIN, 50));
                g.drawString("\uF0FB", 0, 0);
                break;
        }
    }

    public int getFila() {
        return fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setTieneBarco(boolean tieneBarco) {
        this.tieneBarco = tieneBarco;
    }
    public boolean getTieneBarco() {
        return tieneBarco;
    }
}

