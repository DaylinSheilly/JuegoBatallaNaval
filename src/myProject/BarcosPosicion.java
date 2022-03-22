package myProject;

import java.util.ArrayList;

public class BarcosPosicion extends ArrayList<CasillaPosicion> {
    private String tipoDeBarco;
    private int resistencia;

    public BarcosPosicion(CasillaPosicion parte1) {
        this.tipoDeBarco = "fragata";
        this.resistencia = 1;
        this.add(parte1);

    }

    public BarcosPosicion(CasillaPosicion parte1, CasillaPosicion parte2) {
        this.tipoDeBarco = "submarino";
        this.resistencia = 2;
        this.add(parte1);
        this.add(parte2);

    }

    public BarcosPosicion(CasillaPosicion parte1, CasillaPosicion parte2, CasillaPosicion parte3) {
        this.tipoDeBarco = "submarino";
        this.resistencia = 3;
        this.add(parte1);
        this.add(parte2);
        this.add(parte3);

    }

    public BarcosPosicion(CasillaPosicion parte1, CasillaPosicion parte2, CasillaPosicion parte3, CasillaPosicion parte4) {
        this.tipoDeBarco = "portaviones";
        this.resistencia = 4;
        this.add(parte1);
        this.add(parte2);
        this.add(parte3);
        this.add(parte4);
    }

    public void quitarResistencia() {
        this.resistencia = resistencia--;
    }

    public String getTipoDeBarco() {
        return tipoDeBarco;
    }

    public int getResistencia() {
        return resistencia;
    }
}