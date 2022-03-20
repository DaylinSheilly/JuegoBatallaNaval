package myProject;

import java.util.ArrayList;

public class ModelBatallaNaval {
    private CasillaPosicion parte1;
    private int puntos,
            fragataPosicion1Resistencia, fragataPosicion2Resistencia, fragataPosicion3Resistencia, fragataPosicion4Resistencia, destructorPosicion1Resistencia,
            destructorPosicion2Resistencia, destructorPosicion3Resistencia, submarinoPosicion1Resistencia, submarinoPosicion2Resistencia, portavionPosicionResistencia,
            fragataPrincipal1Resistencia, fragataPrincipal2Resistencia, fragataPrincipal3Resistencia, fragataPrincipal4Resistencia, destructorPrincipal1Resistencia,
            destructorPrincipal2Resistencia, destructorPrincipal3Resistencia, submarinoPrincipal1Resistencia, submarinoPrincipal2Resistencia, portavionPrincipalResistencia = 0;
    private boolean ganar;
    private ArrayList<CasillaPosicion> fragataPosicion1, fragataPosicion2, fragataPosicion3, fragataPosicion4, destructorPosicion1, destructorPosicion2,
            destructorPosicion3, submarinoPosicion1, submarinoPosicion2, portavionPosicion = new ArrayList<CasillaPosicion>();
    private ArrayList<CasillaPrincipal> fragataPrincipal1, fragataPrincipal2, fragataPrincipal3, fragataPrincipal4, destructorPrincipal1, destructorPrincipal2,
            destructorPrincipal3, submarinoPrincipal1, submarinoPrincipal2, portavionPrincipal = new ArrayList<CasillaPrincipal>();


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
                               CasillaPosicion parte3, CasillaPosicion parte4){
        parte1.pintarParteDelBarco("portaaviones");
        parte1.setTieneBarco(true);
        parte2.pintarParteDelBarco("portaaviones");
        parte2.setTieneBarco(true);
        parte3.pintarParteDelBarco("portaaviones");
        parte3.setTieneBarco(true);
        parte4.pintarParteDelBarco("portaaviones");
        parte4.setTieneBarco(true);
        portavionPosicion.add(parte1);
        portavionPosicion.add(parte2);
        portavionPosicion.add(parte3);
        portavionPosicion.add(parte4);
        portavionPosicionResistencia = 4;
    }

    public void casillasDelBote(CasillaPosicion parte1, CasillaPosicion parte2,
                                CasillaPosicion parte3){
        parte1.pintarParteDelBarco("submarino");
        parte1.setTieneBarco(true);
        parte2.pintarParteDelBarco("submarino");
        parte2.setTieneBarco(true);
        parte3.pintarParteDelBarco("submarino");
        parte3.setTieneBarco(true);
        if(submarinoPosicion1 == null){
            submarinoPosicion1.add(parte1);
            submarinoPosicion1.add(parte2);
            submarinoPosicion1.add(parte3);
            submarinoPosicion1Resistencia = 3;
        }
        else if(submarinoPosicion2 == null){
            submarinoPosicion2.add(parte1);
            submarinoPosicion2.add(parte2);
            submarinoPosicion2.add(parte3);
            submarinoPosicion2Resistencia = 3;
        }
    }

    public void casillasDelBote(CasillaPosicion parte1, CasillaPosicion parte2){
        parte1.pintarParteDelBarco("destructor");
        parte1.setTieneBarco(true);
        parte2.pintarParteDelBarco("destructor");
        parte2.setTieneBarco(true);
        if(destructorPosicion1 == null){
            destructorPosicion1.add(parte1);
            destructorPosicion1.add(parte2);
            destructorPosicion1Resistencia = 2;
        }
        else if(destructorPosicion2 == null){
            destructorPosicion2.add(parte1);
            destructorPosicion2.add(parte2);
            destructorPosicion2Resistencia = 2;
        }
        else if(destructorPosicion3 == null){
            destructorPosicion3.add(parte1);
            destructorPosicion3.add(parte2);
            destructorPosicion3Resistencia = 2;
        }
    }

    public void casillasDelBote(CasillaPosicion parte1){
        parte1.pintarParteDelBarco("fragata");
        parte1.setTieneBarco(true);
        if(fragataPosicion1 == null){
            fragataPosicion1.add(parte1);
            fragataPosicion1Resistencia = 1;
        }
        else if(fragataPosicion2 == null){
            fragataPosicion2.add(parte1);
            fragataPosicion2Resistencia = 1;
        }
        else if(fragataPosicion3 == null){
            fragataPosicion3.add(parte1);
            fragataPosicion3Resistencia = 1;
        }
        else if(fragataPosicion4 == null){
            fragataPosicion4.add(parte1);
            fragataPosicion4Resistencia = 1;
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
