package TKNH;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TaiKhoan tk1 = new TaiKhoan("001", "Nguyen Thanh Nguyen", 1000);
        tk1.guiTien(500);
        tk1.rutTien(300);
        System.out.println(tk1.hienThiThongTin());

        System.out.println("------");

        TaiKhoanTietKiem tk2 = new TaiKhoanTietKiem("002", "Tran Van A", 2000, 6, 0.05);
        tk2.rutTien(500); 
        System.out.println("Lãi: " + tk2.tinhLaiSuat());

        System.out.println("------");

        TaiKhoanThanhToan tk3 = new TaiKhoanThanhToan("003", "Le Van B", 3000, 1000, 10);
        tk3.rutTien(500);
        tk3.thanhToanHoaDon(200);
        System.out.println(tk3.hienThiThongTin());
	}

}
