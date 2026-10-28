/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugasprak9;

/**
 *
 * @author acer
 */
abstract class Hewan {
   abstract void suara();
   
   void info(){
   System.out.println("hewan bersuara : ");
   }
}

class Kucing extends Hewan{
   @Override
   void suara(){
   System.out.println("meoww");
   }
}

class Anjing extends Hewan{
   @Override 
   void suara(){
   System.out.println("GUK GUK");
   }
}