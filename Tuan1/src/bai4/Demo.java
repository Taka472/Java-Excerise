package bai4;

import java.util.Scanner;

public class Demo {
	static Scanner sc = new Scanner(System.in);
	
	public static String Input(String input) {
		System.out.print(input + ": ");
		return sc.nextLine();
	}
	
	public static void main(String[] argv) {
		DiemSinhVien sv1 = null, sv2 = null, sv3 = null;
		try {
			sv1 = new DiemSinhVien(11111, "Nguyen Thanh An", 6.5, 8.5);
			sv2 = new DiemSinhVien(22222, "Le Thi Bong", 7.5, 8);
			int ma = Integer.parseInt(Input("Nhap ma"));
			String name = Input("Nhap ten");
			double LT = Double.parseDouble(Input("Nhap diem LT")), TH = Double.parseDouble(Input("Nhap diem TH"));
			sv3 = new DiemSinhVien(ma, name, LT, TH);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println(sv1);
		System.out.println(sv2);
		System.out.println(sv3);
	}
}
