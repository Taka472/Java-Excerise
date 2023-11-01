package bai8;

public class Demo {
	public static void main(String[] argv) {
		Account acc1 = new Account(72354, "Ted Murphy", 100000);
		Account acc2 = new Account(69713, "Jane Smith", 40000);
		Account acc3 = new Account(93757, "Edward Demsey", 700000);
		
		if (acc1.deposit(250000) && acc2.deposit(500000)) {
			System.out.println("Cau 1:");
			System.out.println(acc1.toString());
			System.out.println("\n" + acc2.toString());
		}
		
		if (acc2.withdraw(430000, 2000)) {
			System.out.println("\nCau 2: ");
			System.out.println(acc2.toString());
		}
		
		System.out.println("\nCau 3: ");
		acc3.addInterest();
		System.out.println(acc3.toString());
		
		if (acc2.transfer(acc1, 100000)) {
			System.out.println("\nCau 4:");
			System.out.println(acc1.toString());
			System.out.println("\n" + acc2.toString());
		}
	}
}
