/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPrak6;

/**
 *
 * @author acer
 */
import java.util.ArrayList;
import java.util.List;

public class KeranjangBelanja {
    private List<Produk> listProduk;

    public KeranjangBelanja() {
        listProduk = new ArrayList<>();
    }

    public void tambahProduk(Produk produk) {
        listProduk.add(produk);
        System.out.println(produk.getNama() + " berhasil ditambahkan ke keranjang.");
    }

    public double hitungTotalHargaSetelahDiskon() {
        double total = 0;
        for (Produk produk : listProduk) {
            double hargaSetelahDiskon = produk.getHarga() - produk.hitungDiskon();
            total += hargaSetelahDiskon;
        }
        return total;
    }
}
