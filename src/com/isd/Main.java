package com.isd;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        HashMap<Mahasiswa, Integer> mapMahasiswa = new HashMap<>();

        Mahasiswa rama = new Mahasiswa("6796213021", "Rama", "45-04");
        Mahasiswa Adi = new Mahasiswa("6796213030", "Adi", "45-03");
        Mahasiswa Bayu = new Mahasiswa("6796213020", "Bayu", "45-02");

        mapMahasiswa.put(rama, 60);
        mapMahasiswa.put(Adi, 80);
        mapMahasiswa.put(Bayu, 100);

//        System.out.println(mapMahasiswa.get(rama));
//        System.out.println(mapMahasiswa.get(Adi));
//        System.out.println(mapMahasiswa.get(Bayu));

        print(mapMahasiswa);
        System.out.println("Nilai rata-rata Mahasiswa dengan jumlah mhs: " + mapMahasiswa.size() + " adalah " + mean(mapMahasiswa));

        mapMahasiswa.remove(Bayu);
        System.out.println();

        print(mapMahasiswa);
        System.out.println("Nilai rata-rata Mahasiswa dengan jumlah mhs: " + mapMahasiswa.size() + " adalah " + mean(mapMahasiswa));

    }

    //method
    public static int mean(HashMap<Mahasiswa,Integer> mhs) {
        int jumlahNilai = 0;
        for (Object obj: mhs.keySet()) {
            jumlahNilai += mhs.get(obj);
        }
        return(jumlahNilai/mhs.size());
    }

    public static void print(HashMap<Mahasiswa,Integer> mhs) {
        for (Object obj: mhs.keySet()) {
            System.out.println("key: " + obj + " memiliki nilai: " + mhs.get(obj));
        }
    }
}
