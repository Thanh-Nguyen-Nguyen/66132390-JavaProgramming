package ghi_file_coban;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
public class ghivaofile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		try
		{
			FileWriter fw = new FileWriter("test.txt", true);
			fw.write(s + "\n");
			fw.close();
		}
		catch (Exception e)
		{
			System.out.println("nhap file that bai, thu lai sau!");
		}
		sc.close();
	}

}
