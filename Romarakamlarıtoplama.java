/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package romarakamlarıtoplama;

/**
 *
 * @author asus
 */
public class Romarakamlarıtoplama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   toplama_islemi sonuc = new toplama_islemi() ;
        String romaRakamı = sonuc.toplamString ;
        int toplam = sonuc.toplamInt ;
        System.out.println(romaRakamı + " ( " + toplam + " ) ");    }
    
}
