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
public class HurufL {
    public static void main(String[] args) {
            
        for (int sp = 0; sp < 2; sp++) {
            System.out.println("");
        }
        for (int l = 0; l < 4; l++) {
            for (int l1 = 0; l1 < 2; l1++) {
                System.out.print("|");
            }
            System.out.println("");
        }
        for (int l2 = 0; l2 < 8; l2++) {
            System.out.print("-");
        }
        System.out.println("");

    }
}
