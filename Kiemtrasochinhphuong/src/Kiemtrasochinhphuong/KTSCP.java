package Kiemtrasochinhphuong;
import java.util.Scanner;
public class KTSCP {
	public static boolean kiemtra(int x)
	{
		int a = (int)Math.sqrt(x);
		if(a * a == x) return true;
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(kiemtra(n)) System.out.println(n + " la so chinh phuong");
		else System.out.println(n + " khong la so chinh phuong");
		sc.close();
	}

}
