import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		int r, aci;
		double pi = 3.14;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Dairenin Yaricapini Giriniz: ");
		r = scanner.nextInt();
		
		System.out.print("Daire Diliminin Acisini Giriniz: ");
		aci = scanner.nextInt();
		
		double alan = (pi * (r * r) * aci) / 360;
		System.out.println("Daire Diliminin Alani: " + alan);
	}

}
