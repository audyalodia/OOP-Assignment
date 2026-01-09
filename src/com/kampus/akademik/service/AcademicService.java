package com.kampus.akademik.service;

import com.kampus.akademik.model.Mahasiswa;
import com.kampus.akademik.model.Dosen;

public class AcademicService {
    public void showMahasiswa(Mahasiswa r){
        r.showData();
    }

    public void showDosen(Dosen j){
        j.showData();
    }
}
