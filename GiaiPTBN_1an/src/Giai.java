import java.util.Scanner;
public class Giai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// PTBN1an co dang ax + b = 0;
		// khai bao lop scanner
		Scanner sc = new Scanner(System.in);
		float a, b;
		a = sc.nextFloat();
		b = sc.nextFloat();
		if(a == 0) System.out.println("Phuong trinh nay co vo so nghiem");
		else System.out.println("Phuong trinh co nghiem duy nhat x = -" + b + " \\ " + a + "= " + -(b/a));
	}

}
