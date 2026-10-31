package kuis2;

public class Sepeda {
    // Encapsulation (simbol -)
    private String kodeSepeda;
    private String jenisSepeda;
    private int lamaSewa;
    private double hargaPerJam;

    // Constructor dengan this
    public Sepeda(String kodeSepeda, String jenisSepeda, int lamaSewa, double hargaPerJam) {
        this.kodeSepeda = kodeSepeda;
        this.jenisSepeda = jenisSepeda;
        this.lamaSewa = lamaSewa;
        this.hargaPerJam = hargaPerJam;
    }

    // Method non-void (return calculation)
    public double hitungBiaya() {
        return lamaSewa * hargaPerJam;
    }

    // Method void untuk menampilkan data
    public void tampilData() {
        System.out.println("Kode Sepeda   : " + kodeSepeda);
        System.out.println("Jenis Sepeda  : " + jenisSepeda);
        System.out.println("Lama Sewa     : " + lamaSewa + " jam");
        System.out.println("Harga per Jam : Rp " + hargaPerJam);
        System.out.println("Total Biaya   : Rp " + hitungBiaya());
        System.out.println("------------------------------------");
    }
}