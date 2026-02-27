import java.util.Scanner;
public class mimx3so {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// khai bao lop Scanner
		Scanner sc = new Scanner(System.in);
		// nhap 3 so a, b, c
		int a, b, c;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		int nhonhat = a, lonnhat = a;
		// tim so nho nhat
		if(nhonhat > b) nhonhat = b;
		if(nhonhat > c) nhonhat = c;
		// tim so lon nhat
		if(lonnhat < b) lonnhat = b;
		if(lonnhat < c) lonnhat = c;
		System.out.println("So lon nhat trong 3 so: " + a + " " + b + " " + c + " la " + lonnhat);
		System.out.println("So nho nhat trong 3 so: " + a + " " + b + " " + c + " la " + nhonhat);
		sc.close();
	}

}
