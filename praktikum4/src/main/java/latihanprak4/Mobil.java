/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanprak4;

/**
 *
 * @author acer
 */
public class Mobil extends Kendaraan{
    private int jumlahPintu;
    
    public Mobil(String nama, int KecepatanMaks, String JenisMesin, int jumlahPintu){
      super(nama, KecepatanMaks, JenisMesin);
      this.jumlahPintu = jumlahPintu;
    }
    
    public int getjumlahPintu(){
      return jumlahPintu;
      
    }
    
    public void setJumlahPintu(int jumlahPintu) {
        this.jumlahPintu = jumlahPintu;
    }
    

    public void tampilkaninfomobil(){
     System.out.println("kecepatan maksimum mobil : " + KecepatanMaks + "km/h");
     System.out.println("Jumlah Pintu : " + jumlahPintu);
    }
    
}
