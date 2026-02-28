package oop_qlsv;
import java.util.Scanner;
public class oop_qlsv_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		Sinhvien sv1 = new Sinhvien();
		sv1.hoten = in.next();
		sv1.mssv = in.next();
		sv1.diem_toan = in.nextDouble();
		sv1.diem_van = in.nextDouble();
		sv1.diem_anh = in.nextDouble();
		sv1.in_thong_tin();
		sv1.in_xep_loai();
		in.close();
	}

}
