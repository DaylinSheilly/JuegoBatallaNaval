package myProject;

import java.util.Vector;

public class ModelBatallaNaval {
    private Casilla casilla;
    private int fila, columna, puntos;
    private boolean ganar;
    private Vector<Casilla> barco;


    public ModelBatallaNaval(){
        casilla = new Casilla(fila, columna);
        puntos = 0;

    }

    public void dispararACasilla(Casilla casilla){
        if(casilla.getBarcoCompleto(casilla) == true){
            puntos ++;
            casilla.determinarPrecision(6);
        }
        if(casilla.getBarcoCompleto(casilla) == false & casilla.isParteDelBarco() == true){
            puntos ++;
            casilla.determinarPrecision(5);
        }else{
            casilla.determinarPrecision(7);
        }


    }

    public void determinarGanador(){
        if(puntos == 20){
            ganar = true;
        }else{
            ganar = false;
        }
    }



}
