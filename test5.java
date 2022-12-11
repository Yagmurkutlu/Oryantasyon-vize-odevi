import java.util.Scanner;

public class test5 {
	//Girilen sayının basamak sayısını bulan java kodu:

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		int sayac =0;
		System.out.print("Bir sayı giriniz:");
		int sayı = giris.nextInt();
		while(sayı>0) {
			sayı=sayı/10;
			sayac++;
			
		}
System.out.println("Girdiğiniz sayının basamak sayısı:" + sayac);
	}

}
