package TKNH;

public class TaiKhoanThanhToan extends TaiKhoan{
	private double hanMucRut, phiGiaodich;
	public TaiKhoanThanhToan(String soTaiKhoan, String tenChuTaiKhoan, double soDu, double hanMucRut, double phiGiaoDich)
	{
		super(soTaiKhoan, tenChuTaiKhoan, soDu);
		this.hanMucRut = hanMucRut;
		this.phiGiaodich = phiGiaoDich;
	}
	@Override
	public void rutTien(double tienRut)
	{
		if(tienRut <= hanMucRut && tienRut + phiGiaodich <= super.getsoDu())
		{
			super.setsoDu(super.getsoDu() - tienRut - phiGiaodich);
		}
	}
	public void thanhToanHoaDon(double soTien) {
        if (soTien + phiGiaodich <= super.getsoDu()) {
            super.setsoDu(super.getsoDu() - soTien - phiGiaodich);
            System.out.println("Thanh toán thành công!");
        } else {
            System.out.println("Không đủ tiền để thanh toán!");
        }
    }
}
