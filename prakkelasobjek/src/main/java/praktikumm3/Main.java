/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikumm3;

/**
 *
 * @author acer
 */
public class Main {
    public static void main(String[] args){
    Hewan kucing = new Hewan("andi" , 20," lari kaki 4");
//    kucing.nama = "joko";
//    kucing.umur = 12;
    kucing.suara();
    kucing.info();
    kucing.lari();
    
     Hewan anjing = new Hewan("ass" , 22,"kaki 4");
     anjing.suara();
     anjing.info();
     anjing.lari();
    
    }
    
  
}
    
