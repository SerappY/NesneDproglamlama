/**
 * 
 * 1-Girilen iki degerin, toplama, cikarma, carpma, bolme ve kalanini ekrana basan Java programi yaziniz.
 * 2-Girilen bir sayinin 1'den 10 kadar olan carpimlarini ekranda gosteren Java programi yaziniz.
 * 3-Girilen bir string degerini ters cevirip ekrana yazan Java programi yaziniz. (Not: Stringdeki bir
karactere ulasmak icin String sinifinin charAt methodunu kullaniniz.
 * 4-Kullanicindan 1 den 9 kadar olan iki rakam aldiktan sonra, 1 ile 100 arasinda bu rakamlardan
herbirine ve ikisinin carpina tam bolunebilen sayilari ekrana yaziniz. Kullanici rakam disinda bir deger
girdiginde program uyari verip, yeni deger girilmesini istemeli
 * +NOTLAR+
 * Konsoldan giriþ alacaðýmýz için   
   Java kütüphanesinden Scanner sýnýfýný programýmýza  
   dahil ediyoruz.  
 * 
 * SON soruda eksik var yetiþtiremedim:(
 */
import java.util.Scanner;

public class Hafta5 {
	 public static void main(String[] args) {
		 /*
		  
	        Scanner input= new Scanner(System.in);
	        System.out.println("Birinci sayiyi giriniz: ");
	        double sayi1 = input.nextDouble();
	         
	        System.out.println("Ikinci sayiyi giriniz: ");
	        double sayi2 = input.nextDouble();
	         
	        System.out.println("Sayilar Toplami :" + (sayi1+sayi2));
	        System.out.println("Sayilar Farki :" + (sayi1-sayi2));
	        
	        System.out.println("Sayilar Carpimi :" + (sayi1*sayi2));
	        System.out.println("Sayilar Bolumu :" + (sayi1/sayi2));
	 }
	 

	        Scanner input= new Scanner(System.in);
	        System.out.print("Bir sayiyi giriniz: ");
	        int sayi = input.nextInt();
	       
	        for(int i = 1; i <= 10; ++i)
	        {
	            System.out.printf("%d * %d = %d \n", sayi, i, sayi * i);
	        }
	        
		 Scanner input = new Scanner(System.in); 
	        System.out.print("Lütfen bir deðer giriniz: ");
	        String deðer= input.nextLine(); 
	        String tersdeðer=cevir(deðer);
	        System.out.println("Deðerin Tersi: " + tersdeðer);
	        int i;
	        i=0;
	        System.out.println("KARAKTER"+"   "+"INDEKSI");
	        for(i=0; i<=deðer.length()-1; i++)
	            System.out.println(deðer.charAt(i)+"            " +i);
	    }
	
     
	 public static String cevir(String yazi)
	    {
	        if (yazi.isEmpty())
	            return yazi;
	 
	        return cevir(yazi.substring(1)) + yazi.charAt(0);
	    	
	            
	      */
		 Scanner input= new Scanner(System.in);
	        System.out.println("Birinci rakamý giriniz: ");
	        int sayi1 = input.nextInt();
	     
	        
	        if(sayi1>10){
	        	
            System.out.println("Gecersiz Deðer : "+ sayi1); 
            System.out.println("Rakam Giriniz:");
           return ;
            
	        }else{ 
	        
	        for (int i=1; i<=100; i++) {
	        	if (i%sayi1==0 )
	        		System.out.print(i +" ");			 
	        }
	        
	        System.out.println("\nIkinci rakamý giriniz: ");
	        int sayi2 = input.nextInt();
	        for (int i=1; i<=100; i++) {
	        	if (i%sayi2==0 )
	        		System.out.print(i +" ");			 
	        }
	        System.out.println("Sayilar Carpýmý :" + (sayi1*sayi2));
	      }
	 } 
	 }

