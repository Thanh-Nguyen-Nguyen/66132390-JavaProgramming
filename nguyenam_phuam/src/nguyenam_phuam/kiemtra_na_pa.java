package nguyenam_phuam;
import java.util.Scanner;
public class kiemtra_na_pa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		char s = sc.next().charAt(0);
		if (s == 'U' || s == 'u' || s == 'e' || s == 'E' || s == 'o' || s == 'O' || s == 'A' || s == 'a' || s == 'i' || s == 'I') System.out.println(s + " la nguyen am");
		else System.out.print(s + " la phu am");
		sc.close();
	}

}
