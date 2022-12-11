import java.util.Scanner;

public class test3 {

	public static void main(String[] args) {
		// Girilen 3 sayıdan en büyüğünü bulan Java kodu:
		Scanner giris = new Scanner(System.in);
		int sayı1;
		int sayı2;
		int sayı3;
		int enbuyuk;
		
		System.out.print("Lütfen 1. sayıyı giriniz:");
		sayı1 = giris.nextInt();
		System.out.print("Lütfen 2. sayıyı giriniz:");
		sayı2 = giris.nextInt();
		System.out.print("Lütfen 3. sayıyı giriniz:");
		sayı3 = giris.nextInt();
	    enbuyuk = sayı1;
		if(sayı2> enbuyuk) {
			enbuyuk = sayı2;
			
		}
		if(sayı3> enbuyuk) {
			enbuyuk = sayı3;
			
		}
		System.out.println("Girilen sayıların en büyüğü = " + enbuyuk);
	}

}
