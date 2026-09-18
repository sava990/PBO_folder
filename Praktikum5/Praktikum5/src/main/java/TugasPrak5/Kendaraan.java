/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TugasPrak5;

/**
 *
 * @author acer
 */
class Kendaraan {
    String nama;
    int kecepatan;

    public void tampilkanInfo() {
        System.out.println("Nama Kendaraan : " + nama);
        System.out.println("Kecepatan      : " + kecepatan + " km/jam");
    }
}

class KendaraanDarat extends Kendaraan {
    int jumlahRoda;

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jumlah Roda    : " + jumlahRoda);
    }
}

class Mobil extends KendaraanDarat {
    int jumlahPintu;

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jumlah Pintu   : " + jumlahPintu);
    }
}

class SepedaMotor extends KendaraanDarat {
    String jenisMesin;

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("Jenis Mesin    : " + jenisMesin);
    }
}
