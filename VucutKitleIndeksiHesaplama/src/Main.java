import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double boy, kilo, kitleIndeksi;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Lutfen boyunuzu (metre cinsinden) giriniz: ");
		boy = scanner.nextDouble();
		
		System.out.print("Lutfen kilonuzu giriniz: ");
		kilo = scanner.nextDouble();
		
		kitleIndeksi = kilo / (boy * boy);
		System.out.println("Vucut Kitle Indeksiniz: " + kitleIndeksi);

	}

}
