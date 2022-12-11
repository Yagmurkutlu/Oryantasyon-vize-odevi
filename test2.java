package ornek2;

import java.util.Scanner;

public class test2 {
	// Sınav notlarının ortalamasını hesaplayan Java kodu:

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		
		double sayı1;
		double sayı2;
	
		System.out.print(" lütfen 1.Sınav notunu girin:");
		sayı1 = giris.nextDouble();
		
		System.out.print(" lütfen 2.Sınav notunu giriniz:");
		sayı2 = giris.nextDouble();
		
		double ortalama = (sayı1 + sayı2)/2;
		System.out.println(ortalama);
		
		
	}

}
