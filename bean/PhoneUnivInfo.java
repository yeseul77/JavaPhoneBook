package bean;

public class PhoneUnivInfo extends PhoneInfo {
	private String major;
	private int year;
	
	public PhoneUnivInfo(String name, String phoneNum, String birth, String major, int year) {
		super(name, phoneNum, birth);
		this.major = major;
		this.year = year;
	}
	
	public PhoneUnivInfo(String name, String phoneNum, String major, int year) {
		super(name, phoneNum);
		this.major = major;
		this.year = year;
	}

	@Override
	public void showPhoneInfo() {
		super.showPhoneInfo();
		System.out.println("major : " + major);
		System.out.println("year : " + year);
		System.out.println("=====================");
	}
}
