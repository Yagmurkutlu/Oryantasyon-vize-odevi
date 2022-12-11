import java.util.Scanner;

public class test9 {
public static void main(String[] args) {
	//Girilen Boy ve Kilo değerine göre BKİ hesaplayan Java kodu:
	Scanner giris = new Scanner(System.in);
	System.out.print("Boyunuzu giriniz (m,cm): ");
	float boy = giris.nextFloat();
	System.out.print("Kilonuzu giriniz: ");
	float kilo = giris.nextFloat();
	float bki = kilo/(boy*boy);
	System.out.println("Beden Kitle İndeksiniz =" + bki);
	if(bki<18) {
		System.out.println("Zayıf");
		
	}
	
	else if(bki<30) {
		System.out.println("Hafif Şişman");
		
	}
	else if(bki<35) {
		System.out.println("Şişman");
	}
	else {
		System.out.println("Obez");
		
	}
}
}
