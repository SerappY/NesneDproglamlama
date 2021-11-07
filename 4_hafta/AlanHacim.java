package AlanHacim;
import java.util.Scanner;
/* System.out.println sisteme parantez içindeki ifadeyi yazdýrýr.
  scanner fonksiyonunu kullanmamýzýn nedeni girilen deðerin sayý olduðunu belirtmek 
kullanýcý sayý hariç bir deðer girdiðinde program hata vericektir.Çünkü girilen deðer sayý,rakam  cinsinde olmalýdýr. 	
 *kullanýcýdan bir yarýçapý deðeri girmesini istiyoruz.
 * yarýçap deðerinin  double þeklinde olmasýný istiyoruz çünkü virgüllü 
 ondalýklý sayýlarýn kullanýmý için double kullanýlýr.
 kullanýcýdan bir yukseklik deðeri girmesini istiyoruz.
 yukseklik deðerinin double þeklinde olmasýný istiyoruz çünkü virgüllü 
ondalýklý sayýlarýn kullanýmý için double kullanýlýr. 
pi deðerini soruda istenildiði gibi 3,14 aldýk
hacým deðerini hesaplýyoruz. hesaplanan hacým deðerini ekrana yazdýrýyoruz.
hesaplanan alan deðerini hesaplýyoruz.
ÝKÝNCÝ KISIMDA 
bu sefer kullanýcýdan deðer istemek  yerýne biz deðer atýyoruz.daha sonra
hacim deðerini hesaplýyoruz.hesaplanan hacim deðerini ekrana yazdýrýyoruz.
alan deðerini hesaplýyoruz.hesaplanan alan deðerini ekrana yazdýrýyoruz.
		
	
 */

public class AlanHacim {
	public static void main(String[] args) {
		
		System.out.println("Sýlýndýr Hacým ve Alan Hesaplamasý");
		 Scanner reader = new Scanner(System.in);
		 
	System.out.print("Yarýcapý Gýrýnýz: "); 
	double yarýcap = reader.nextInt();  
	System.out.print("Yukseklýgý Gýrýnýz: ");
	double yukseklýk= reader.nextInt();
	double pi =3.14; 
double hacým=pi*yarýcap*yarýcap*yukseklýk; 

System.out.println("Toplam Hacým: "+ hacým);  


double alan =(2*pi*yarýcap*yarýcap)+2*pi*yarýcap*yukseklýk; 

System.out.print("Toplam Alan: "+ alan); 
/*
		System.out.println("Sýlýndýr Hacým ve Alan Hesaplamasý");
		
		double yukseklýk = 6 , pi = 3.14, yarýcap = 4;
		double hacým=pi*yarýcap*yarýcap*yukseklýk; 
		System.out.println("Toplam Hacým: "+ hacým);
		
		double alan =(2*pi*yarýcap*yarýcap)+2*pi*yarýcap*yukseklýk; 

		System.out.print("Toplam Alan: "+ alan);
		
		*/		
}	
}


