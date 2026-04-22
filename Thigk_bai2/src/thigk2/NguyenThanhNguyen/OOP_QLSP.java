package thigk2.NguyenThanhNguyen;

public class OOP_QLSP {
	private String maSP;
    private String tenSP;
    private String loaiSP;
    private double gia;
    public OOP_QLSP()
    {
    	
    }
    public OOP_QLSP(String maSP, String tenSP, String loaiSP, double gia) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.loaiSP = loaiSP;
        this.gia = gia;
    }
    // Getter & Setter
    public String getMaSP() {
        return maSP;
    }
    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }
    public String getTenSP() {
        return tenSP;
    }
    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }
    public String getLoaiSP() {
        return loaiSP;
    }
    public void setLoaiSP(String loaiSP) {
        this.loaiSP = loaiSP;
    }
    public double getGia() {
        return gia;
    }
    public void setGia(double gia) {
        this.gia = gia;
    }
    @Override
    public String toString() {
        return "Ma SP: " + maSP +
               ", Ten SP: " + tenSP +
               ", Loai SP: " + loaiSP +
               ", Gia: " + gia;
    }
}
