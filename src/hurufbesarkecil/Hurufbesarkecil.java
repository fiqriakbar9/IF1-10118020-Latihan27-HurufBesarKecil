/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hurufbesarkecil;

import java.util.Scanner;

/**
 *
 * @author 'KoalaX'
 * NAMA     : Fiqri Akbar Pratama
 * KELAS    : PBO1/IF1
 * NIM      : 10118020
 * Deksripsi Program : Program ini berisi program untuk menampilkan hasil 
 * formatting dari huruf acak (besar dan kecil) lalu akan di bagi menjadi 2
 * antara besar dan kecil
 */
public class Hurufbesarkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String hbk;
        
        Scanner sc = new Scanner (System.in);
        System.out.printf("Masukkan Kalimmat : ");
        hbk = sc.nextLine();
        
        System.out.println("\n"+"=====Hasil Formatting====");
        System.out.println("Huruf Besar : "+ hbk.toUpperCase());
        System.out.println("Huruf Kecil : "+ hbk.toLowerCase());
     
        System.out.println ("\nDevelop by : Fiqri Akbar Pratama");
    }
    
}
