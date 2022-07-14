package Lab1;

import java.util.Scanner;

public class Lab1 {

    public static void main(String[] args) {
        //CALISMA 1 YOL 1:
        String tumce;
        Scanner scan = new Scanner(System.in);
        System.out.println("Cumleyi girin");
        tumce = scan.nextLine();
        char[] tumce2 = tumce.toCharArray();
        String sessizler = "bcdfghjklmnprstvyzqwBCDFGHJKLMNPRSTVYZQW ";
        for (int i = 0; i <= tumce.length() - 1; i++) {
            for (int j = 0; j <= sessizler.length() - 1; j++) {
                if (tumce.charAt(i) == sessizler.charAt(j)) {
                    System.out.print(tumce2[i]);
                }
            }
        }
    }
    //CALİSMA 1 YOL 2 (ZAMAN KARMASİKLİGİ ACİSİNDAN DAHA VERİMLİ):
    /*int sayac=0;
    String tumce;
    Scanner scan = new Scanner(System.in);
    System.out.println("Cumleyi girin");
    tumce = scan.nextLine();
    char[] tumce2= tumce.toCharArray();
    String sesliler="a,e,i,u,o,A,E,I,U,O";
    for(int i = 0 ; i<=tumce.length()-1;i++){
        for (int j = 0; j<=sesliler.length()-1;j++){
             if(tumce.charAt(i)==sesliler.charAt(j))
                 sayac++;}
        if (sayac==0)
        System.out.print(tumce2[i]);
        sayac=0;
    }}*/
/*
   //CALISMA 2:

    int sayac=0;
    String tumce;
    String karakter="a";
    Scanner scan = new Scanner(System.in);
    System.out.println("Cumleyi girin");
    tumce = scan.nextLine();

    for(int i = 0 ; i<=tumce.length()-1;i++){
    if(tumce.charAt(i)==karakter.charAt(0))
    sayac++;
    }

    System.out.println("a sayisi: " + sayac);
}*/
}
