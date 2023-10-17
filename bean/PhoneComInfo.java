package bean;

public class PhoneComInfo extends PhoneInfo {
	private String company;
	
	public PhoneComInfo(String name, String phoneNum, String birth, String company) {
		super(name, phoneNum, birth);
		this.company = company;
	}
	
	public PhoneComInfo(String name, String phoneNum, String company) {
		super(name, phoneNum);
		this.company = company;
	}

	@Override
	public void showPhoneInfo() {
		super.showPhoneInfo();
		System.out.println("company : " + company);
		System.out.println("=============");
	}
	
	
}
