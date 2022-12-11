import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c, u, cevre;
		double alan;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("1.Kenari Giriniz: ");
		a = scanner.nextInt();
		
		System.out.print("2.Kenari Giriniz: ");
		b = scanner.nextInt();
		
		System.out.print("3.Kenari Giriniz: ");
		c = scanner.nextInt();
		
		u = (a + b + c) / 2;
		cevre = 2 * u;
		alan = Math.sqrt(u * (u-a) * (u-b) * (u-c));
		
		System.out.print("Ucgenin Alani = " + alan);
	}
}
