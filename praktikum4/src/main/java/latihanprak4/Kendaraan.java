/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanprak4;

/**
 *
 * @author acer
 */
public class Kendaraan {
//    private String merk;
//    private String model;
//    private int tahun;
//    
//    public Kendaraan(String merk , String model , int tahun){
//     this.merk = merk;
//     this.model = model;
//     this.tahun = tahun;
//     
//
//    }
//    public String getMerek() {
//      return merk;
//    }
//    
//    public void setMerek(String merek) {
//     this.merk = merek;
//    }
//    
//    public String getModel() {
//     return model;
//    }
//    
//    public void setModel(String model) {
//      this.model = model;
//    }
//    
//    public int getTahun() {
//      return tahun;
//    }
//    
//    public void setTahun(int tahun) {
//     this.tahun = tahun;
//    }
//    
    private String nama;
    protected int KecepatanMaks;
    public String JenisMesin;
    
    public Kendaraan(String nama, int KecepatanMaks , String JenisMesin){
        this.nama = nama;
        this.KecepatanMaks = KecepatanMaks;
        this.JenisMesin = JenisMesin;
        
    }
    
    public String getNama(String nama){
        return nama;
    }
    
    public void setNama(){
        this.nama = nama;
    }
    
    public void TampilInfoKendaraan() {
     
        System.out.println("Nama Kendaraan = " + nama);
        System.out.println("Kecepatan Maksimum " + KecepatanMaks + "km/s");
        System.out.println("Jenis mesin : " + JenisMesin );
    }

} 
