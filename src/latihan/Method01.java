/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan;


public class Method01 {
    public static int hitung(int a, int b) 
    {
        int c = a + b;
        return c;
    }
    
    
    public static void main(String[] args)
    {
        int x;
        int bil1 = 69, bil2 = 69;
        
        x = hitung(bil1, bil2 );
        System.out.println("Hasil : " + x);
    }
 
}
