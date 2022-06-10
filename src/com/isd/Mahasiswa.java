package com.isd;

public class Mahasiswa {
    private String NIM;
    private String nama;
    private String kelas;

    public Mahasiswa(String NIM, String nama, String kelas) {
        this.NIM = NIM;
        this.nama = nama;
        this.kelas = kelas;

    }

    @Override
    public int hashCode() {
        final int HASH_MULTIPLIER = 29;//gunakan bilangan primer sebagai pengali
        int h1 = NIM.hashCode();
        int h2 = nama.hashCode();
        int h3 = kelas.hashCode();
        int h = HASH_MULTIPLIER * h1 + h2 + h3;
        return h;//key merupakan gabungan antara NIM, nama dan kelas
    }
    // Equal objects must produce the same
    // hash code as long as they are equal
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (this.getClass() != obj.getClass()) {
            return false;
        }
        Mahasiswa mhs = (Mahasiswa) obj;
        return NIM.equals(mhs.NIM) && nama.equals(mhs.nama) && kelas.equals(mhs.kelas) ;
    }
    @Override
    public String toString() {
        return "Mahasiswa{" +
                "NIM='" + NIM + '\'' +
                ", nama='" + nama + '\'' +
                ", kelas='" + kelas + '\'' +
                '}';
    }

}

