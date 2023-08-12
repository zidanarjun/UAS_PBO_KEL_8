/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UAS_KEL_8_NO_1;

/**
 *
 * @author Paulan
 */
public class Smartphone implements PPN {
    private String vendor,tipe;
    private double harga;

    // Constructor
    public Smartphone(String vendor, String tipe, double harga) {
        this.vendor = vendor;
        this.tipe = tipe;
        this.harga = harga;
    }

    // penerapan method
    @Override
    public double TotalPrice() {
        double totalHarga;
        if (harga > 4500000) {
            totalHarga = harga + (harga * 0.05); // PPN 5%
        } else if (harga >= 4200000 && harga <= 4500000) {
            totalHarga = harga + (harga * 0.02); // PPN 2%
        } else if (harga > 4000000) {
            totalHarga = harga + (harga * 0.01); // PPN 1%
        } else {
            totalHarga = harga; // No PPN
        }
        return totalHarga;
    }

   
    // Main method
    public static void main(String[] args) {
        // Create objects for each smartphone
        Smartphone samsung = new Smartphone("Samsung", "A51", 5000000.00);
        Smartphone oppo = new Smartphone("Oppo", "Reno 5", 4400000.00);
        Smartphone xiaomi = new Smartphone("Xiaomi", "A1", 4100000.00);

        // Menghitung dan mencetak hp dengan tambahan PPN
        System.out.println("Vendor: " + samsung.vendor + "\t\t Tipe: " + samsung.tipe + "\t\t Harga Setelah PPN Adalah : Rp." + samsung.TotalPrice());
        System.out.println("Vendor: " + oppo.vendor + "\t\t Tipe: " + oppo.tipe + "\t\t Harga Setelah PPN Adalah : Rp." + oppo.TotalPrice());
        System.out.println("Vendor: " + xiaomi.vendor + "\t\t Tipe: " + xiaomi.tipe + "\t\t Harga Setelah PPN Adalah : Rp." + xiaomi.TotalPrice());
    }
}
