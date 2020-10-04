package com.antaladrien;

public abstract class Lakas implements Ingatlan {
    protected double terulet;
    protected int szobaSzam;
    protected int lakok;
    protected int nmAr;

    public Lakas(double terulet, int szobaSzam, int lakok, int nmAr) {
        this.terulet = terulet;
        this.szobaSzam = szobaSzam;
        this.lakok = lakok;
        this.nmAr = nmAr;
    }

    public abstract boolean bekoltozik(int emberek);

    public double koltseg() {
        return this.terulet * this.nmAr;
    }

    public int lakokSzama() {
        return this.lakok;
    }

    @Override
    public String toString() {
        return "Lakás területe: " + terulet + ", szobaszám: " + szobaSzam +
                ", lakók száma: " + lakok + ", nm ár: " + nmAr;
    }
}
