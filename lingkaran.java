/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Inheritance;

/**
 *
 * @author ACER
 */
public class lingkaran extends BangunDatar{
    
    
     //Menggunakan method Overriding
    float luas(){
        float luas = (float) (Math.PI * r * r);
//        System.out.println("Luas Lingkaran           : " + luas);
        return luas;
    }
    float keliling(){
        float keliling = (float) (Math.PI * r );
        System.out.println("Keliling Lingkaran       : " + keliling);
        return keliling;
    }
}
