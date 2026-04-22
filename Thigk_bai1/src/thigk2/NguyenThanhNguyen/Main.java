package thigk2.NguyenThanhNguyen;
import java.util.Scanner;
// cach giai: Tao class Hcn gom 4 thuoc tinh x1, x2, y1, x2; Constructor va cac phuong thuc getter, setter va toString
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double x1, y1, x2, y2;
		System.out.println("Nhap toan do goc tren trai :");
		System.out.print("x1 = ");
		x1 = sc.nextDouble();
		System.out.print("y1 = ");
		y1 = sc.nextDouble();
		System.out.println("Nhap toan do goc duoi phai :");
		System.out.print("x1 = ");
		x2 = sc.nextDouble();
		System.out.print("y2 = ");
		y2 = sc.nextDouble();
		Hcn Hcn1 = new Hcn(x1, y1, x2, y2);
		sc.close();
		double cv = Hcn1.CV();
		double dt = Hcn1.DT();
		System.out.println("chu vi hcn = " + cv);
		System.out.println("dien tich hcn = " + dt);
	}

}
