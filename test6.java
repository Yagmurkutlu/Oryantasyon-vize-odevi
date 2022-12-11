import java.util.Scanner;

public class test6 {
	//Girilen sayı kadar fibonnacci sayısını ekrana yazdıran Java kodu:

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		System.out.print("Kaç adet Fibonnacci sayısı görmek istiyorsanız? ");
		int sayı = giris.nextInt();
		int birinci = 0;
		int ikinci = 1;
		int ucuncu = birinci+ikinci;
		System.out.println("Fibonnacci Sayıları");
		System.out.print( ikinci+ " ");
		while(sayı>1) {
			System.out.print( ucuncu + " ");
			sayı--;
			birinci = ikinci;
			ikinci = ucuncu;
			ucuncu = birinci+ikinci;
		}
	}

}
