package TKNH;

public class TaiKhoanTietKiem extends TaiKhoan{
	private int kyHan;
	private double laiSuat;
	public TaiKhoanTietKiem(String soTaiKhoan, String tenChuTaiKhoan, double soDu, int kyHan, double laiSuat)
	{
		super(soTaiKhoan, tenChuTaiKhoan, soDu);
		this.kyHan = kyHan;
		this.laiSuat = laiSuat;
	}
	public double tinhLaiSuat()
	{
		return super.getsoDu() * laiSuat;
	}
	@Override
	public void rutTien(double tienRut)
	{
		System.out.println("Không được rút trước kỳ hạn!");
	}
}
