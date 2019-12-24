package P_izin_takip;


import java.util.ArrayList;
import java.util.Scanner;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ÖFY
 */
public class PersonelIzinTakip {
    public static void main(String[] args) 
    {
        personel calisan = new personel();
        izinSinifi izinislem = new izinSinifi();
        OzelPersonel ozel = new OzelPersonel();
        ArrayList numara1 = new ArrayList();
        Scanner s = new Scanner(System.in);
        calisan.calısanlar1();
        ozel.calısanlar1();
        int secim = anamenu();
        
       
        while (secim>=0 && secim<7)
        {
            switch(secim)
            {
                case 0:
                    System.out.println("\nHangi işlemi yapmak istiyorsunuz?...");
                    System.out.println("Ozel personel eklemek için 0...");
                    System.out.println("Personel eklemek için 1...");
                    System.out.println("Personelleri görüntülemek için 2...");
                    System.out.println("Tuşlarına basın... ");
                    int secim1 = s.nextInt();
                    
                      switch (secim1)
                      {
                          case 0:
                              System.out.println("Personel numaranızı girin...");
                              int numara = s.nextInt();
                              ozel.personelekle(numara);
                              break;
                          case 1:
                              System.out.println("Personel numaranızı girin...");
                              int numara2 = s.nextInt();
                              calisan.personelekle(numara2);
                              break;
                          case 2:
                              System.out.println("Personeller listeleniyor. Lütfen bekleyin... ");
                              ozel.personelListele();
                              calisan.personelListele();
                              break;
                     
                              
                      }
                break;
                    
                case 1:
                    izinislem.izinGoster();
                    break;
                case 2:
                    System.out.println("Ozel personel iseniz 0'a basın....");
                    System.out.println("Normal personel iseniz 1'a basın....");
                    int deger = s.nextInt();
                    switch (deger)
                    {
                        case 0:
                            ozel.personelListele();
                            System.out.print("\nSeçiniz.... ");
                            int deger1 = s.nextInt();
                            System.out.println("Kullanmak istediğiniz gün sayısını girin...");
                            int deger2 = s.nextInt();
                            String unvan = (String) (ozel.unvan.get(deger1));
                            izinislem.izinkullan(deger2, unvan);
                            break;
                        case 1:
                            calisan.personelListele();
                            System.out.println("\nSeçiniz... ");
                            int deger3 = s.nextInt();
                            System.out.println("Kullanmak istediğiniz gün sayısını girin...");
                            int deger4 = s.nextInt();
                            String unvan1 = (String) (calisan.unvan.get(deger3));
                            izinislem.izinkullan(deger4, unvan1);
                            break;
                        default:
                            System.out.println("Hatalı deger girdiniz...");
                    }
                break;
                    
                case 3:
                    System.out.println("Programdan çıkılıyor...");
                    System.out.println("....");
                    System.out.println("........");
                    System.out.println(".............");
                    System.out.println("Programdan başarıyla çıkıldı...");
                break;
                default:
                    System.out.println("Hatalı deger girdiniz...");
            } 
        break;
        }
    
       
        
    }

    
    
    
    static int anamenu() {

        Scanner input = new Scanner(System.in);

        System.out.println("0 Personel işlemleri...");
        System.out.println("1 Unvanınıza göre kullanabileceğiniz izin günü miktarını görüntüle...");
        System.out.println("2 İzin kullan...");
        System.out.println("3 Programı kapat...");
        System.out.print("\nNe yapmak istiyorsunuz? --- ");
        int secim = input.nextInt();
        return secim;

    }    
}
