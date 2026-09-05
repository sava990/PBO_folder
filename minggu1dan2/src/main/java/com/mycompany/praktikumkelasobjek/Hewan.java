/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.praktikumkelasobjek;

/**
 *
 * @author acer
 */


public class Hewan {
    int umur;
    String nama;
    
    public Hewan(int umur, String nama){
        this.nama = nama;
        this.umur = umur;    
    }
    
    void suara(){
        System.out.println("guk guk");
    }
    
    void info(){
        System.out.println("hallo " + nama + ", umurnya " + umur);
    }
    
    public static void main(String[] args){
        Hewan kucing = new Hewan(20, "anton"); 
        
        kucing.suara(); // Memanggil
        kucing.info();  
    }
}