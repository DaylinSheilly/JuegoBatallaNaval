package myProject;

import java.util.Random;

/**
 * This class is the opponent of the game
 */

public class Oponente {
    int fila, columna;
    ModelBatallaNaval game;

    /**
     * Constructor of Oponente class
     */

    public Oponente(){
        fila = 0;
        columna = 0;

        game = new ModelBatallaNaval();
    }

    /**
     *
     */

    public void elegirCasilla() {
        Random coordenadas = new Random();

        columna = coordenadas.nextInt(9)+1;
        fila = coordenadas.nextInt(9)+1;
    }

    public void dispararACasillaIA(){

    }
}
