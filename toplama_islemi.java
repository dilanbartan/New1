/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package romarakamlarıtoplama;

/**
 *
 * @author asus*/
 import java.util.Scanner;
public class toplama_islemi {
    String toplamString ;
    int toplamInt ;
    
    public toplama_islemi(){
        Scanner girdi = new Scanner(System.in);
     String rakam1; String rakam2;
    System.out.println("İlk katarı giriniz: "); rakam1=girdi.next();
    System.out.println("İkinci katarı giriniz: "); rakam2=girdi.next();        
        // Buyuk harf - kucuk harf sorunuyla karsilasmamak icin roma rakamlarini buyuk harfe donusturuyoruz
        rakam1 = rakam1.toUpperCase() ;
        rakam2 = rakam2.toUpperCase() ;
        
        int sayi1=0 , sayi2=0 ;
        
        // 1. Sayıyı bulmak icin
        for (int i=0; i<rakam1.length(); i++){
            
            //rakam1[i]'deki deger bulunuyor 
            int s1 = HarftenSayiya(rakam1.charAt(i)) ;
 
            if (i+1 < rakam1.length()){  
                //rakam1[i+1]'deki deger bulunuyor
                int s2 = HarftenSayiya(rakam1.charAt(i+1)) ;

                //rakam1[i] ile rakam1[i+1] karsılastırılıyor
                if (s1 >= s2){
                    //rakam1[i] >= rakam1[i+1] ise :
                    sayi1 = sayi1 + s1 ;
                }
                
                //rakam1[i] < rakam1[i+1] ise :
                else{
                    sayi1 = sayi1 + s2 - s1 ;
                    i++ ; 
                }
            }
            else{
                sayi1 = sayi1 + s1 ;
                i++;
            }
        }
        
        // 2. Sayıyı bulmak icin
        for (int i=0; i<rakam2.length(); i++){
            
            int s1 = HarftenSayiya(rakam2.charAt(i));
 
            if (i+1 < rakam2.length()){
                
                int s2 = HarftenSayiya(rakam2.charAt(i+1)) ;

                if (s1 >= s2){
                    sayi2 = sayi2 + s1 ;
                }
                
                else{
                    sayi2 = sayi2 + s2 - s1 ;
                    i++;
                }
            }
            else{
                sayi2 = sayi2 + s1 ;
                i++ ;
            }
        }
        
        toplamInt = sayi1+sayi2 ;
        toplamString = SayidanHarfe(toplamInt) ;
        
    }
    
    private String SayidanHarfe(int n){
        
        String romaRakami = "" ;
        int tekrarla ;
 
        tekrarla = n/1000 ;
        for(int i=1; i<=tekrarla; i++){
            romaRakami = romaRakami+"M";
        }
        n = n%1000 ;
 
        tekrarla = n/900 ;
        for(int i=1; i<=tekrarla;i++){
            romaRakami = romaRakami+"CM" ;
        }
        n = n%900 ;
 
        tekrarla = n/500 ;
        for(int i=1; i<=tekrarla;i++){
            romaRakami = romaRakami+"D" ;
        }
        n = n%500 ;
 
        tekrarla = n/400 ;
        for(int i=1; i<=tekrarla;i++){
            romaRakami = romaRakami+"CD" ;
        }
        n = n%400 ;
 
        tekrarla = n/100 ;
        for(int i=1; i<=tekrarla;i++){
            romaRakami = romaRakami+"C" ;
        }
        n = n%100 ;
 
        tekrarla = n/90 ;
        for(int i=1; i<=tekrarla;i++){
            romaRakami = romaRakami+"XC" ;
        }
        n = n%90 ;
 
        tekrarla = n/50 ;
        for(int i=1; i<=tekrarla;i++){
            romaRakami = romaRakami+"L" ;
        }
        n = n%50 ;
 
        tekrarla = n/40 ;
        for(int i=1; i<=tekrarla;i++){
            romaRakami = romaRakami+"XL" ;
        }
        n = n%40 ;
 
        tekrarla = n/10 ;
        for(int i=1; i<=tekrarla;i++){
            romaRakami = romaRakami+"X" ;
        }
        n = n%10 ;
 
        tekrarla = n/9 ;
        for(int i=1; i<=tekrarla;i++){
            romaRakami = romaRakami+"IX" ;
        }
        n = n%9 ;
 
        tekrarla = n/5 ;
        for(int i=1; i<=tekrarla;i++){
            romaRakami = romaRakami+"V" ;
        }
        n = n%5 ;
 
        tekrarla = n/4 ; 
        for(int i=1; i<=tekrarla;i++){
            romaRakami = romaRakami+"IV" ;
        }
        n = n%4 ;
 
        tekrarla = n/1 ; 
        for(int i=1; i<=tekrarla;i++){
            romaRakami = romaRakami+"I" ;
        }
        return romaRakami ;
    }


    private int HarftenSayiya(char harf){
        
        switch (harf){
            case 'I':  return 1 ;
            case 'V':  return 5 ;
            case 'X':  return 10 ;
            case 'L':  return 50 ;
            case 'C':  return 100 ;
            case 'D':  return 500 ;
            case 'M':  return 1000 ;
            default:   return 0 ;
        }
    }
}

