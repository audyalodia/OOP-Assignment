package com.kampus.akademik.main;

import com.kampus.akademik.model.Mahasiswa;
import com.kampus.akademik.model.Dosen;
import com.kampus.akademik.service.*;

public class MainApp {
    public static void main(String[] args){
        AcademicService service = new AcademicService();

        // Data mahasiswa
        Mahasiswa[] studentList = {
            new Mahasiswa("20010098", "Reign", "Informatika"),
            new Mahasiswa("20010099", "Alastair", "Cyber Security"),
            new Mahasiswa("20010100", "Sera", "Psikologi")
        };

        // Data dosen
        Dosen[] lecturerList = {
            new Dosen("100200001", "Cassandra", "Artificial Intelligence"),
            new Dosen("100200002", "Leo", "Machine Learning"),
            new Dosen("100200003", "River", "Kalkulus I")
        };

        System.out.println("___ DATA AKADEMIK ___");

        // Menampilkan data
        for (Mahasiswa r : studentList) {
            service.showMahasiswa(r);
        }
        System.out.println("----------------------");

        for (Dosen j: lecturerList) {
            service.showDosen(j);
        }
        System.out.println("______________________");
    }
}
