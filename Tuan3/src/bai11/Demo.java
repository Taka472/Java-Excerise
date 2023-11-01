package bai11;

import java.time.LocalDate;

public class Demo {
	public static void main(String[] argv) {
		KhachHang a = new KhachHang("KH001", "Nguyễn Văn An", 0);
		a.ThemSoTietKiem("111", LocalDate.of(2023, 2, 1), 1000000, 3, 0.005f);
		a.ThemSoTietKiem("112", LocalDate.of(2022, 9, 10), 10000000, 6, 0.006f);
		System.out.println(a.toString());
	}
}
