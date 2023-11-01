package bai7;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Demo {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] argv) {
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		HangThucPham t1 = null, t2 = null, t3 = null;
		try {
			t1 = new HangThucPham("001", "Gao", 100000, LocalDate.of(2023, 07, 10), LocalDate.of(2017, 12, 15));
			t2 = new HangThucPham("002", "Mi", 5000, LocalDate.of(2023, 3, 1), LocalDate.of(2024, 9, 1));
			t3 = new HangThucPham("003", "Nuoc", 10000, LocalDate.parse("01/03/2023",fmt), LocalDate.of(2024, 3, 1));
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Ma Hang		Ten Hang	Gia			Ngay SX			Ngay HH			Ghi chu");
		System.out.print(t1.toString() + "\n" + t2.toString() + "\n" + t3.toString());
	}
}
