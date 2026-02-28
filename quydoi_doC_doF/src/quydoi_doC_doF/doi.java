package quydoi_doC_doF;
import java.util.Scanner;
public class doi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inp = new Scanner(System.in);
		double doC = inp.nextDouble();
		System.out.println(doC + " do C " + "= " + ((doC * 1.8) + 32) + " do F");
		inp.close();
	}

}
