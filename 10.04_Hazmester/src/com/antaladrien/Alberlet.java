package com.antaladrien;

public class Alberlet extends Lakas implements Berelheto {
    int honapSzam;

    public Alberlet(double terulet, int szobaSzam, int nmAr) {
        super(terulet, szobaSzam, 0, nmAr);
        this.honapSzam = 0;
    }

    @Override
    public double mennyibeKerul(int honapokszama) {
        return this.lakok == 0 ? -1 : (double)koltseg()/lakok;
    }

    @Override
    public boolean lefoglatE() {
        return this.honapSzam == 0 ? false : true;
    }

    @Override
    public boolean lefoglal(int honapokszama) {
        if (lefoglatE()) {
            return false;
        } else {
            this.honapSzam = honapokszama;
            return true;
        }
    }

    @Override
    public boolean bekoltozik(int emberek) {
        if ((double) this.szobaSzam / (double) (this.lakok + emberek) <= 8.0
                && (double) terulet / (double) (this.lakok + emberek) >= 2.0) {
            this.lakok += emberek;
            return true;
        }
        return false;
    }

//    @Override
//    public double koltseg() {
//        return 0;
//    }

    @Override
    public String toString() {
        return super.toString() + ", honapokszama: " + honapSzam;
    }
}
