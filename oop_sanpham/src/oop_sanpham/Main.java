package oop_sanpham;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Sanpham_class sp = new Sanpham_class();
		System.out.print("Moi nhap san pham ban muon mua: ");
		sp.tensp = sc.next();
		System.out.print("Moi nhap so luong: ");
		sp.soluong = sc.nextInt();
		sp.inhoadon();
		sc.close();
	}

}
