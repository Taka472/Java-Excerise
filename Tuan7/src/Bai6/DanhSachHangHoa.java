package Bai6;

import java.util.ArrayList;
import java.util.Comparator;

public class DanhSachHangHoa{
	private ArrayList<HangHoa> list;
	private int count;
	public ArrayList<HangHoa> getList() {
		return list;
	}
	public void setList(ArrayList<HangHoa> list) {
		this.list = list;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	public DanhSachHangHoa(int n) {
		list = new ArrayList<HangHoa>();
		setCount(n);
	}
	
	public boolean them(HangHoa a) {
		if (getList().size() == getCount()) return false;
		for (int i = 0; i < getList().size(); i++) {
			if (getList().get(i).getMaHang().equals(a.getMaHang()))
				return false;
		}
		getList().add(a);
		return true;
	}
	
	public String toString() {
		String s = "";
		for (int i = 0; i < getList().size(); i++) {
			s += getList().get(i).toString();
		}
		return s;
	}
	
	public String toStringBaseOnType() {
		String tp = "", dm = "", ss = "";
		for (int i = 0; i < getList().size(); i++) {
			if (getList().get(i) instanceof HangThucPham)
				tp +=  getList().get(i).toString();
			else if (getList().get(i) instanceof HangDienMay)
				dm += getList().get(i).toString();
			else ss += getList().get(i).toString();
		}
		String s = "Hang thuc pham: \n" + tp + "\nHang dien may: " + dm + "\nHang sanh su: " + ss;
		return s;
	}
	
	public boolean Search(String maHang) {
		for (int i = 0; i < getList().size(); i++) {
			if (getList().get(i).getMaHang().equals(maHang))
				return true;
		}
		return false;
	}
	
	public void ArrangeBaseOnName() {
		getList().sort(new Comparator<HangHoa>() {
			public int compare(HangHoa o1, HangHoa o2) {
				return o1.getMaHang().compareTo(o2.getMaHang());
			}
		});
	}
	
	public void ArrangeBaseOnAmount() {
		getList().sort(new Comparator<HangHoa>() {
			public int compare(HangHoa o1, HangHoa o2) {
				return o2.getSoLuong() - o1.getSoLuong();
			}
		});
	}
	
	public String KhoBanList() {
		String s = "";
		for (int i = 0; i < getList().size(); i++) {
			if (getList().get(i).getTinhTrang().equals("Kho ban"))
				s += getList().get(i).toString();
		}
		return s;
	}
	
	public boolean Xoa(String maHang) {
		for (int i = 0; i < getList().size(); i++) {
			if (getList().get(i).getMaHang().equals(maHang)) {
					getList().remove(i);
					return true;
			}
		}
		return false;
	}
	
	public boolean Update(String maHang, double donGia) throws Exception{
		for (int i = 0; i < getList().size(); i++) {
			if (getList().get(i).getMaHang().equals(maHang)) {
				getList().get(i).setDonGia(donGia);
				return true;
			}
		}
		return false;
	}
}