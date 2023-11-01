package Bai12;

import java.util.Scanner;

public class Demo {
	static Scanner sc = new Scanner(System.in);
	static Scanner sc2 = new Scanner(System.in);
	static CDList list;
	
	public static int Menu() {
		System.out.println("1. Khởi tạo\n2. Thêm CD\n3. Xuất\n4. Tính số lượng CD\n5. Xóa CD theo mã\n6. Tổng giá\n7. Tìm\n8. Sắp xếp theo giá\n9. Sắp xếp theo tên\n10. Exit");
		System.out.print("Lựa chọn: ");
		return sc.nextInt();
	}
	
	public static void main(String[] argv) {
		boolean LoopBreak = false;
		while (true) {
			switch (Demo.Menu()) {
				case 1: {
					System.out.print("Nhập số lượng tối đa: ");
					list = new CDList(sc.nextInt());
					break;
				}
				
				case 2: {
					System.out.print("Nhập mã ID: ");
					int i = sc.nextInt();
					System.out.print("Nhập tên CD: ");
					String s = "";
					s += sc2.nextLine();
					sc.nextLine();
					System.out.print("Nhập số lượng bài hát: ");
					int j = sc.nextInt();
					System.out.print("Nhập giá: ");
					int k = sc.nextInt();
					try {
						if (!list.AddCD(new CD(i, s, j, k)))
							System.out.println("Không thành công");
					} catch (Exception e) {
						e.printStackTrace();
					}
					break;
				}
				
				case 3: {
					System.out.println(list.toString());
					break;
				}
				
				case 4: {
					System.out.println("Tổng số lượng CD: " + list.Length());
					break;
				}
				
				case 5: {
					System.out.print("Nhập ID: ");
					int i = sc.nextInt();
					if (list.Delete(i)) list.toString();
					else System.out.println("Không tìm thấy");
					break;
				}
				
				case 6: {
					System.out.println("Tổng giá: " + list.Sum());
					break;
				}
				
				case 7: {
					System.out.print("Nhập ID: ");
					int i = sc.nextInt();
					if (list.Search(i) != -1) System.out.println("Tìm thấy ở vị trí " + i);
					else System.out.println("Không tìm thấy");
					break;
				}
				
				case 8: {
					list.SortByPrice();
					System.out.println(list.toString());
					break;
				}
				
				case 9: {
					list.SortByName();
					System.out.println(list.toString());
					break;
				}
				
				case 10: {
					LoopBreak = true;
					break;
				}
			}
		if (LoopBreak) break;
		}
	}
}