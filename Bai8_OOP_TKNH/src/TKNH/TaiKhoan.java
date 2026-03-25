package TKNH;

public class TaiKhoan {
	private String soTaiKhoan, tenChuTaiKhoan;
	private double soDu;
	public TaiKhoan(String soTaiKhoan, String tenChuTaiKhoan, double soDu)
	{
		this.soTaiKhoan = soTaiKhoan;
		this.tenChuTaiKhoan = tenChuTaiKhoan;
		this.soDu = soDu;
	}
	public void guiTien(double tienGui)
	{
		this.soDu += tienGui;
	}
	public void rutTien(double tienRut)
	{
		if(tienRut <= soDu)
		{
			soDu -= tienRut;
		}
	}
	public String hienThiThongTin()
	{
		String res = "tai khoan " + soTaiKhoan
					+ " chu so huu la " + tenChuTaiKhoan
					+ "\n So du hien tai " + soDu;
		return res;
	}
}
