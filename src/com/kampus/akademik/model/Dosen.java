package com.kampus.akademik.model;

public class Dosen {
    public String nidn, nama, matakuliah;

    // Init data
    public Dosen(String nidn, String nama, String matakuliah){
        this.nidn = nidn;
        this.nama = nama;
        this.matakuliah = matakuliah;
    }

    public void showData(){
        System.out.println("Dosen NIDN: " + nidn + " | Nama: " + nama + " | Matkul: " + matakuliah);
    }
}
