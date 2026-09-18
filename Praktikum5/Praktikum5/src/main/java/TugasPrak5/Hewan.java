/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPrak5;

/**
 *
 * @author acer
 */
class Hewan {
    String nama;
    String jenis;

    public void tampilkanInfo() {
        System.out.println("Nama Hewan : " + nama);
        System.out.println("Jenis      : " + jenis);
    }
}

class Kucing extends Hewan {
    public void bersuara() {
        System.out.println("Suara      : Meow! Meow!");
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo(); 
        bersuara();            
    }
}

class Anjing extends Hewan {
    public void bersuara() {
        System.out.println("Suara      : Guk! Guk!");
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        bersuara();
    }
}
