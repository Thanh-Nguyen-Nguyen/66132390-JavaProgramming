public class Main {
    public static void main(String[] args) {
        NhanVien nv = new NhanVien("NV01", "Nguyen Van A", 5000000, 4);
        nv.setHeSoLuong(2);;
        System.out.println("Ma NV: " + nv.getMaNV());
        System.out.println("Ho ten: " + nv.getHoTen());
        System.out.println("Luong: " + nv.tinhLuong());
        System.out.println("Xep loai: " + nv.xepLoai());
    }
}