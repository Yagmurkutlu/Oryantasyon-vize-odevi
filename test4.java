import java.util.Scanner;

public class test4 {
	//Girilen sayının faktoriyelini hesaplayan Java kodu:

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		int faktoriyel = 1;
		int sayı;
		System.out.print("Bir sayı giriniz:");
		sayı = giris.nextInt();
		for(int i =1; i<=sayı; i++) {
			faktoriyel = faktoriyel*i;
			
		}
		
		System.out.println( sayı + "!=" + faktoriyel);
		}

}
