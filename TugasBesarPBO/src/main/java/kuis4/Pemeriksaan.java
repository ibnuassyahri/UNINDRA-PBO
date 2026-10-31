package kuis4;

public class Pemeriksaan {
    private String noPemeriksaan;
    private String namaPasien;
    private String namaDokter;
    private double biayaPemeriksaan;

    public Pemeriksaan(String noPemeriksaan, String namaPasien, String namaDokter, double biayaPemeriksaan) {
        this.noPemeriksaan = noPemeriksaan;
        this.namaPasien = namaPasien;
        this.namaDokter = namaDokter;
        this.biayaPemeriksaan = biayaPemeriksaan;
    }

    public double hitungTotal() {
        // Biaya dasar (bisa ditambah komponen biaya lain jika ada)
        return biayaPemeriksaan;
    }

    public void tampilData() {
        System.out.println("No. Periksa      : " + noPemeriksaan);
        System.out.println("Nama Pasien      : " + namaPasien);
        System.out.println("Dokter Pemeriksa : " + namaDokter);
        System.out.println("Biaya            : Rp " + hitungTotal());
        System.out.println("----------------------------------------");
    }
}