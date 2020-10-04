package com.antaladrien;

import java.io.*;

public class Hazmester {

    public static void karbantart(String path) throws IOException, FileNotFoundException {
        Tarsashaz tarsashaz = new Tarsashaz(100, 100);

        BufferedReader br = new BufferedReader(new FileReader(path));
        String line = br.readLine();
        while (line != null) {
            String[] szavak = line.split(" ");
            if (szavak[0].equals("Alberlet")) {
                Alberlet a = new Alberlet(Double.parseDouble(szavak[1]),
                        Integer.parseInt(szavak[2]),
                        Integer.parseInt(szavak[3]));
                tarsashaz.lakasHozzaad(a);
            } else if (szavak[0].equals("CsaládiApartman")) {
                CsaladiApartman a = new CsaladiApartman(Double.parseDouble(szavak[1]),
                        Integer.parseInt(szavak[2]),
                        Integer.parseInt(szavak[3]));
                tarsashaz.lakasHozzaad(a);
            } else if (szavak[0].equals("Garazs")) {
                if (szavak[3].equals("futott")) {
                    Garazs a = new Garazs(Double.parseDouble(szavak[1]),
                            Integer.parseInt(szavak[2]), true);
                    tarsashaz.GarazsHozzaad(a);
                } else {
                    Garazs a = new Garazs(Double.parseDouble(szavak[1]),
                            Integer.parseInt(szavak[2]), false);
                    tarsashaz.GarazsHozzaad(a);
                }
            }
            line = br.readLine();
        }
        br.close();
        System.out.println("A társasház értéke: " + tarsashaz.ingatlanErtek());
    }

    public static void main(String[] args) throws IOException, FileNotFoundException {
        try {
            karbantart("input.txt");
        } catch (Exception ex) {
            System.out.println("Hiba történt.");
        }
    }
}
