package in_hcn;
import java.util.Scanner;
public class In_hcn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt(); // chieu dai
		int n = sc.nextInt(); // chieu rong
		for(int i =  1; i <= m; ++i) 
		{
			for(int j = 1; j <= n; ++j) System.out.print("*");
			System.out.print("\n");
		}
		sc.close();
	}

}
