package myProject;

/**
 * This class is used to implement the game logic and rules
 */

public class ModelBatallaNaval {
    private BarcosPosicion portavionUsuario, submarinoUsuario1, submarinoUsuario2, destructorUsuario1, destructorUsuario2,
            destructorUsuario3, fragataUsuario1, fragataUsuario2, fragataUsuario3, fragataUsuario4;
    private BarcosPrincipal portavionIA, submarinoIA1, submarinoIA2, destructorIA1, destructorIA2, destructorIA3,
            fragataIA1, fragataIA2, fragataIA3, fragataIA4;
    private int puntos, puntosIA, fragatas, destructores, submarinos, portaviones;
    private boolean ganar;

    /**
     * Constructor of ModelBatallaNaval class
     */

    public ModelBatallaNaval() {
        puntos=0;
        puntosIA=0;
    }

    /**
     * This function is to shoot at a square
     * @param casilla
     */

    public void dispararACasilla(CasillaPrincipal casilla) {
        casilla.setFueImpactada(true);
        if (casilla.getTieneBarco()) {
            if (casilla.getTipoDeBarco().equals("portaviones")) {
                portavionIA.quitarResistencia();
                if (portavionIA.getResistencia() == 0) {
                    portavionIA.get(0).determinarPrecision(6);
                    portavionIA.get(1).determinarPrecision(6);
                    portavionIA.get(2).determinarPrecision(6);
                    portavionIA.get(3).determinarPrecision(6);
                } else {
                    casilla.determinarPrecision(5);
                }
            } else if (casilla.getTipoDeBarco().equals("submarino")) {
                if (casilla == submarinoIA1.get(0) || casilla == submarinoIA1.get(1) || casilla == submarinoIA1.get(2)) {
                    submarinoIA1.quitarResistencia();
                    if (submarinoIA1.getResistencia() == 0) {
                        submarinoIA1.get(0).determinarPrecision(6);
                        submarinoIA1.get(1).determinarPrecision(6);
                        submarinoIA1.get(2).determinarPrecision(6);
                    } else {
                        casilla.determinarPrecision(5);
                    }
                } else if (casilla == submarinoIA2.get(0) || casilla == submarinoIA2.get(1) || casilla == submarinoIA2.get(2)) {
                    submarinoIA2.quitarResistencia();
                    if (submarinoIA2.getResistencia() == 0) {
                        submarinoIA2.get(0).determinarPrecision(6);
                        submarinoIA2.get(1).determinarPrecision(6);
                        submarinoIA2.get(2).determinarPrecision(6);
                    } else {
                        casilla.determinarPrecision(5);
                    }
                }
            } else if (casilla.getTipoDeBarco().equals("destructor")) {
                if (casilla == destructorIA1.get(0) || casilla == destructorIA1.get(1)) {
                    destructorIA1.quitarResistencia();
                    if (destructorIA1.getResistencia() == 0) {
                        destructorIA1.get(0).determinarPrecision(6);
                        destructorIA1.get(1).determinarPrecision(6);
                    } else {
                        casilla.determinarPrecision(5);
                    }
                } else if (casilla == destructorIA2.get(0) || casilla == destructorIA2.get(1)) {
                    destructorIA2.quitarResistencia();
                    if (destructorIA2.getResistencia() == 0) {
                        destructorIA2.get(0).determinarPrecision(6);
                        destructorIA2.get(1).determinarPrecision(6);
                    } else {
                        casilla.determinarPrecision(5);
                    }
                } else if (casilla == destructorIA3.get(0) || casilla == destructorIA3.get(1)) {
                    destructorIA3.quitarResistencia();
                    if (destructorIA3.getResistencia() == 0) {
                        destructorIA3.get(0).determinarPrecision(6);
                        destructorIA3.get(1).determinarPrecision(6);
                    } else {
                        casilla.determinarPrecision(5);
                    }
                }
            } else if (casilla.getTipoDeBarco().equals("fragata")) {
                casilla.determinarPrecision(6);
            }
            puntos++;
        } else {
            casilla.determinarPrecision(7);
        }
    }

    /**
     * This function is to create the aircraft carrier
     * @param parte1
     * @param parte2
     * @param parte3
     * @param parte4
     */

    public void casillasDelBote(CasillaPosicion parte1, CasillaPosicion parte2,
                                CasillaPosicion parte3, CasillaPosicion parte4) {
        parte1.pintarParteDelBarco("portaviones");
        parte1.setTieneBarco(true);
        parte2.pintarParteDelBarco("portaviones");
        parte2.setTieneBarco(true);
        parte3.pintarParteDelBarco("portaviones");
        parte3.setTieneBarco(true);
        parte4.pintarParteDelBarco("portaviones");
        parte4.setTieneBarco(true);
        portavionUsuario = new BarcosPosicion(parte1, parte2, parte3, parte4);
        portaviones = 0;
    }

    /**
     * This function is to create the submarine
     * @param parte1
     * @param parte2
     * @param parte3
     */

    public void casillasDelBote(CasillaPosicion parte1, CasillaPosicion parte2,
                                CasillaPosicion parte3) {
        parte1.pintarParteDelBarco("submarino");
        parte1.setTieneBarco(true);
        parte2.pintarParteDelBarco("submarino");
        parte2.setTieneBarco(true);
        parte3.pintarParteDelBarco("submarino");
        parte3.setTieneBarco(true);
        if (submarinos == 0) {
            submarinoUsuario1 = new BarcosPosicion(parte1, parte2, parte3);
            submarinos++;
        } else if (submarinos == 1) {
            submarinoUsuario2 = new BarcosPosicion(parte1, parte2, parte3);
            submarinos = 0;
        }
    }

    /**
     * This function is to create the destructor
     * @param parte1
     * @param parte2
     */

    public void casillasDelBote(CasillaPosicion parte1, CasillaPosicion parte2) {
        parte1.pintarParteDelBarco("destructor");
        parte1.setTieneBarco(true);
        parte2.pintarParteDelBarco("destructor");
        parte2.setTieneBarco(true);
        if (destructores == 0) {
            destructorUsuario1 = new BarcosPosicion(parte1, parte2);
            destructores++;
        } else if (destructores == 1) {
            destructorUsuario2 = new BarcosPosicion(parte1, parte2);
            destructores++;
        } else if (destructores == 2) {
            destructorUsuario3 = new BarcosPosicion(parte1, parte2);
            destructores = 0;
        }
    }

    /**
     * This function is to create the frigate
     * @param parte1
     */

    public void casillasDelBote(CasillaPosicion parte1) {
        parte1.pintarParteDelBarco("fragata");
        parte1.setTieneBarco(true);
        if (fragatas == 0) {
            fragataUsuario1 = new BarcosPosicion(parte1);
            fragatas++;
        } else if (fragatas == 1) {
            fragataUsuario2 = new BarcosPosicion(parte1);
            fragatas++;
        } else if (fragatas == 2) {
            fragataUsuario3 = new BarcosPosicion(parte1);
            fragatas++;
        } else if (fragatas == 3) {
            fragataUsuario4 = new BarcosPosicion(parte1);
            fragatas = 0;
        }
    }

    /**
     * This function determines who won
     */

    public void determinarGanador() {
        if (puntos == 20) {
            ganar = true;
        } else {
            ganar = false;
        }
    }

    /**
     * This function allows the opponent to shoot at a square
     * @param casilla
     */

    public void dispararACasillaIA(CasillaPosicion casilla) {
        casilla.setFueImpactada(true);
        if (casilla.getTieneBarco()) {
            if (casilla.getTipoDeBarco().equals("portaviones")) {
                portavionUsuario.quitarResistencia();
                if (portavionUsuario.getResistencia() == 0) {
                    portavionUsuario.get(0).determinarPrecision(6);
                    portavionUsuario.get(1).determinarPrecision(6);
                    portavionUsuario.get(2).determinarPrecision(6);
                    portavionUsuario.get(3).determinarPrecision(6);
                } else {
                    casilla.determinarPrecision(5);
                }
            } else if (casilla.getTipoDeBarco().equals("submarino")) {
                if (casilla == submarinoUsuario1.get(0) || casilla == submarinoUsuario1.get(1) || casilla == submarinoUsuario1.get(2)) {
                    submarinoUsuario1.quitarResistencia();
                    if (submarinoUsuario1.getResistencia() == 0) {
                        submarinoUsuario1.get(0).determinarPrecision(6);
                        submarinoUsuario1.get(1).determinarPrecision(6);
                        submarinoUsuario1.get(2).determinarPrecision(6);
                    } else {
                        casilla.determinarPrecision(5);
                    }
                } else if (casilla == submarinoUsuario2.get(0) || casilla == submarinoUsuario2.get(1) || casilla == submarinoUsuario2.get(2)) {
                    submarinoUsuario2.quitarResistencia();
                    if (submarinoUsuario2.getResistencia() == 0) {
                        submarinoUsuario2.get(0).determinarPrecision(6);
                        submarinoUsuario2.get(1).determinarPrecision(6);
                        submarinoUsuario2.get(2).determinarPrecision(6);
                    } else {
                        casilla.determinarPrecision(5);
                    }
                }
            } else if (casilla.getTipoDeBarco().equals("destructor")) {
                if (casilla == destructorUsuario1.get(0) || casilla == destructorUsuario1.get(1)) {
                    destructorUsuario1.quitarResistencia();
                    if (destructorUsuario1.getResistencia() == 0) {
                        destructorUsuario1.get(0).determinarPrecision(6);
                        destructorUsuario1.get(1).determinarPrecision(6);
                    } else {
                        casilla.determinarPrecision(5);
                    }
                } else if (casilla == destructorUsuario2.get(0) || casilla == destructorUsuario2.get(1)) {
                    destructorUsuario2.quitarResistencia();
                    if (destructorUsuario2.getResistencia() == 0) {
                        destructorUsuario2.get(0).determinarPrecision(6);
                        destructorUsuario2.get(1).determinarPrecision(6);
                    } else {
                        casilla.determinarPrecision(5);
                    }
                } else if (casilla == destructorUsuario3.get(0) || casilla == destructorUsuario3.get(1)) {
                    destructorUsuario3.quitarResistencia();
                    if (destructorUsuario3.getResistencia() == 0) {
                        destructorUsuario3.get(0).determinarPrecision(6);
                        destructorUsuario3.get(1).determinarPrecision(6);
                    } else {
                        casilla.determinarPrecision(5);
                    }
                }
            } else if (casilla.getTipoDeBarco().equals("fragata")) {
                casilla.determinarPrecision(6);
            }
            puntosIA++;
        } else {
            casilla.determinarPrecision(7);
        }
    }

    /**
     * This function defines how many and which spaces an opponent's carrier will occupy
     * @param parte1
     * @param parte2
     * @param parte3
     * @param parte4
     */

    public void casillasDelBoteIA(CasillaPrincipal parte1, CasillaPrincipal parte2,
                                  CasillaPrincipal parte3, CasillaPrincipal parte4) {
        parte1.pintarParteDelBarco("portaviones");
        parte1.setTieneBarco(true);
        parte2.pintarParteDelBarco("portaviones");
        parte2.setTieneBarco(true);
        parte3.pintarParteDelBarco("portaviones");
        parte3.setTieneBarco(true);
        parte4.pintarParteDelBarco("portaviones");
        parte4.setTieneBarco(true);
        portavionIA = new BarcosPrincipal(parte1, parte2, parte3, parte4);
        portaviones = 0;
    }

    /**
     * This function defines how many and which squares an opponent's submarine will occupy
     * @param parte1
     * @param parte2
     * @param parte3
     */

    public void casillasDelBoteIA(CasillaPrincipal parte1, CasillaPrincipal parte2,
                                CasillaPrincipal parte3) {
        parte1.pintarParteDelBarco("submarino");
        parte1.setTieneBarco(true);
        parte2.pintarParteDelBarco("submarino");
        parte2.setTieneBarco(true);
        parte3.pintarParteDelBarco("submarino");
        parte3.setTieneBarco(true);
        if (submarinos == 0) {
            submarinoIA1 = new BarcosPrincipal(parte1, parte2, parte3);
            submarinos++;
        } else if (submarinos == 1) {
            submarinoIA2 = new BarcosPrincipal(parte1, parte2, parte3);
            submarinos = 0;
        }
    }

    /**
     * This function defines how many and which squares an opponent's destroyer will occupy
     * @param parte1
     * @param parte2
     */

    public void casillasDelBoteIA(CasillaPrincipal parte1, CasillaPrincipal parte2) {
        parte1.pintarParteDelBarco("destructor");
        parte1.setTieneBarco(true);
        parte2.pintarParteDelBarco("destructor");
        parte2.setTieneBarco(true);
        if (destructores == 0) {
            destructorIA1 = new BarcosPrincipal(parte1, parte2);
            destructores++;
        } else if (destructores == 1) {
            destructorIA2 = new BarcosPrincipal(parte1, parte2);
            destructores++;
        } else if (destructores == 2) {
            destructorIA3 = new BarcosPrincipal(parte1, parte2);
            destructores = 0;
        }
    }

    /**
     * This function defines how many and which squares an opponent's frigate will occupy
     * @param parte1
     */

    public void casillasDelBoteIA(CasillaPrincipal parte1) {
        parte1.pintarParteDelBarco("fragata");
        parte1.setTieneBarco(true);
        if (fragatas == 0) {
            fragataIA1 = new BarcosPrincipal(parte1);
            fragatas++;
        } else if (fragatas == 1) {
            fragataIA2 = new BarcosPrincipal(parte1);
            fragatas++;
        } else if (fragatas == 2) {
            fragataIA3 = new BarcosPrincipal(parte1);
            fragatas++;
        } else if (fragatas == 3) {
            fragataIA4 = new BarcosPrincipal(parte1);
            fragatas = 0;
        }
    }
}
