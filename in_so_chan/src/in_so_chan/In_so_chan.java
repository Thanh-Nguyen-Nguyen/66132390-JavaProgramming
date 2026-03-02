package in_so_chan;
import java.util.Scanner;
public class In_so_chan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print("cac so chan tu 1 den " + n + " la: ");
		for(int i = 1; i <= n; i++) if(i % 2 == 0) System.out.print(i + " ");
		sc.close();
	}

}
