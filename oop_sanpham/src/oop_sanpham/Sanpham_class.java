package oop_sanpham;

public class Sanpham_class {
	String tensp;
	int soluong;
	double gia;
	double tinhtien()
	{
		if(tensp.equals("banh")) 
			gia = 5000.0;
		if(tensp.equals("keo")) 	
			gia = 3000.0;
		if(tensp.equals("nuocngot")) 
			gia = 10000.0;
		return gia * soluong;
	}
	void inhoadon()
	{
		System.out.println("ban vua mua " + tensp + " voi so luong la " + soluong);
		System.out.println("don gia: " + tinhtien());
	}
}
