package myProject;

import javax.swing.*;
import java.awt.*;

public class CasillaPosicion extends JButton {
    private int fila, columna, insertarElBarco, resultadoDeSeleccion;
    private String nombreDelBarco;
    private boolean barcoCompleto, parteDelBarco;
    private ImageIcon imageHundido, imagenNuevoTamanho, imageFallar;
    private Image imagenOtroTamanho;
    private ImageIconToImage imageTransformada;


    public CasillaPosicion(int fila, int columna){
        this.fila = fila;
        this.columna = columna;
        this.setPreferredSize(new Dimension(46, 46));
        setBackground(new Color(24, 90, 219));

        imageTransformada = new ImageIconToImage();

        insertarElBarco = 199;
    }

    public void insertarBarco(String nombreDelBarco){
        if(nombreDelBarco.equals("fragata")){
            this.insertarElBarco = 1;
            this.barcoCompleto = true;
            //repaint();
        }
        else if(nombreDelBarco.equals("destructor")){
            this.insertarElBarco = 2;
            this.barcoCompleto = false;
            this.parteDelBarco = true;
            //repaint();
        }
        else if(nombreDelBarco.equals("submarino")){
            this.insertarElBarco = 3;
            this.barcoCompleto = false;
            this.parteDelBarco = true;
            //repaint();
        }else{
            this.insertarElBarco = 4;
            this.barcoCompleto = false;
            this.parteDelBarco = true;
            //repaint();
        }
        repaint();
    }

    public void determinarPrecision(int resultadoDeSeleccion){
        if(resultadoDeSeleccion == 5){
            this.insertarElBarco = 5;
        }
        else if(resultadoDeSeleccion == 6){
            this.insertarElBarco = 6;
        }else {
            this.insertarElBarco = 7;
        }
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        //System.out.println(insertarElBarco);
        //System.out.println(columna+" "+fila);
        switch (insertarElBarco){
            case 1:
                g.setColor(Color.BLACK);
                g.fillRect(fila, columna, 46, 46);
                System.out.println("La opción 1 :/");
                break;
            case 2: g.setColor(Color.BLACK);
                g.fillRect(3, columna, 46, 46);
                g.fillRect(5, columna, 46, 46);
                System.out.println("La opción 2 :D");
                break;
            case 3: g.setColor(Color.BLACK);
                g.fillRect(fila, columna, 46, 46);
                g.fillRect(fila, columna, 46, 46);
                g.fillRect(fila, columna, 46, 46);
                System.out.println("La opción 3 :|");
                break;
            case 4: g.setColor(Color.BLACK);
                g.fillRect(fila, columna, 46, 46);
                g.fillRect(fila, columna, 46, 46);
                g.fillRect(fila, columna, 46, 46);
                g.fillRect(fila, columna, 46, 46);
                System.out.println("La opción 4 ._.");
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

    public String getBarco(CasillaPosicion casilla){ return  casilla.nombreDelBarco; }

    public boolean getBarcoCompleto(CasillaPosicion casilla){
        return casilla.barcoCompleto;
    }

    public boolean isParteDelBarco() {
        return parteDelBarco;
    }
}
