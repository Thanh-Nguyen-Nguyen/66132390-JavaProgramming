package OOP_HinhHoc;

public class Main {
    public static void main(String[] args) {
        HinhHoc h1 = new HinhChuNhat("HCN", "Do", 5, 3);
        HinhHoc h2 = new HinhTron("Tron", "Xanh", 2);
        HinhTamGiac h3 = new HinhTamGiac("Tam giac", "Vang", 3, 4, 5);

        System.out.println("=== HCN ===");
        h1.hienThiThongTin();
        System.out.println(h1.tinhDienTich());
        System.out.println(h1.tinhChuVi());

        System.out.println("\n=== Hinh Tron ===");
        h2.hienThiThongTin();
        System.out.println(h2.tinhDienTich());
        System.out.println(h2.tinhChuVi());

        System.out.println("\n=== Tam Giac ===");
        h3.hienThiThongTin();
        if (h3.kiemTraHopLe()) {
            System.out.println(h3.tinhDienTich());
            System.out.println(h3.tinhChuVi());
        } else {
            System.out.println("Khong hop le");
        }
    }
}