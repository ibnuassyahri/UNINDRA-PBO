package com.mycompany.mahasiswa3;

public class Mahasiswa3 {
    // Access Modifier
    private String npm;
    private String nama;
    private String kelas;
    private String prodi;
    private int semester;

    // Constructor berparameter
    public Mahasiswa3(String npm, String nama, String kelas, String prodi, int semester) {
        this.npm = npm;
        this.nama = nama;
        this.kelas = kelas;
        this.prodi = prodi;
        this.semester = semester;
    }

    // Static Method
    public static void identitasKampus() {
        System.out.println("==============================");
        System.out.println("SISTEM NILAI MAHASISWA");
        System.out.println("UNIVERSITAS ABC");
        System.out.println("==============================");
    }

    // Method Void
    public void tampilMahasiswa() {
        System.out.println("NPM         : " + npm);
        System.out.println("Nama        : " + nama);
        System.out.println("Kelas       : " + kelas);
        System.out.println("Prodi       : " + prodi);
        System.out.println("Semester    : " + semester);
    }

    public String getNpm() {
        return npm;
    }

    public String getNama() {
        return nama;
    }

    public String getKelas() {
        return kelas;
    }

    public String getProdi() {
        return prodi;
    }

    public int getSemester() {
        return semester;
    }
}