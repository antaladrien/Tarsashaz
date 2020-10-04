package com.antaladrien;

public class CsaladiApartman extends Lakas {
    int gyerekekSzama;

    public CsaladiApartman(double terulet, int szobaSzam, int nmAr) {
        super(terulet, szobaSzam, 0, nmAr);
        this.gyerekekSzama = 0;
    }

    public boolean gyerekSzületik() {
        if (lakok >= 2) {
            this.gyerekekSzama++;
            return true;
        }
        return false;
    }

    @Override
    public boolean bekoltozik(int emberek) {
        double szemelyekszama = this.lakok + (0.5 * (double) gyerekekSzama);
        if (this.szobaSzam / szemelyekszama <= 2.0 && this.terulet / szemelyekszama >= 2.0) {
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
        return super.toString() + ", gyerekek száma: " + this.gyerekekSzama;
    }
}
