/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.praktikumkelasobjek;

/**
 *
 * @author acer
 */
public class Tugaspraktikum3 {

    public static void main(String[] args) {
        Mobil avanza = new Mobil("avanza" , "bmw" ,2000 , "hitam");
        avanza.Displayinfo();
        avanza.StartEngine();
        
        Mobil pajero = new Mobil("pajero","matic" , 2000 , "hitam");
        pajero.Displayinfo();
        avanza.StartEngine();
        
        
    }
}

class Mobil {
    private String merk;
    private String model;
    private int tahun;
    private String warna;
    
    public Mobil(String merk, String model , int tahun, String warna){
       this.merk = merk;
       this.model = model;
       this.tahun = tahun;
       this.warna = warna;
    }
    
    public String getMerk(){
      return merk;
    }
    
    public void setMerk(String merk){
        this.merk = merk;
        
    }
    
    public String getModel(){
      return model;
    }
    
    public void setModel(String model){
      this.model = model;
    }
    
    public int getTahun(){
      return tahun;
    }
    
    public void setModel(int Tahun){
      this.tahun = Tahun;
    }
    
    public String getWarna(){
      return warna;
    }
    
    public void setWarna(String warna){
      this.warna = warna;
    }

    void Displayinfo(){
      System.out.println("mobil ini merk :" + merk + ", modelnya : " + model + " keluaran tahun :" + tahun  +" "+ warna);
    }
    
    void StartEngine(){
      System.out.println("Mesin mobil "+ merk  + " menyala");
    }
}