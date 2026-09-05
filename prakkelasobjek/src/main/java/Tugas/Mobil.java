package Tugas;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author acer
 */
public class Mobil {
    private String merk;
    private String model;
    private int tahun;
    private String warna;
    
    public Mobil(String merk , String model ,int tahun , String warna){
      this.merk = merk;
      this.model = model;
      this.tahun = tahun;
      this.warna = warna;
    }
    
    public void setMerk(String merk){
     this.merk = merk;
     
    }
    
    public String getMerk(){
     return merk;
    }
    public void setModel(String model){
     this.model = model;
    }
    public String getModel(){
     return model;
    }
    public void setTahun( int tahun){
     this.tahun = tahun;
    }
    
    public int getTahun(){
      return tahun;
    }
    public void setWarna(String warna){
     this.warna = warna;
    }
    
    public String getWarna(){
     return warna;
    }
    
    void displayinfo(){
     System.out.println("ini mobil merk : " + merk + " modelnya: " + model + " keluaran tahun : " + tahun + warna);
    }
    
    void startengine(){
     System.out.println("mobil merk : " + merk + " menyala");
    }
}
