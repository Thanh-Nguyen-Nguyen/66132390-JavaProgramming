package nhap_file_coban;
import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
public class Nhaptufile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
            BufferedReader br = new BufferedReader(new FileReader("test1.txt"));
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
        } catch (IOException e) {
            System.out.println("Loi doc file: " + e.getMessage());
        }
	}

}
