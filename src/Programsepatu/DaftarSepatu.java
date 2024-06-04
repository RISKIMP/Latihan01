/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Programsepatu;

/**
 *
 * @author Puji Astuti
 */
public class DaftarSepatu {
    public static void  main (String[] args) {
        Sepatu sepatusatu = new Sepatu ();
        Sepatu sepatudua = new Sepatu ();
        
        sepatusatu.merk = "Nike";
        sepatusatu.warna = "Hitam";
        sepatusatu.ukuran = 42;
        
        sepatudua.merk = "Adidas";
        sepatudua.warna = "Putih";
        sepatudua.ukuran = 43;
        
        System.out.println("merk :" + sepatusatu.merk);
        System.out.println("warna :" + sepatusatu.warna);
        System.out.println("ukuran :" + sepatusatu.ukuran);
        System.out.println("");
        
        System.out.println("merk :" + sepatudua.merk);
        System.out.println("warna :" + sepatudua.warna);
        System.out.println("ukuran :" + sepatudua.ukuran);
        
        
        
    }
}
