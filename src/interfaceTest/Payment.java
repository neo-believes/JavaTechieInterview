package interfaceTest;

public interface Payment {

	void getAppName();
	
	static void generateReceipt() {
		System.out.println("genreated");
	}

	default void addVoucher() {
		System.out.println("5rs");
	}
}
