package com.kampus.akademik.model;

public class Mahasiswa {
    public String nim, nama, jurusan;

    // Init data
    public Mahasiswa(String nim, String nama, String jurusan){
        this.nim = nim;
        this.nama = nama;
        this.jurusan = jurusan;
    }
    public void showData(){
        System.out.println("NIM Mahasiswa: " + nim + " | Nama: " + nama + " | Jurusan: " + jurusan);
    }
}
