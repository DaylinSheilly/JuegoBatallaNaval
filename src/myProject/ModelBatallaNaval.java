package myProject;

import java.util.ArrayList;

public class ModelBatallaNaval {
    private BarcosPosicion portavionUsuario, submarinoUsuario1, submarinoUsuario2, destructorUsuario1, destructorUsuario2, destructorUsuario3,
                            fragataUsuario1, fragataUsuario2, fragataUsuario3, fragataUsuario4;
    private BarcosPrincipal portavionIA, submarinoIA1, submarinoIA2, destructorIA1, destructorIA2, destructorIA3, fragataIA1, fragataIA2, fragataIA3, fragataIA4;

    private int puntos, fragatas, destructores, submarinos, portaviones;
    private boolean ganar;


    public ModelBatallaNaval(){

    }

    public void dispararACasilla(CasillaPrincipal casilla){
        if(casilla.getTieneBarco() /*& casilla.isParteDelBarco() == true*/) {
            puntos++;
            casilla.determinarPrecision(5);
        }
        else if(casilla.getTieneBarco()){
            puntos ++;
            casilla.determinarPrecision(6);
        }
        else{
            casilla.determinarPrecision(7);
        }


    }

    public void casillasDelBote(CasillaPosicion parte1, CasillaPosicion parte2,
                               CasillaPosicion parte3, CasillaPosicion parte4) {
        parte1.pintarParteDelBarco("portaaviones");
        parte1.setTieneBarco(true);
        parte2.pintarParteDelBarco("portaaviones");
        parte2.setTieneBarco(true);
        parte3.pintarParteDelBarco("portaaviones");
        parte3.setTieneBarco(true);
        parte4.pintarParteDelBarco("portaaviones");
        parte4.setTieneBarco(true);
        portavionUsuario = new BarcosPosicion(parte1, parte2, parte3, parte4);
        portaviones = 0;
    }

    public void casillasDelBote(CasillaPosicion parte1, CasillaPosicion parte2,
                                CasillaPosicion parte3){
        parte1.pintarParteDelBarco("submarino");
        parte1.setTieneBarco(true);
        parte2.pintarParteDelBarco("submarino");
        parte2.setTieneBarco(true);
        parte3.pintarParteDelBarco("submarino");
        parte3.setTieneBarco(true);
        if(submarinos == 0){
            submarinoUsuario1 = new BarcosPosicion(parte1, parte2, parte3);
            submarinos++;
        }
        else if(submarinos == 1){
            submarinoUsuario2 = new BarcosPosicion(parte1, parte2, parte3);
            submarinos = 0;
        }
    }

    public void casillasDelBote(CasillaPosicion parte1, CasillaPosicion parte2){
        parte1.pintarParteDelBarco("destructor");
        parte1.setTieneBarco(true);
        parte2.pintarParteDelBarco("destructor");
        parte2.setTieneBarco(true);
        if(destructores == 0){
            destructorUsuario1 = new BarcosPosicion(parte1, parte2);
            destructores++;
        }
        else if(destructores == 1){
            destructorUsuario2 = new BarcosPosicion(parte1, parte2);
            destructores++;
        }
        else if(destructores == 2){
            destructorUsuario3 = new BarcosPosicion(parte1, parte2);
            destructores = 0;
        }
    }

    public void casillasDelBote(CasillaPosicion parte1){
        parte1.pintarParteDelBarco("fragata");
        parte1.setTieneBarco(true);
        if(fragatas == 0){
            fragataUsuario1 = new BarcosPosicion(parte1);
            fragatas++;
        }
        else if(fragatas == 1){
            fragataUsuario2 = new BarcosPosicion(parte1);
            fragatas++;
        }
        else if(fragatas == 2){
            fragataUsuario3 = new BarcosPosicion(parte1);
            fragatas++;
        }
        else if(fragatas == 3){
            fragataUsuario4 = new BarcosPosicion(parte1);
            fragatas = 0;
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
