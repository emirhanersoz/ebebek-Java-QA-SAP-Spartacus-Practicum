import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double tutar, kdvOran = 0.18, kdvTutar, kdvliTutar;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Ucret Tutarini Giriniz: ");
		tutar = input.nextDouble();
		
		if(tutar > 0 && tutar < 1000) {
			kdvOran = 0.18;
		}

		
		else if(tutar > 1000) {
			kdvOran = 0.08;
		}
		
		kdvTutar = tutar * kdvOran;
		kdvliTutar = tutar + kdvTutar;
		
		System.out.println("KDV'siz Fiyat = " + tutar);
		System.out.println("KDV Orani = " + kdvOran);
		System.out.println("KDV Tutari = " + (kdvliTutar - tutar));
		System.out.println("KDV'li Fiyat = " + kdvliTutar);
	}

}
