/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

import java.util.Scanner;

/**
 *
 * @author Rudi Erwanto
 */
public class Latihan4 {
     public static int hitung(int jarak,int waktu) 
    {
    return jarak / waktu;    
    }
    public static void main(String[] args) {
     Scanner masukkan = new Scanner(System.in);
     
        System.out.print("jarak tempuh mobil : ");
        int jarak = masukkan.nextInt();
        System.out.print("waktu tempuh mobil  : ");
        int waktu = masukkan.nextInt();
        
        int kecepatan;
        kecepatan = hitung(jarak, waktu);
        System.out.println("kecepatan mobil : "+ kecepatan +" KM/JAM ");
}
}
