/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPrak6;

/**
 *
 * @author acer
 */
public class Produk {
    protected String nama;
    protected double harga;
   
    public Produk(String nama , double harga){
     this.nama = nama;
     this.harga = harga;
            
    }
    
    public double hitungDiskon(){
     return 0;
    }
    
    public double getHarga(){
     return harga;
    }
    
    public String getNama(){
     return nama;
    }
}

class Elektronik extends Produk{
   public Elektronik(String nama, double harga){
    super(nama,harga);
   }
   
   @Override
   public double hitungDiskon(){
     return harga * 0.10;

   }
   
}

class Pakaian extends Produk{
   public Pakaian(String nama , double harga){
    super(nama, harga);
   }
   
   @Override
   public double hitungDiskon(){
    return harga * 0.20;
   }
}

class Buku extends Produk{
  public Buku(String nama , double harga){
   super(nama, harga);
  }
  
  @Override
  public double hitungDiskon(){
    return harga * 0.50;
  }
  
}