import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		HinhTron tron = new HinhTron();
		tron.bankinh = sc.nextDouble();
		double cv = tron.chuviHT(tron.bankinh), dt = tron.dientichHT(tron.bankinh);
		System.out.println("Chu vi hinh tron la " + cv);
		System.out.println("Dien tich hinh tron la " + dt);
		sc.close();
	}

}
