/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikum6;

/**
 *
 * @author acer
 */
public class Main {
    public static void main(String[] args){
   Hewan kucing = new Hewan();
   kucing.bersuara();
   kucing.makan("ikan");
   kucing.makan("ikan" , 2);
   
   
   
   
   Kucing kucings = new Kucing();
   kucings.bersuara();
   kucings.makan("ikan");
   kucings.makan("ikan",2);
   
   Anjing anjing = new Anjing();
   anjing.bersuara();
   anjing.makan("daging",2);
 }
}
