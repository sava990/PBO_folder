/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas;

/**
 *
 * @author acer
 */
public class Main {
    public static void main(String[] args){
      Mobil kijang = new Mobil("kijang" , "model lama" , 2000 , "hitam");
      kijang.setWarna("nigga");
      kijang.displayinfo();
      
      kijang.startengine();
      
      Mobil bmw = new Mobil("be em we " , "SUV" , 2000 , "hitam");
      bmw.displayinfo();
      bmw.startengine();
    }
}
