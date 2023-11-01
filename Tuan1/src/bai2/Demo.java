package bai2;

public class Demo {
	public static void main(String[] argv) {
		Point a = new Point("A", 4, 7);
		System.out.println("-a = " + a.negate().toString());
		System.out.println("distance = " + a.getDistance());
	}
}
