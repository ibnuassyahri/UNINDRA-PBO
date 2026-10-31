package kuis3;

public class Menu {
    private String kodeMenu;
    private String namaMenu;
    private double harga;
    private String kategori;

    // Constructor 1: Tanpa Parameter (Overloading)
    public Menu() {
        this.kodeMenu = "DEFAULT";
        this.namaMenu = "Menu Standar";
        this.harga = 0.0;
        this.kategori = "Umum";
    }

    // Constructor 2: Dengan Parameter (Overloading)
    public Menu(String kodeMenu, String namaMenu, double harga, String kategori) {
        this.kodeMenu = kodeMenu;
        this.namaMenu = namaMenu;
        this.harga = harga;
        this.kategori = kategori;
    }

    // Method kalkulasi dengan parameter input
    public double hitungHarga(int jml) {
        return harga * jml;
    }

    // Method void menampilkan info dasar menu
    public void tampilMenu() {
        System.out.println("Kode Menu     : " + kodeMenu);
        System.out.println("Nama Menu     : " + namaMenu);
        System.out.println("Kategori      : " + kategori);
        System.out.println("Harga Satuan  : Rp " + harga);
    }
}