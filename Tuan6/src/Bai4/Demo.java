package Bai4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Demo {
	public static void Menu() {
		System.out.print("\n1. Init\n2. Them\n3. Tinh tong tien SGK\n4. Tinh tong tien STK\n5. Tim SGK theo NXB\n6. Tim thanh tien cao nhat\n7. Xuat\n8. Exit\nChoice: ");
	}
	
	public static void main(String[] argv) {
		DanhSachSach list = null;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		boolean loopBreak = false;
		while (!loopBreak) {
			Menu();
			switch (sc.nextInt()) {
				case 1: {
					System.out.print("Nhap so luong toi da: ");
					list = new DanhSachSach(sc.nextInt());
					break;
				}
				
				case 2: {
					sc.nextLine();
					boolean isSGK = false;
					DateTimeFormatter dmf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
					System.out.print("Nhap ma: "); String ma = sc.nextLine();
					System.out.print("Nhap ngay thang (dd/MM/yyyy): "); LocalDate date = LocalDate.parse(sc.nextLine(), dmf);
					System.out.print("Nhap don gia: "); double price = sc.nextDouble();
					System.out.print("Nhap so luong: "); int amount = sc.nextInt();
					sc.nextLine();
					System.out.print("Nhap nha xuat ban: "); String nxb = sc.nextLine();
					System.out.print("Loai sach (SGK or STK): ");
					boolean tinhTrang = false;
					double thue = 0.0;
					if (sc.nextLine().equalsIgnoreCase("SGK")) {
						System.out.print("Tinh trang on (True or False): "); tinhTrang = Boolean.parseBoolean(sc.nextLine());
						isSGK = true;
					}
					else {
						System.out.print("Nhap thue: "); thue = sc.nextDouble();
					}
					if (isSGK)
						list.themSach(new SachGiaoKhoa(ma, date, price, amount, nxb, tinhTrang));
					else list.themSach(new SachThamKhao(ma, date, price, amount, nxb, thue));
					break;
				}
				
				case 3: {
					System.out.println(list.tinhTongThanhTienSGK());
					break;
				}
				
				case 4: {
					System.out.println(list.tinhTongThanhTienSTK());
					break;
				}
				
				case 5: {
					sc.nextLine();
					System.out.print("Nhap nha xuat ban: "); String key = sc.nextLine();
					ArrayList<Sach> result = list.timSachGiaoKhoaTheoNXB(key);
					for (int i = 0; i < result.size(); i++) {
						System.out.print(result.get(i).toString());
					}
					break;
				}
				
				case 6: {
					System.out.println(list.timThanhTienCaoNhat());
					break;
				}
				
				case 7: {
					System.out.println(list.toString());
					break;
				}
				
				case 8: {
					loopBreak = true;
					break;
				}
			}
		}
	}
}
