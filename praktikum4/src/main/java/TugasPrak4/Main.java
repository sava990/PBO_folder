/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPrak4;

/**
 *
 * @author acer
 */
public class Main {
    public static void main(String []args){
    Pekerja Sava = new Pekerja("Sava" , 20 , "programmer" , 10000000);
    System.out.println("Data awal : ");
    System.out.println(Sava.toString());
    
    Sava.setNama("alfa");
    System.out.println("Data setelah diubah : ");

    System.out.println(Sava.toString());
    
    // System.out.println(pekerja1.nama);      // ERROR: Karena private
    // System.out.println(pekerja1.usia);      // BISA: Karena protected (jika Main di package yang sama)
    // System.out.println(pekerja1.pekerjaan); // BISA: Karena public
    // System.out.println(pekerja1.gaji);      // ERROR: Karena private

    }
}   
