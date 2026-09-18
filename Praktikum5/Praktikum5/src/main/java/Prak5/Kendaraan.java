/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prak5;

/**
 *
 * @author acer
 */
// class Kendaraan {
//    public String nama;
//    public int kecepatan;
//    
////    public Kendaraan(String nama , int kecepatan){
////    this.nama = nama;
////    this.kecepatan = kecepatan;
////    
////    }
//    
//    public void Tampilinfo(){
//    System.out.println("kendaraan ini bernama " + nama );
//    System.out.println("Kecepatannya " + nama );
//
//    }
//    
//}
//
//class Mobil extends Kendaraan{
//   int jumlahPintu;
//   
//   @Override
//   public void tampilinfo(){
//      super.Tampilinfo();
//      System.out.println("jumlah pintu : " + jumlahPintu );
//   }
//}

public class Kendaraan {
    String nama;
    int kecepatan;
    
    public void tampilkanInfo() {
        System.out.println("Nama Kendaraan: " + nama);
        System.out.println("Kecepatan: " + kecepatan + " km/jam");
    }
}

class Mobil extends Kendaraan {
    int jumlahPintu;
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jumlah Pintu: " + jumlahPintu);
    }
}

class SepedaMotor extends Kendaraan {
    String jenisMesin;
    
    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jenis Mesin: " + jenisMesin);
    }
}