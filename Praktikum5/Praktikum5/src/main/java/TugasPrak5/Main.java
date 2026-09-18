/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPrak5;

/**
 *
 * @author acer
 */
public class Main {
    public static void main(String[] args) {
        
        Kucing kucingku = new Kucing();
        kucingku.nama = "Mochi";
        kucingku.jenis = "Anggora";
        kucingku.tampilkanInfo();
        
        
        Anjing anjingku = new Anjing();
        anjingku.nama = "Buster";
        anjingku.jenis = "Golden Retriever";
        anjingku.tampilkanInfo();

        
        Mobil mobilku = new Mobil();
        mobilku.nama = "Honda Civic";
        mobilku.kecepatan = 150;
        mobilku.jumlahRoda = 4;   
        mobilku.jumlahPintu = 4;  
        mobilku.tampilkanInfo();
        
        
        SepedaMotor motorku = new SepedaMotor();
        motorku.nama = "Yamaha NMAX";
        motorku.kecepatan = 110;
        motorku.jumlahRoda = 2;       
        motorku.jenisMesin = "4-Tak"; 
        motorku.tampilkanInfo();
    }
}
