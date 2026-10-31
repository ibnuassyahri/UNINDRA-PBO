package kuis1;

public class Buku {
    // Default / package-private access modifier (simbol ~)
    String kodeBuku;
    String judul;
    String penulis;
    double harga;

    // Constructor
    public Buku(String kodeBuku, String judul, String penulis, double harga) {
        this.kodeBuku = kodeBuku;
        this.judul = judul;
        this.penulis = penulis;
        this.harga = harga;
    }

    // Method void untuk menampilkan data
    public void tampilData() {
        System.out.println("Kode Buku : " + kodeBuku);
        System.out.println("Judul     : " + judul);
        System.out.println("Penulis   : " + penulis);
        System.out.println("Harga     : Rp " + harga);
        System.out.println("------------------------------------");
    }
}