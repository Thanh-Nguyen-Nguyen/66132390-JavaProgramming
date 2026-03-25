package TKNH;

public class TaiKhoan {
	private String soTaiKhoan, tenChuTaiKhoan;
	private double soDu;
	public TaiKhoan(String soTaiKhoan, String tenChuTaiKhoan, double soDu)
	{
		super();
		this.soTaiKhoan = soTaiKhoan;
		this.tenChuTaiKhoan = tenChuTaiKhoan;
		this.soDu = soDu;
	}
	public TaiKhoan()
	{
		super();
	}
	public String getsoTaiKhoan()
	{
		return this.soTaiKhoan;
	}
	public String gettenChuTaiKhoan()
	{
		return this.tenChuTaiKhoan;
	}
	public double getsoDu()
	{
		return this.soDu;
	}
	public void setsoTaiKhoan(String stkmoi)
	{
		this.soTaiKhoan = stkmoi;
	}
	public void settenChuTaiKhoan(String tenChutkmoi)
	{
		this.tenChuTaiKhoan = tenChutkmoi;
	}
	public void guiTien(double tienGui)
	{
		this.soDu += tienGui;
	}
	public void setsoDu(double sdm)
	{
		this.soDu = sdm;
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
