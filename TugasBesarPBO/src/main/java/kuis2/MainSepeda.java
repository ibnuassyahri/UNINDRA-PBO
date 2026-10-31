package kuis2;

public class MainSepeda {
    public static void main(String[] args) {
        System.out.println("=== SISTEM RENTAL SEPEDA ===");
        
        // Instansiasi minimal 2 object sepeda
        Sepeda sepeda1 = new Sepeda("SPD01", "Mountain Bike", 3, 20000);
        Sepeda sepeda2 = new Sepeda("SPD02", "Road Bike", 5, 25000);

        sepeda1.tampilData();
        sepeda2.tampilData();
    }
}