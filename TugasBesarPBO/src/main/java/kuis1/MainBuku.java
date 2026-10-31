package kuis1;

public class MainBuku {
    public static void main(String[] args) {
        System.out.println("=== SISTEM DATA BUKU ===");
        
        // Instansiasi minimal 2 object
        Buku buku1 = new Buku("BK01", "Pemrograman Java Dasar", "Budi Raharjo", 85000);
        Buku buku2 = new Buku("BK02", "Struktur Data & Algoritma", "Rinaldi Munir", 95000);

        // Menampilkan data
        buku1.tampilData();
        buku2.tampilData();
    }
}