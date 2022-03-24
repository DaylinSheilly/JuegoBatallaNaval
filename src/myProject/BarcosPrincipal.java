package myProject;

import java.util.ArrayList;

public class BarcosPrincipal extends ArrayList<CasillaPrincipal> {

    public BarcosPrincipal(CasillaPrincipal parte1) {
        this.add(parte1);

    }

    public BarcosPrincipal(CasillaPrincipal parte1, CasillaPrincipal parte2) {
        this.add(parte1);
        this.add(parte2);

    }

    public BarcosPrincipal(CasillaPrincipal parte1, CasillaPrincipal parte2, CasillaPrincipal parte3) {
        this.add(parte1);
        this.add(parte2);
        this.add(parte3);

    }

    public BarcosPrincipal(CasillaPrincipal parte1, CasillaPrincipal parte2, CasillaPrincipal parte3, CasillaPrincipal parte4) {
        this.add(parte1);
        this.add(parte2);
        this.add(parte3);
        this.add(parte4);
    }
}