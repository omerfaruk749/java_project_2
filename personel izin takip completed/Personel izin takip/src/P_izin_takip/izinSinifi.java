package P_izin_takip;


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
public class izinSinifi {
    
    Scanner scan = new Scanner(System.in);
    String[] unvanlar={"Müdür","İşçi","CEO","Stajyer","Sahip"};
    public int[] izinsayilari={30,20,50,5,365};
    
    
    void Secimler() 
    {
    for (int i = 0; i < unvanlar.length; i++) {
        System.out.format("\n%s görüntülemek için [%d]",unvanlar[i] ,i);
    }
    }
    
    void izinGoster(){
        Secimler();
        System.out.println("\nİzinleri görüntülemek için, görüntülemek istediğiniz sınıfın numarasını girin.");
        int deger = scan.nextInt();
        while (deger>=0 && deger<6)
        {
            System.out.format("%s için kalan izin gün adedi : %d adet", unvanlar[deger], this.izinsayilari[deger]);
            break;
        }
        if (deger<0 || deger>=6)
        {
            System.out.println("Hatalı numara girdiniz.");
        }
    }
    
    
    void izinkullan(int miktar,String unvan)
    {
        int i =0;
        for (i=0 ; i<5 ; i++)
        {
            if(unvanlar[i].equals(unvan))
            {
                this.izinsayilari[i] = izinsayilari[i]-miktar;
                System.out.println("İzninizi kullandınız. Kalan izin günleriniz: " + this.izinsayilari[i] + " gün");
                if(this.izinsayilari[i]<=3){
                    izindurumu();
                }

            }
        }
    }

    
    
     void izindurumu() {

        System.out.println("\n");
        for (int i = 0; i < this.izinsayilari.length; i++) {

            if (this.izinsayilari[i] < 3) {
                System.out.println(" İzin günleriniz bitmek üzere!!!!");
            }

        }

    }


    }

