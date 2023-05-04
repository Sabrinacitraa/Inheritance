/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author ACER
 */
public class main {
    public static void main(String[] args) {
        //objek bangun datar
        BangunDatar b = new BangunDatar();
        
        //objek persegi dan mengisi nilai sisi
        Persegi p = new Persegi();
        p.sisi = 2;
        
        //objek lingkaran dan mengisi nilai jari - jari
        lingkaran l = new lingkaran();
        l.r = 22;
        
        //objek persegi panjang dan mengisi nilai panjang dan lebarnya
        PersegiPanjang j = new PersegiPanjang();
        j.panjang = 8;
        j.lebar = 4;
        
        //membuat objek segitiga
        Segitiga s = new Segitiga();
        s.alas = 12;
        s.tinggi = 8;
        
        //memanggil method luas dan keliling
        b.luas();
        b.keliling();
        System.out.println("");
        
        p.luas();
        p.keliling();
        System.out.println("");
       
        l.luas();
        l.keliling();
        System.out.println("");
        
        j.luas();
        j.keliling();
        System.out.println("");
        
        s.luas();            
    }
}
