package com.antaladrien;

import java.util.ArrayList;

public class Tarsashaz {
    ArrayList<Ingatlan> lista;
    int maxgarazs;
    int maxlakas;

    public Tarsashaz(int maxgarazs, int maxlakas) {
        this.lista = new ArrayList<Ingatlan>();
        this.maxgarazs = maxgarazs;
        this.maxlakas = maxlakas;
    }

    public boolean lakasHozzaad(Lakas lakas) {
        int lakasokszama = 0;
        for (Object o : this.lista) {
            if (o instanceof Lakas) {
                lakasokszama++;
            }
        }
        if (lakasokszama <= this.maxlakas) {
            lista.add(lakas);
            return true;
        }
        return false;
    }

    public boolean GarazsHozzaad(Garazs garazs) {
        int garazsokszama = 0;
        for (Object o : this.lista) {
            if (o instanceof Garazs) {
                garazsokszama++;
            }
        }
        if (garazsokszama <= this.maxgarazs) {
            lista.add(garazs);
            return true;
        }
        return false;
    }

    public int osszesLako() {
        int lakok = 0;
        for (Object o : this.lista) {
            if (o instanceof Lakas) {
                lakok += ((Lakas) o).lakokSzama();
            }
        }
        return lakok;
    }

    public int ingatlanErtek() {
        int ertek = 0;
        for (Object o : this.lista) {
            if (o instanceof Lakas) {
                if (((Lakas) o).lakokSzama() >= 1) {
                    ertek += ((Lakas) o).koltseg();
                }
            } else if (o instanceof Garazs) {
                if (((Garazs) o).lefoglatE()) {
                    ertek += ((Garazs) o).koltseg();
                }
            }
        }
        return ertek;
    }
}
