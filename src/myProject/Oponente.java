package myProject;

import javax.swing.*;
import java.util.Random;

public class Oponente {
    int fila, columna;
    ModelBatallaNaval game;

    public Oponente(){
        fila = 0;
        columna = 0;

        game = new ModelBatallaNaval();
    }

    public void disparar() {
        Random coordenadas = new Random();

        columna = coordenadas.nextInt(9)+1;
        fila = coordenadas.nextInt(9)+1;
    }
}
