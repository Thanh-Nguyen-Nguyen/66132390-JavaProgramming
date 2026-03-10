
public class TestCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Circle ht1 = new Circle(1.2, "blue");
		ht1.setColor("black");
		System.out.println("mau hien tai la mau " + ht1.getColor());
		ht1.setRadius(5.4);
		System.out.println("ban kinh hien tai la " + ht1.getRadius());
		System.out.println(ht1.ToString());
	}

}
