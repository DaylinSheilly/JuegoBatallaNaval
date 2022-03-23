package myProject;

import java.util.ArrayList;

public class BarcosPosicion extends ArrayList<CasillaPosicion> {

    public BarcosPosicion(CasillaPosicion parte1) {
        this.add(parte1);

    }

    public BarcosPosicion(CasillaPosicion parte1, CasillaPosicion parte2) {
        this.add(parte1);
        this.add(parte2);

    }

    public BarcosPosicion(CasillaPosicion parte1, CasillaPosicion parte2, CasillaPosicion parte3) {
        this.add(parte1);
        this.add(parte2);
        this.add(parte3);

    }

    public BarcosPosicion(CasillaPosicion parte1, CasillaPosicion parte2, CasillaPosicion parte3, CasillaPosicion parte4) {
        this.add(parte1);
        this.add(parte2);
        this.add(parte3);
        this.add(parte4);
    }
}