package bean;

//데이터 클래스
public class PhoneInfo {
	
	private String name;
	private String phoneNum;
	private String birth;
	
	
	//생성자

	public PhoneInfo(String name, String phoneNum, String birth) {
		this.name=name;
		this.phoneNum=phoneNum;
		this.birth=birth;
	}
	
	public PhoneInfo(String name, String phoneNum) {
		this.name=name;
		this.phoneNum=phoneNum;
		
	}


	public void showPhoneInfo() {
		System.out.println("name : "+name);
		System.out.println("phoneNum : "+phoneNum);
		if(birth!=null)
			System.out.println("birth : "+birth);
	}
//-----------------------------------------------------------------------------------------	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public String getBirth() {
		return birth;
	}
	public void setBirth(String birth) {
		this.birth = birth;
	}
	
}
