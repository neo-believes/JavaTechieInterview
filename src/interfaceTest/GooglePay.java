package interfaceTest;

public class GooglePay implements Payment {

	@Override
	public void getAppName() {
		System.out.println("GooglePay");
	}public GooglePay() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void addVoucher() {
		System.out.println("10rs");
	}
	

	public static void main(String[] args) {
		GooglePay pay = new GooglePay();
		pay.getAppName();
		pay.addVoucher();
		Payment.generateReceipt();
	}

}
