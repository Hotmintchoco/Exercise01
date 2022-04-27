package member.view;

import java.util.Scanner;

import member.model.dao.MemberManager;

public class MemberMenu {
	private Scanner sc = new Scanner(System.in);
	private MemberManager mManager = new MemberManager();
	
	public MemberMenu() {}
	
	public void mainMenu(){
		System.out.println("현재 등록된 회원수는 " + mManager.memberCount + "명 입니다.");
		
		int input = sc.nextInt();
		
		while (true) {
			if (input == 1) {
				mManager.memberInput();
			}
		}
	}
	
	public void searchMenu(){
		
	}
	
	public void sortMenu(){
		
	}
	
	public void modifyMenu(){
		
	}
}
