/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;

/**
 *
 * @author Rudi Erwanto
 */
public class HurufR {
    public static void main(String[] args) {
        
        for (int sp = 0; sp < 2; sp++) {
            System.out.println(" ");
        }
        int r1;
        int ar;
        for(r1 = 0; r1 < 2; r1++) {
            System.out.print("||");
            for (ar = 0; ar < r1;ar++) {
                System.out.print(" ");
            }
            System.out.println("||");
        }//R atas
        for (r1 = 0; r1 < 3; r1++) {
            System.out.print("||");
            for (ar = 0; ar < r1; ar++) {
                System.out.print(" ");
            }
            System.out.println("||");
        }
    }
}

