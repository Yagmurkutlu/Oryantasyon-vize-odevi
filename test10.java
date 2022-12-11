import java.util.Scanner;

public class test10 {

	public static void main(String[] args) {
		//Hesap makinesi görevi gören Java kodu:
		Scanner giris = new Scanner(System.in);
		
		System.out.print("1. Sayıyı giriniz:");
		int sayı1 =giris.nextInt();
		
		System.out.print("2.Sayıyı giriniz: ");
		int sayı2 = giris.nextInt();
		System.out.println("Yapmak istediğiniz işlemin önündeki rakamı giriniz: ");
		System.out.println("1. Toplama ");
		System.out.println("2. Çıkarma ");
		System.out.println("3. Çarpma: ");
		System.out.println("4. Bölme: ");
		
		int secim= giris.nextInt();
		switch(secim) {
		
		case 1:
			System.out.println("Toplama işleminin sonucu =" + (sayı1 + sayı2));
			break;
			
		case 2:
			System.out.println("Çıkarma işleminin sonucu =" + (sayı1 - sayı2));
			break;
			
		case 3:
			System.out.println("Çarpma işleminin sonucu =" + (sayı1*sayı2));
			break;
			
		case 4:
			System.out.println("Bölme işeminin sonucu =" + (sayı1/sayı2));
	}

	}

}
