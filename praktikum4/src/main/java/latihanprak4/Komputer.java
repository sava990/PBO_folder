/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanprak4;

/**
 *
 * @author acer
 */
public class Komputer {
 protected String prosesor;
 public void tampilkanProsesor() {
 System.out.println("Prosesor: " + prosesor);
 }
}
 class Laptop extends Komputer {
  public void tampilkanSpesifikasi() {
  System.out.println("Laptop menggunaka prosesor: " + prosesor);
 }
}

