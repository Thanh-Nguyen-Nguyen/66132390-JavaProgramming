package tinh_giai_thua;
import java.util.Scanner;
public class hamtinhgt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int fact = 1;
		for(int i = 2; i <= n; i++) fact *= i;
		System.out.println(n + "! = " + fact);
		sc.close();
	}

}
