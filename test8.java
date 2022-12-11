import java.util.Scanner;

public class test8 {
	// Girilen sınav notuna göre Başarılı ve ya Başarısız dönütünü veren Java kodu:

	public static void main(String[] args) {
		Scanner giris = new Scanner(System.in);
		String sonuc;
		double not;
		System.out.print("Sınav notunu (0-100) arası giriniz:" );
		not = giris.nextDouble();
		sonuc = not>=50? "Başarılı" : "Başarısız";
		System.out.println("Sonuc: " + sonuc);
	}

}
