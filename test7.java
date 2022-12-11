import java.util.Scanner;

public class test7 {
	//Dikdörtgenin alanını ve çevresini hesaplayan Java kodu

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		int kenar1, kenar2, alan, cevre;
		
		System.out.print("1. kenar uzunluğunu giriniz: ");
		kenar1 = giris.nextInt();
		
		System.out.print("2. kenar uzunluğunu giriniz: ");
		kenar2 = giris.nextInt();
		
		alan = kenar1*kenar2;
		cevre = (kenar1 + kenar2)*2;
		
		System.out.println("Dikdörtgenin alanı: " + alan);
		System.out.println("Dikdörtgenin çevresi: " + cevre);
		
				

	}

}
