package kuis5;

import java.util.ArrayList;

public class MainTiket {
    public static void main(String[] args) {
        // Deklarasi ArrayList untuk menampung tiket
        ArrayList<Tiket> daftarPesanan = new ArrayList<>();

        // Memasukkan data transaksi tiket
        daftarPesanan.add(new Tiket("T001", "Interstellar", "IMAX 2D", 65000, 2));
        daftarPesanan.add(new Tiket("T002", "Spider-Man", "Regular", 45000, 3));
        daftarPesanan.add(new Tiket("T003", "Dune: Part Two", "Premiere", 100000, 1));

        System.out.println("============================================");
        System.out.println("       STRUK PEMESANAN TIKET BIOSKOP        ");
        System.out.println("============================================");

        double totalPenjualan = 0;

        // Iterasi cetak struk via console UI
        for (Tiket t : daftarPesanan) {
            t.tampilData();
            totalPenjualan += t.hitungTotal();
        }

        System.out.printf("\nGRAND TOTAL PEMESANAN: Rp %.0f\n", totalPenjualan);
    }
}