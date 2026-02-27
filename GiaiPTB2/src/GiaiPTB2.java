import java.util.Scanner;
public class GiaiPTB2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        if (a == 0) {
            // Phuong trinh bac 1 hoac vo nghiem
            if (b == 0) 
            {
                if (c == 0) 
                {
                    System.out.println("Phuong trinh vo so nghiem.");
                } 
                else 
                {
                    System.out.println("Phuong trinh vo nghiem.");
                }
            } 
            else 
            {
                double x = -c / b;
                System.out.println("Phuong trinh bac 1 co nghiem x = " + x);
            }
        } 
        else 
        {
            double delta = b * b - 4 * a * c;
            if (delta < 0) 
            {
                System.out.println("Phuong trinh vo nghiem.");
            } 
            else if (delta == 0) 
            {
                double x = -b / (2 * a);
                System.out.println("Phuong trinh co nghiem kep x1 = x2 = " + x);
            } 
            else 
            {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                System.out.println("Phuong trinh co 2 nghiem phan biet:");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
        }
        sc.close();
	}

}
