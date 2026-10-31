package kuis3;

public class MainKafe {
    public static void main(String[] args) {
        System.out.println("=== SISTEM KASIR KAFE ===");

        // Inisialisasi menggunakan constructor berparameter
        Menu menu1 = new Menu("M01", "Nasi Goreng", 18000, "Makanan");
        
        // Output kasir sesuai ekspektasi soal
        int jumlahPesan = 2;
        menu1.tampilMenu();
        System.out.println("Jumlah        : " + jumlahPesan + " (Parameter input)");
        System.out.println("Total         : Rp " + menu1.hitungHarga(jumlahPesan) + " (Return calculation)");
        System.out.println("------------------------------------");

        // Contoh inisialisasi menggunakan constructor tanpa parameter
        Menu menuKosong = new Menu();
        menuKosong.tampilMenu();
        System.out.println("Total (1 pcs) : Rp " + menuKosong.hitungHarga(1));
    }
}