package thigk2.NguyenThanhNguyen;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		/* Ý tưởng: 
		 * Tạo file vb.txt
		 * duyệt file, nếu gặp số == X thì break và in ra màn hình "có", ngược lại in ra "không"
		 */
		double X = 7;
		double so;
		int ok = 0;
		FileInputStream f1 = new FileInputStream("vb.txt");
		BufferedReader br = new BufferedReader(new InputStreamReader(f1));
		String line;
        while ((line = br.readLine()) != null) {
            so = Double.parseDouble(line);
            System.out.println(so);
            if(so == X) ok = 1;
        }
        if(ok == 1) System.out.println(X + " nam trong file");
        else System.out.println(X + " khong nam trong file");
	}	

}
