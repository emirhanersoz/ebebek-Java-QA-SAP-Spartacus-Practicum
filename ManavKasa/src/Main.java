import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double armutFiyat = 2.14, elmaFiyat = 3.67, domatesFiyat = 1.11, muzFiyat = 0.95, patlicanFiyat = 5.0, tutar;
		double armutKilo, elmaKilo, domatesKilo, muzKilo, patlicanKilo;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Armut Kac Kilo ? : ");
		armutKilo = scanner.nextDouble();
		
		System.out.print("Elma Kac Kilo ? : ");
		elmaKilo = scanner.nextDouble();

		System.out.print("Domates Kac Kilo ? : ");
		domatesKilo = scanner.nextDouble();
		
		System.out.print("Muz Kac Kilo ? : ");
		muzKilo = scanner.nextDouble();
		
		System.out.print("Patlican Kac Kilo ? : ");
		patlicanKilo = scanner.nextDouble();
		
		tutar = armutFiyat * armutKilo + elmaFiyat * elmaKilo + domatesFiyat * domatesKilo + muzFiyat * muzKilo + patlicanFiyat * patlicanKilo;
		System.out.print("Toplam Tutar: " + tutar);
	}

}
