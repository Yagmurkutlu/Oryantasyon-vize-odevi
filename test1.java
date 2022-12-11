import java.util.Scanner;

public class test1 {
	public static void main(String[]args) {
		// Girilen sayının tek mi çift mi olduğunu gösteren java kodu:
		
        Scanner giris = new Scanner(System.in);
		int sayı;
		
		System.out.print("Lütfen bir tam sayı giriniz:");
	    sayı = giris.nextInt();
	    
	    if(sayı %2==0) {
	    	System.out.println( sayı + " sayısı çift sayıdır.");
	    		
	    }
	    
	    else {
	    	System.out.println( sayı + " sayısı tek sayıdır.");
	    }
	    
	}

}
