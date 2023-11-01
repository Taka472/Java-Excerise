package Bai4;

import java.util.ArrayList;

public class DanhSachSach {
	private ArrayList<Sach> list;
	private int count;
	
	public ArrayList<Sach> getList() {
		return list;
	}
	public void setList(ArrayList<Sach> list) {
		this.list = list;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	public DanhSachSach(int count) {
		list = new ArrayList<Sach>();
		setCount(count);
	}
	
	public boolean themSach(Sach a) {
		if (getList().size() == getCount()) return false;
		getList().add(a);
		return true;
	}
	
	public double tinhTongThanhTienSGK() {
		double result = 0;
		for (int i = 0; i < getList().size(); i++) {
			if (getList().get(i) instanceof SachGiaoKhoa)
				result += getList().get(i).getThanhTien();
		}
		return result;
	}

	public double tinhTongThanhTienSTK() {
		double result = 0;
		for (int i = 0; i < getList().size(); i++) {
			if (getList().get(i) instanceof SachThamKhao)
				result += getList().get(i).getThanhTien();
		}
		return result;
	}
	
	public ArrayList<Sach> timSachGiaoKhoaTheoNXB(String nxb) {
		ArrayList<Sach> result = new ArrayList<Sach>();
		for (int i = 0; i < getList().size(); i++) {
			if (getList().get(i) instanceof SachGiaoKhoa && getList().get(i).getNhaXuatBan().equals(nxb)) {
				result.add(getList().get(i));
			}
		}
		return result;
	}
	
	public double timThanhTienCaoNhat() {
		double result = 0;
		for (int i = 0; i < getList().size(); i++) {
			if (getList().get(i).getThanhTien() > result) {
				result = getList().get(i).getThanhTien();
			}
		}
		return result;
	}
	
	public String toString() {
		String s = "";
		for (int i = 0; i < getList().size(); i++) {
			s += getList().get(i).toString() + "\n";
		}
		return s;
	}
}
