package com.mycompany.mahasiswa3;

public class Nilai3 {
    private double tugas;
    private double uts;
    private double uas;
    private double kehadiran;

    // Constructor
    public Nilai3(double tugas, double uts, double uas, double kehadiran) {
        this.tugas = tugas;
        this.uts = uts;
        this.uas = uas;
        this.kehadiran = kehadiran;
    }

    public static void komponenPenilaian() { // Static Method
        System.out.println();
        System.out.println("Komponen Penilaian");
        System.out.println("Tugas             : 30%");
        System.out.println("UTS               : 30%");
        System.out.println("UAS               : 40%");
        System.out.println("Minimal Kehadiran : 75%");
        System.out.println();
    }

    public double hitungNilaiAkhir() { // Return Value
        return (0.30 * tugas) + (0.30 * uts) + (0.40 * uas);
    }

    public String predikat() { // Return Value
        double na = hitungNilaiAkhir();
        if (na >= 85) {
            return "A";
        } else if (na >= 75) {
            return "B";
        } else if (na >= 65) {
            return "C";
        } else if (na >= 50) {
            return "D";
        } else {
            return "E";
        }
    }

    public String status() { // Return Value
        if (kehadiran < 75) {
            return "Tidak Lulus (Kehadiran Kurang)";
        }
        if (hitungNilaiAkhir() >= 60) {
            return "Lulus";
        }
        return "Tidak Lulus";
    }

    public void tampilNilai() { // Method Void
        System.out.println("Nilai Tugas       : " + tugas);
        System.out.println("Nilai UTS         : " + uts);
        System.out.println("Nilai UAS         : " + uas);
        System.out.println("Kehadiran         : " + kehadiran + "%");
        System.out.println("Nilai Akhir       : " + hitungNilaiAkhir());
        System.out.println("Predikat          : " + predikat());
        System.out.println("Status            : " + status());
    }
}