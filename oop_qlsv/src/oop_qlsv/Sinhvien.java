package oop_qlsv;

public class Sinhvien {
	String hoten, mssv;
	double diem_toan, diem_van, diem_anh;
	void in_thong_tin()
	{
		System.out.println("sinh vien " + hoten + " co mssv la " + mssv);
		System.out.println("diem toan: " + diem_toan);
		System.out.println("diem van: " + diem_van);
		System.out.println("diem anh: " + diem_anh);
	}
	void in_xep_loai()
	{
		double dtb = (diem_toan + diem_van + diem_anh) / 3;
		System.out.print("sinh vien " + hoten + " xep loai ");
		if(dtb < 2) System.out.print("Yeu");
		else if(dtb < 5) System.out.print("Trung binh");
		else if(dtb < 8) System.out.print("Kha");
		else if(dtb < 9) System.out.print("Gioi");
		else System.out.print("Xuat sac");
	}
}
