package bai6;

public class Demo {
	public static void main(String[] argv) {
		ThongTinDangKye xe1 = null, xe2 = null, xe3 = null;
		try {
			xe1 = new ThongTinDangKye("Nguyen Thu Loan", "Future Neo", 100, 35000000);
			xe2 = new ThongTinDangKye("Le Minh Tinh", "Ford Ranger", 3000, 250000000);
			xe3 = new ThongTinDangKye("Nguyen Minh Anh", "Landscape", 1500, 1000000000);
		} catch(Exception e) {
			e.printStackTrace();
		}
		System.out.print(xe1.toString() + "\n" + xe2.toString() + "\n" + xe3.toString());
	}
}
