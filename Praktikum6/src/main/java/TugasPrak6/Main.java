/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPrak6;

/**
 *
 * @author acer
 */
public class Main {
    public static void main(String[] args){
    KeranjangBelanja keranjang = new KeranjangBelanja();

        Produk buku = new Buku("Buku Pemrograman Java", 100000);
        Produk hp = new Elektronik("Smartphone", 2000000);
        Produk kemeja = new Pakaian("Kemeja Pria", 200000);

        keranjang.tambahProduk(buku);
        keranjang.tambahProduk(hp);
        keranjang.tambahProduk(kemeja);

        double totalBelanja = keranjang.hitungTotalHargaSetelahDiskon();
        System.out.println("Total harga setelah diskon: Rp " + totalBelanja);
     
    }
}
