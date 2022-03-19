package myProject;

import java.util.Vector;

public class ModelBatallaNaval {
    private CasillaPosicion parte1;
    private int fila, columna, puntos;
    private boolean ganar;
    private Vector<CasillaPrincipal> barco;


    public ModelBatallaNaval(){
        //casillaPosicion = new CasillaPosicion(fila, columna);
        puntos = 0;

    }

    public void dispararACasilla(CasillaPrincipal casilla){
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

    public void casillasDelBote(CasillaPosicion parte1, CasillaPosicion parte2,
                               CasillaPosicion parte3, CasillaPosicion parte4){
        parte1.pintarParteDelBarco("portaaviones");
        parte2.pintarParteDelBarco("portaaviones");
        parte3.pintarParteDelBarco("portaaviones");
        parte4.pintarParteDelBarco("portaaviones");
    }

    public void casillasDelBote(CasillaPosicion parte1, CasillaPosicion parte2,
                                CasillaPosicion parte3){
        parte1.pintarParteDelBarco("submarino");
        parte2.pintarParteDelBarco("submarino");
        parte3.pintarParteDelBarco("submarino");
    }

    public void casillasDelBote(CasillaPosicion parte1, CasillaPosicion parte2){
        parte1.pintarParteDelBarco("destructor");
        parte2.pintarParteDelBarco("destructor");
    }

    public void determinarGanador(){
        if(puntos == 20){
            ganar = true;
        }else{
            ganar = false;
        }
    }



}
