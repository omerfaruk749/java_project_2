package P_izin_takip;



import java.util.Scanner;
import java.util.ArrayList;



public class personel {
    
    
    
    ArrayList isim = new ArrayList();
    ArrayList soyisim = new ArrayList();
    ArrayList yas = new ArrayList();
    ArrayList numara = new ArrayList();
    ArrayList unvan = new ArrayList();
    ArrayList indis = new ArrayList();

    void calısanlar1()
    {
    this.isim.add("Ahmet");
    this.soyisim.add("Tanrıverdi");
    this.yas.add(47);
    this.numara.add(55);
    this.unvan.add("Müdür");

    
    this.isim.add("Furkan");
    this.soyisim.add("Kırmızı");
    this.yas.add(27);
    this.numara.add(12);
    this.unvan.add("İşçi");
    }
    
    
    Scanner s = new Scanner(System.in);
    izinSinifi todo = new izinSinifi();
    
    
    void personelListele() {

        for (int i = 0; i < this.numara.size(); i++) {

            System.out.format("Personel %d Personel numarası: %d , isim Soyisim: %s%s , Şirketteki ünvanı: %s , Yaş: %d\n", i, this.numara.get(i), this.isim.get(i), this.soyisim.get(i), this.unvan.get(i), this.yas.get(i));
        }
    }
   
    
    int gorevlist() 
    {

        System.out.println(" 0  Müdür");
        System.out.println(" 1  İşçi");
        System.out.println(" 2  CEO");
        System.out.println(" 3  Stajyer");
        System.out.println(" 4  Sahip");
        System.out.println("\n  Unvanınızı girin: ");

        return s.nextInt();

    }
    
    void personelcheck(String ad)
    {
        for (int i = 0; i < this.isim.size(); i++) 
        {
            if (isim == null ? String.valueOf(this.isim.get(i)) == null : isim.equals(String.valueOf(this.isim.get(i)))) {
                this.indis.add(i);
            }

        }
         for (int i = 0; i < this.indis.size(); i++) 
        {

            int indis = (Integer) this.indis.get(i);
            System.out.format("Personel %d Personel numarası: %d , İsim Soyisim : %s%s , Şirketteki Ünvanı: %s, Yaş: %d\n", i, this.numara.get(indis), this.isim.get(indis), this.soyisim.get(indis), this.unvan.get(indis), this.yas.get(indis));

        }

        indis.clear();
    }
    
    
    
    
    void personelcheck(int numara) /*overload*/
    {
        for (int i = 0; i < this.numara.size(); i++)
        {
            if (numara == (Integer)this.numara.get(i)) {
                this.indis.add(i);
            }
        }
        for (int i = 0; i < this.indis.size(); i++) {

            int indis = (Integer) this.indis.get(i);
            System.out.format("Personel %d Personel numarası: %d , İsim Soyisim : %s%s , Şirketteki Ünvanı: %s, Yaş: %d\n", i, this.numara.get(indis), this.isim.get(indis), this.soyisim.get(indis), this.unvan.get(indis), this.yas.get(indis));

        }

        indis.clear();
    }
    
    
    
    
    void personelekle(int numara1)
    {
        System.out.println("Personel ekleme ekranına hoş geldiniz.\n Lütfen numaranızı giriniz...");
        numara1=s.nextInt();
        for (int i = 0; i < (Integer)this.numara.size(); i++)
        {
            if(numara1==(Integer)this.numara.get(i))
                System.out.println("Girmiş olduğunuz numara mevcut. Bu numarayı alamazsınız...");
        }
        
        
        System.out.print("İsmini ve soyisminizi girin: ");
        String ad = s.nextLine();
        System.out.println(" ");
        String soyad = s.nextLine();
        System.out.print("Yaşınızı girin: ");
        int yas = s.nextInt();
        int deger = gorevlist();
        String gorev = todo.unvanlar[deger];   /*todo izin sıfımızdan aldığımız obje.*/
        
        
        this.numara.add(numara1);
        this.isim.add(ad);
        this.soyisim.add(soyad);
        this.yas.add(yas);
        this.unvan.add(gorev);
        System.out.println("İşlem tamamlandı");
    
    }
    
    
    
    
    void PersonelSil() {

        System.out.print("Personel numaranızı girin: ");
        int number = s.nextInt();
        int indis = numara.indexOf(number);
        this.numara.remove(indis);
        this.isim.remove(indis);
        this.soyisim.remove(indis);
        this.yas.remove(indis);
        this.unvan.remove(indis);
        System.out.println("Numarasınız girdiğiniz personel başarıyla silindi...");

        }
        
        
    void izinKullan() {

        System.out.println("İzin kullanılacak personelin numarasını girin: ");
        personelListele();
        int deger = s.nextInt();
        String gorev = (String) (this.unvan.get(deger));

        todo.izinkullan(1, gorev);
    }
    
    
    
    
    
    

    public ArrayList getIsim() {
        return isim;
    }

    public void setIsim(ArrayList isim) {
        this.isim = isim;
    }

    public ArrayList getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(ArrayList soyisim) {
        this.soyisim = soyisim;
    }

    public ArrayList getYas() {
        return yas;
    }

    public void setYas(ArrayList yas) {
        this.yas = yas;
    }

    public ArrayList getNumara() {
        return numara;
    }

    public void setNumara(ArrayList numara) {
        this.numara = numara;
    }

    public ArrayList getUnvan() {
        return unvan;
    }

    public void setUnvan(ArrayList unvan) {
        this.unvan = unvan;
    }

    public ArrayList getIndis() {
        return indis;
    }

    public void setIndis(ArrayList indis) {
        this.indis = indis;
    }

    public Scanner getS() {
        return s;
    }

    public void setS(Scanner s) {
        this.s = s;
    }

    public izinSinifi getTodo() {
        return todo;
    }

    public void setTodo(izinSinifi todo) {
        this.todo = todo;
    }
        

    
    }
    
 
    
    
    
    
    
   

