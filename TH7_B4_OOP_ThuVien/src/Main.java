public class Main {
    public static void main(String[] args) {
        Sach s1 = new Sach("S01", "Lap trinh Java", "Nguyen Van A", 1999);
        s1.tostring();
        s1.muonSach();
        s1.muonSach();
        s1.traSach();
        if (s1.kiemTraSachCu()) {
            System.out.println("Day la sach cu.");
        } else {
            System.out.println("Day la sach moi.");
        }
    }
}