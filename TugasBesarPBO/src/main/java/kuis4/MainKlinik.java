package kuis4;

import java.util.ArrayList;

public class MainKlinik {
    public static void main(String[] args) {
        // 1. Deklarasi Collection
        ArrayList<Pemeriksaan> antreanKlinik = new ArrayList<>();

        // 2. Data Entry minimal 3 object
        antreanKlinik.add(new Pemeriksaan("REG001", "Andi Pratama", "dr. Tirta", 150000));
        antreanKlinik.add(new Pemeriksaan("REG002", "Siti Rahma", "dr. Boyke", 200000));
        antreanKlinik.add(new Pemeriksaan("REG003", "Dewi Sartika", "dr. Aisyah", 175000));

        System.out.println("=== DATA ANTREAN PEMERIKSAAN KLINIK ===");
        double totalPendapatanKlinik = 0;

        // 3. Iterasi / Looping
        for (Pemeriksaan p : antreanKlinik) {
            p.tampilData();
            totalPendapatanKlinik += p.hitungTotal();
        }

        System.out.println("TOTAL ESTIMASI BIAYA KESELURUHAN: Rp " + totalPendapatanKlinik);
    }
}