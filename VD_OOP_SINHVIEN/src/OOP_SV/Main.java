package OOP_SV;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(SinhVien.TEN_TRUONG);
		SinhVien.sayHi();
		System.out.println();
		SinhVien sv1 = new SinhVien("Nguyen Thanh Nguyen", "CNTT3");
		SinhVien sv2 = new SinhVien("Le Van A", "CNTT36");
		sv1.sayHello();
		sv2.sayHello();
	}

}
