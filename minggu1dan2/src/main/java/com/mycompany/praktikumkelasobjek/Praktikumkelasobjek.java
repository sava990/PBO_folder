/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.praktikumkelasobjek;

/**
 *
 * @author acer
 */
public class Praktikumkelasobjek {

    public static void main(String[] args) {
        Hewan kucing = new Hewan("mimi" ,3 );
//        kucing.nama = "mimi";
//        kucing.umur = 3 ;
        kucing.suara();
        kucing.info();
        kucing.info2();
        kucing.berlari();
        
        Hewan anjing = new Hewan("dogs" , 4);
        anjing.info2();
        anjing.berlari();
    }
}
class Hewan{
    private String nama;
    private int umur;
    
    public Hewan(String nama , int umur){
       this.nama = nama;
       this.umur = umur;
    }
    
    public String getNama(){
       return nama;
    }
    
    public int getUmur(){
       return umur;
    }
    
    public void setUmur(int umur){
       this.umur = umur;
    }
    
    
    void suara(){
        System.out.println("hewan bersuara") ;
    }
    
    void info(){
        System.out.println("nama :" + nama);
        System.out.println("umur :" + umur);
    }
    
    void info2(){
        System.out.println("Nama :" + getNama()+ ", umur :" + getUmur());
    }
    
    void berlari(){
        System.out.println("hewan sedang berlari");
    }
    
    
}

//class Main{
//    public static void main(String[] args){
//    
//    }
//}
