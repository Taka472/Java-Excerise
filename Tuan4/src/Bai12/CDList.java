package Bai12;

public class CDList {
	private CD[] List;
	private int current = 0;

	public CD[] getList() {
		return List;
	}

	public void setList(CD[] list) {
		List = list;
	}
	
	public CDList(int n) {
		List = new CD[n];
	}
	
	public boolean AddCD(CD a) {
		if (List.length == current) return false;
		if (current != 0)
			for (int i = 0; i < current; i++) {
				if (List[i].getID() == a.getID())
					return false;
			}
		List[current] = a;
		current++;
		return true;
	}
	
	public String toString() {
		String s = "";
		for (int i = 0; i < current; i++) {
			s += List[i].toString();
			s += "\n";
		}
		return s;
	}
	
	public int Length() {
		return current;
	}
	
	public boolean Delete(int ID) {
		int i = 0;
		for (i = 0; i < current; i++) {
			if (List[i].getID() == ID) break;
			else if (i == current - 1) return false;
		}
		for (int t = i; t < current - 1; t++) {
			List[t] = List[t + 1];
		}
		current--;
		return true;
	}
	
	public int Sum() {
		int sum = 0;
		for (int i = 0; i < current; i++) {
			sum += List[i].getPrice();
		}
		return sum;
	}
	
	public int Search(int ID) {
		for (int i = 0; i < current; i++) {
			if (List[i].getID() == ID) return i;
		}
		return -1;
	}
	
	public void SortByPrice() {
		if (current < 2) return;
		for (int i = 0; i < current; i++) {
			for (int j = 0; j < current - 1; j++) {
				if (List[j].getPrice() > List[j + 1].getPrice()) {
					CD temp = List[j];
					List[j] = List[j + 1];
					List[j + 1] = temp;
				}
			}
		}
	}
	
	public void SortByName() {
		if (current < 2) return;
		for (int i = 0; i < current; i++) {
			for (int j = 0; j < current - 1; j++) {
				if (List[j].getName().compareTo(List[j + 1].getName()) < 1) {
					CD temp = List[j];
					List[j] = List[j + 1];
					List[j + 1] = temp;
				}
			}
		}
	}
}