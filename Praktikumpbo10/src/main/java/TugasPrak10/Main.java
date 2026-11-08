/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPrak10;

/**
 *
 * @author acer
 */
public class Main {
     public static void main(String[] args) {
        Pembayaran elektronik = new Elektronik();
        double hargaElektronik = 5000000;
        System.out.println("Harga Elektronik : Rp " + hargaElektronik);
        System.out.println("Pajak Elektronik (10%) : Rp " + elektronik.hitungPajak(hargaElektronik));

        System.out.println();

        Pembayaran makanan = new Makanan();
        double hargaMakanan = 100000;
        System.out.println("Harga Makanan : Rp " + hargaMakanan);
        System.out.println("Pajak Makanan (5%) : Rp " + makanan.hitungPajak(hargaMakanan));
 }
}