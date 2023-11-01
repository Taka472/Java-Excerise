package bai10;

public class LopHocPhan {
	private String maLHP;
	private String tenLHP;
	private String tenGV;
	private String thongTinLHP;
	private SinhVien[] dsSV;
	
	public String getMaLHP() {
		return maLHP;
	}
	public void setMaLHP(String maLHP) {
		this.maLHP = maLHP;
	}
	public String getTenLHP() {
		return tenLHP;
	}
	public void setTenLHP(String tenLHP) {
		this.tenLHP = tenLHP;
	}
	public String getTenGV() {
		return tenGV;
	}
	public void setTenGV(String tenGV) {
		this.tenGV = tenGV;
	}
	public String getThongTinLHP() {
		return thongTinLHP;
	}
	public void setThongTinLHP(String thongTinLHP) {
		this.thongTinLHP = thongTinLHP;
	}
	public SinhVien[] getDsSV() {
		return dsSV;
	}
	public void setDsSV(SinhVien[] dsSV) {
		this.dsSV = dsSV;
	}
	
	public LopHocPhan(String ma, String name, String gv, String thongTin, SinhVien[] ds) {
		setMaLHP(ma);
		setTenLHP(name);
		setTenGV(gv);
		setThongTinLHP(thongTin);
		setDsSV(ds);
	}
	
	public int getSoLuongSV() {
		return getDsSV().length;
	}
	
	public String toString() {
		String s = "";
		for (int i = 0; i < getSoLuongSV(); i++) {
			s += "    " + getDsSV()[i].getMaSV() + " | " + getDsSV()[i].getTenSV();
			if (i != getSoLuongSV() - 1) s += "\n";
		}
		return "- Mã LHP: " + getMaLHP() + "\n- Tên LHP: " + getTenLHP() + "\n- GV giảng dạy: " + getTenGV()
		+ "\n- Thông tin buổi học: " + getThongTinLHP() + "\n\nDanh sách sinh viên:\n" + s + "\nTổng số sinh viên: " + getSoLuongSV();
	}
}
