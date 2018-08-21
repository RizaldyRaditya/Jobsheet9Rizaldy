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
public class Latihan5 {
     public static void main(String[] args){
         int pertama, kedua, ketiga, terbesar;
         Scanner scan = new Scanner(System.in);
         
         System.out.print("MASUKKAN BILANGAN PERTAMA = ");
         pertama = scan.nextInt();
         System.out.print("MASUKKAN BILANGAN KEDUA = ");
         kedua = scan.nextInt();
         System.out.print("MASUKKAN BILANGAN KETIGA = ");
         ketiga = scan.nextInt();
         
         if(pertama > kedua && pertama > ketiga) {
             terbesar = pertama;
         }else{
             if(kedua > ketiga) {
                 terbesar = kedua;
             }else{
                 terbesar = ketiga;
             }
         }
         System.out.println("BILANGAN TERBESAR ADALAH "+ terbesar);
     }
}
