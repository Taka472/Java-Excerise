package bai9;

public class Demo {
	public static void main(String[] argv) {
		ToaDo p = new ToaDo("P", 5, 5);
		HinhTron a = new HinhTron(p, 10.5);
		System.out.println(a.toString());
	}
}
