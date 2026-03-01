package in_so_dao_nguoc;
import java.util.Scanner;
public class In_sdn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp = new Scanner(System.in);
		int n = inp.nextInt();
		int tmp = 0;
		System.out.print("so " + n + " sau khi dao nguoc la ");
		while(n != 0)
		{
			tmp = tmp * 10 + n % 10;
			n /= 10;
		}
		System.out.println(tmp);
		inp.close();
	}

}
