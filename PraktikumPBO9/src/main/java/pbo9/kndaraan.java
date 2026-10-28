/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo9;

/**
 *
 * @author acer
 */
abstract class kndaraan {
   abstract void berjalan();
 // Metode dengan implementasi
   void info() {
   System.out.println("Ini adalah kendaraan.");
 }

}
class Mobil extends kndaraan {
 @Override
 void berjalan() {
 System.out.println("Mobil sedang berjalan dengan cepat.");
 }
}

class Sepeda extends kndaraan {
 @Override
 void berjalan() {
 System.out.println("Sepeda sedang berjalan dengan pelan.");
 }
}