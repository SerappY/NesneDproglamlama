package AlanHacim;
import java.util.Scanner;
/* System.out.println sisteme parantez i�indeki ifadeyi yazd�r�r.
  scanner fonksiyonunu kullanmam�z�n nedeni girilen de�erin say� oldu�unu belirtmek 
kullan�c� say� hari� bir de�er girdi�inde program hata vericektir.��nk� girilen de�er say�,rakam  cinsinde olmal�d�r. 	
 *kullan�c�dan bir yar��ap� de�eri girmesini istiyoruz.
 * yar��ap de�erinin  double �eklinde olmas�n� istiyoruz ��nk� virg�ll� 
 ondal�kl� say�lar�n kullan�m� i�in double kullan�l�r.
 kullan�c�dan bir yukseklik de�eri girmesini istiyoruz.
 yukseklik de�erinin double �eklinde olmas�n� istiyoruz ��nk� virg�ll� 
ondal�kl� say�lar�n kullan�m� i�in double kullan�l�r. 
pi de�erini soruda istenildi�i gibi 3,14 ald�k
hac�m de�erini hesapl�yoruz. hesaplanan hac�m de�erini ekrana yazd�r�yoruz.
hesaplanan alan de�erini hesapl�yoruz.
�K�NC� KISIMDA 
bu sefer kullan�c�dan de�er istemek  yer�ne biz de�er at�yoruz.daha sonra
hacim de�erini hesapl�yoruz.hesaplanan hacim de�erini ekrana yazd�r�yoruz.
alan de�erini hesapl�yoruz.hesaplanan alan de�erini ekrana yazd�r�yoruz.
		
	
 */

public class AlanHacim {
	public static void main(String[] args) {
		
		System.out.println("S�l�nd�r Hac�m ve Alan Hesaplamas�");
		 Scanner reader = new Scanner(System.in);
		 
	System.out.print("Yar�cap� G�r�n�z: "); 
	double yar�cap = reader.nextInt();  
	System.out.print("Yuksekl�g� G�r�n�z: ");
	double yuksekl�k= reader.nextInt();
	double pi =3.14; 
double hac�m=pi*yar�cap*yar�cap*yuksekl�k; 

System.out.println("Toplam Hac�m: "+ hac�m);  


double alan =(2*pi*yar�cap*yar�cap)+2*pi*yar�cap*yuksekl�k; 

System.out.print("Toplam Alan: "+ alan); 
/*
		System.out.println("S�l�nd�r Hac�m ve Alan Hesaplamas�");
		
		double yuksekl�k = 6 , pi = 3.14, yar�cap = 4;
		double hac�m=pi*yar�cap*yar�cap*yuksekl�k; 
		System.out.println("Toplam Hac�m: "+ hac�m);
		
		double alan =(2*pi*yar�cap*yar�cap)+2*pi*yar�cap*yuksekl�k; 

		System.out.print("Toplam Alan: "+ alan);
		
		*/		
}	
}


