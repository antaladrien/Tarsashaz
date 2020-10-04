package com.antaladrien;

public class Garazs implements Ingatlan, Berelheto {
    double terulet;
    int nmAr;
    boolean futottE;
    int honapSzam;
    boolean auto;

    public Garazs(double terulet, int nmAr, boolean futottE) {
        this.terulet = terulet;
        this.nmAr = nmAr;
        this.futottE = futottE;
        this.honapSzam = 0;
        this.auto = false;
    }

    @Override
    public double mennyibeKerul(int honapokszama) {
        return this.futottE ? this.terulet * this.nmAr * 1.5 : this.terulet * this.nmAr;
    }

    @Override
    public boolean lefoglatE() {
        return this.honapSzam == 0 && !this.auto ? false : true;
    }

    @Override
    public boolean lefoglal(int honapokszama) {
        if (lefoglatE()) {
            return false;
        }
        this.honapSzam = honapokszama;
        return true;
    }

    @Override
    public double koltseg() {
        return this.terulet * this.nmAr;
    }

    public void autoKiBeAll() {
        this.auto = !this.auto;
    }

    @Override
    public String toString() {
        return "Garázs terület: " + terulet +
                ", nm ár: " + nmAr +
                ", futott-e: " + futottE +
                ", hónap szám: " + honapSzam +
                ", autó: " + auto;
    }
}
