/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanprak4;

/**
 *
 * @author acer
 */
public class Main {
    public static void main(String[] args) {
    Kendaraan1 mobile = new Kendaraan1();
    mobile.jenisMesin = "Bensin";
    mobile.tampilkanJenisMesin();
    
//    Kendaraan motor = new Kendaraan("ninja" , "racing" , 2000);
//    
//    System.out.println("Kendaraannya merk : " +  motor.getMerek());
//    motor.setMerek("harley");
//    System.out.println("Kendaraannya merk : " +  motor.getMerek());
    

    
//    Kendaraan brio = new Kendaraan("brio" , "xenia" , 2000);
//    System.out.println("kendaraannya : " + brio.getMerek() );
//    brio.setMerek("honda");
//    System.out.println("kendaraannya : " + brio.getMerek() );
      
//      Kendaraan bmw = new Kendaraan("bmw" , 2000 , "racing");
//      bmw.TampilInfoKendaraan();
         


    Mobil mobil = new Mobil("toyota" , 2000 , "avanza" ,2);
    mobil.tampilkaninfomobil();

 }
}
