package thigk2.NguyenThanhNguyen;
import java.util.ArrayList;
import java.util.Scanner;
/*
     * Ý tưởng:
     * 0. Tạo class OOP_QLSP với các phương thức và thuộc tính như đề, thêm 1 tt giá
     * 1. Tạo danh sách sản phẩm (ArrayList)
     * 2. Hard csode 3 sản phẩm và thêm vào danh sách
     * 3. In danh sách sản phẩm
     * 4. Nhập thêm 1 sản phẩm từ bàn phím và thêm vào danh sách
     * 5. Lọc và in ra các sản phẩm có loại "thực phẩm chức năng"
*/
public class Main {
    public static void main(String[] args) {
    //b1
    ArrayList<OOP_QLSP> danhSach = new ArrayList<OOP_QLSP>();
    // Hard code 3 sản phẩm
    danhSach.add(new OOP_QLSP("SP01", "Vitamin C", "thực phẩm chức năng", 150000));
    danhSach.add(new OOP_QLSP("SP02", "Sữa tươi", "đồ uống", 30000));
    danhSach.add(new OOP_QLSP("SP03", "Omega 3", "thực phẩm chức năng", 200000));
    System.out.println("Danh sách sản phẩm:");
    for (OOP_QLSP sp : danhSach) {
        System.out.println(sp);
    }
    // b2
    // Nhập thêm 1 sản phẩm
    Scanner sc = new Scanner(System.in);
    System.out.println("\nNhập sản phẩm mới:");
    System.out.print("Mã SP: ");
    String ma = sc.nextLine();
    System.out.print("Tên SP: ");
    String ten = sc.nextLine();
    System.out.print("Loại SP: ");
    String loai = sc.nextLine();
    System.out.print("Giá: ");
    double gia = Double.parseDouble(sc.nextLine());
    OOP_QLSP spMoi = new OOP_QLSP(ma, ten, loai, gia);
    danhSach.add(spMoi);
    // b3
    System.out.println("\nDanh sách sau khi thêm:");
    for (OOP_QLSP sp : danhSach) {
        System.out.println(sp);
    }
    // b4
    System.out.println("\nSản phẩm thuộc loại 'thực phẩm chức năng':");
    for (OOP_QLSP sp : danhSach) {
        if (sp.getLoaiSP().equalsIgnoreCase("thực phẩm chức năng")) {
            System.out.println(sp);
        }
    }
    }
}
