package kt_snt;

import java.util.Scanner;

public class Kiemtrasnt {
	public static boolean KTSNT(int x)
	{
		if(x < 2) return false;
		for (int i = 2; i < x; i++) if(x % i == 0) return false;
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(KTSNT(n)) System.out.println(n + " la so nguyen to");
		else System.out.println(n + " khong phai so nguyen to");
		sc.close();
	}

}
