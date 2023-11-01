package bai10;

public class Demo {
	public static void main(String[] argv) {
		SinhVien a = new SinhVien("123", "Nguyễn Văn A");
		SinhVien b = new SinhVien("543", "Lê Thị B");
		SinhVien c = new SinhVien("321", "Lương Văn C");
		SinhVien[] ds = new SinhVien[3];
		ds[0] = a; ds[1] = b; ds[2] = c;
		LopHocPhan lop = new LopHocPhan("123456", "LT Hướng đối tượng", "Cô Hà", "Thứ 7, tiết 4-6, phòng A1.1", ds);
		System.out.println(lop.toString());
	}
}
