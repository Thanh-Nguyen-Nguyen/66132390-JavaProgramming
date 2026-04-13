package abc;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("test.txt");
		InputStreamReader isr = new InputStreamReader(fis);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Nhap vao 1 chuoi");
		String s = br.readLine();
		System.out.print(s);
	}

}
