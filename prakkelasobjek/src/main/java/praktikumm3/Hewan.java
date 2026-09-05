/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikumm3;

/**
 *
 * @author acer
 */
public class Hewan {
     private String nama;
     private int umur;
     private String berlari;
     
     public Hewan(String nama , int umur , String lari){
         this.nama = nama;
         this.umur = umur;
         this.berlari = berlari;

     }
     
     public String getNama() {
      return nama;
     }
     
     public void setNama(String nama) {
      this.nama = nama;
     }
     
     public int getUmur(){
      return umur;
      
     }
     
     
     public void setUmur(int umur){
      this.umur = umur;
     }
     
     public String getLari(){
      return berlari;
     }
     
     public void setLari(String lari) {
      this.berlari = berlari;
     }
     void info(){
     System.out.println("nama kucingnya : " + nama + "umurnya " + umur);
     }
    
     void suara(){
     System.out.println("hewan bersuara");
    }
     void lari(){
     System.out.println("hewan sedang  berlari");
     }
}
