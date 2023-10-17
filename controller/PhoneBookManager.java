package controller;

import bean.PhoneComInfo;
import bean.PhoneInfo;
import bean.PhoneUnivInfo;
import exception.MenuWrongException;

//제어 클래스
public class PhoneBookManager {

	private PhoneInfo[] phoneList = new PhoneInfo[100];
	private int cnt; // idx와 목록갯수

	public PhoneBookManager() {
		cnt = 0;
	}

	public PhoneBookManager(int size) {
		cnt = 0;
		this.phoneList = new PhoneInfo[size];
	}

	public void inputData() throws MenuWrongException {
		System.out.println("데이터입력을 시작합니다.");
		System.out.println("1.일반,2대학,3회사");
		System.out.println("선택>>");
		
		int subMenuNum = Main.sc.nextInt();
		switch (subMenuNum) {
		case 1:
			normalinputData();
			break;

		case 2:
			univinputData();
			break;

		case 3:
			companyinputData();
			break;
		}
	}

	private void selectMenu() {
		System.out.println("메뉴를 선택하세요.");
		System.out.println("----------------");
		System.out.println("1.일반인");
		System.out.println("2.대학생");
		System.out.println("3.회사원");
		System.out.println("----------------");
		System.out.print("선택 : ");
	}

//	private void searchData () {
//		System.out.println("검색할 데이터를 입력합니다");
//		System.out.println("이름 입력 : ");
//	}

	private void companyinputData() {
		System.out.println("");
		System.out.println("데이터 입력을 시작합니다.");
		System.out.print("이름 입력 : ");
		String name = Main.sc.next();
		System.out.print("전화번호 입력 : ");
		String phoneNum = Main.sc.next();
		System.out.print("생년월일 입력 : ");
		String birth = Main.sc.next();
		System.out.print("회사명 입력 : ");
		String company = Main.sc.next();
		PhoneComInfo info = new PhoneComInfo(name, phoneNum, birth, company);
		phoneList[cnt++] = info;
	}

	private void univinputData() {
		System.out.println("");
		System.out.println("데이터 입력을 시작합니다.");
		System.out.print("이름 입력 : ");
		String name = Main.sc.next();
		System.out.print("전화번호 입력 : ");
		String phoneNum = Main.sc.next();
		System.out.print("생년월일 입력 : ");
		String birth = Main.sc.next();
		System.out.print("전공 입력 : ");
		String major = Main.sc.next();
		System.out.print("학년 입력 : ");
		int year = Main.sc.nextInt();
		PhoneUnivInfo info = new PhoneUnivInfo(name, phoneNum, birth, major, year);
		phoneList[cnt++] = info;
	}

	private void normalinputData() {
		System.out.println("");
		System.out.println("데이터 입력을 시작합니다.");
		System.out.print("이름 입력 : ");
		String name = Main.sc.next();
		System.out.print("전화번호 입력 : ");
		String phoneNum = Main.sc.next();
		System.out.print("생년월일 입력 : ");
		String birth = Main.sc.next();
		PhoneInfo info = new PhoneInfo(name, phoneNum, birth);
		phoneList[cnt++] = info;
	}

	public void showAllData() {
		// phoneList 배열의 모든 명단 출력할것..

		for (int i = 0; i < cnt; i++) {
			phoneList[i].showPhoneInfo();
			/*
			 * phoneList[cnt++] = info; 를 PhoneInfo[] phoneList = new PhoneInfo[100]; 0부터
			 * 99명까지 phonInfo의변수에 넣어서 선언했기때문에 length를 사용하지 않아도 된다.
			 *
			 */
		}
		System.out.println("전체 목록 출력 완료.");
	}

	public void searchName() {
		boolean find = false;
		System.out.println("데이터 검색을 시작합니다.");
		System.out.print("이름 입력 : ");
		String searchName = Main.sc.next();
		for (int i = 0; i < cnt; i++) {
			if (searchName.equals(phoneList[i].getName())) {
				phoneList[i].showPhoneInfo();
				System.out.println("데이터 검색을 완료합니다.");
				find = true;
				break;
			}
		}
		if (!find) {
			System.out.println("검색된 연락처가 없습니다.");
		}

	}

	public void deleteData() {
		boolean find = false;
		System.out.println("데이터 삭제를 시작합니다.");
		System.out.print("삭제할 이름 입력 : ");
		String deleteName = Main.sc.next();
		for (int i = 0; i < cnt; i++) {
			if (deleteName.equals(phoneList[i].getName())) {
				phoneList[i] = phoneList[cnt - 1];
				phoneList[cnt - 1] = null;
				cnt--;
				System.out.println("데이터 삭제를 완료합니다.");
				find = true;
				break;
			}
		}
		if (!find) {
			System.out.println("삭제할 데이터가 존재하지 않습니다.");
		}
	}
}