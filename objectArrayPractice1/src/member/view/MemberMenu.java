package member.view;

import java.util.Scanner;
import member.model.dao.MemberManager;
import member.model.dto.Member;

public class MemberMenu {
	private Scanner sc = new Scanner(System.in);
	private MemberManager mManager = new MemberManager();
	Member[] member = new Member[mManager.SIZE];
	
	public MemberMenu() {}
	
	public void mainMenu(){
		
		Outer:
		while (true) {
			System.out.println("현재 등록된 회원수는 " + mManager.memberCount + "명 입니다.");
			System.out.println("1. 새 회원 등록");
			System.out.println("2. 회원 조회");
			System.out.println("3. 회원 정보 수정");
			System.out.println("4. 회원 정보 정렬");
			System.out.println("5. 회원 삭제");
			System.out.println("6. 모두 출력");
			System.out.println("9. 끝내기");
			
			int input = sc.nextInt();
			
			if (input == 1) {
				member[mManager.memberCount] = mManager.memberInput();
				mManager.memberCount++;
			} else if (input == 2) {
				mManager.printMember(searchMenu());
				System.out.println();
			} else if (input == 3) {
				modifyMenu();
			} else if (input == 4) {
				sortMenu();
			} else if (input == 5) {
				mManager.deleteMember();
			} else if (input == 6) {
				mManager.printAllMember();
			} else if (input == 9) {
				System.out.print("정말로 끝내시겠습니까? (y/n) : ");
				
				while(true) {
					String endInput = sc.nextLine();

					if (endInput.equalsIgnoreCase("y")) {
						break Outer;
					} else if (endInput.equalsIgnoreCase("n")) {
						System.out.println("시스템을 진행합니다.");
					} else
						System.out.println("잘못된 입력입니다.");
				} // end문 while.
			}
			
		} // while문 
	} //mainMenu 메서드.
	
	public int searchMenu(){
		while (true) {
			System.out.println("1. 아이디로 검색");
			System.out.println("2. 이름으로 검색");
			System.out.println("3. 이메일로 검색");
			System.out.println("9. 이전 메뉴로 가기");
			
			int searchInput = sc.nextInt();
			if (searchInput == 1) {
				System.out.print("아이디를 입력하세요: ");
				String inputId = sc.next();
				for (int i = 0; i < mManager.memberCount; i++) {
					if(member[i].getId().equals(inputId)) {
						return i;
					}
				}
				return -1;
			}
			else if (searchInput == 2) {
				String inputName = sc.nextLine();
				for (int i = 0; i < mManager.memberCount; i++) {
					if(member[i].getName().equals(inputName)) {
						return i;
					} 
				}
				return -1;
			}
			else if (searchInput == 3) {
				String inputemail = sc.nextLine();
				for (int i = 0; i < mManager.memberCount; i++) {
					if(member[i].getEmail().equals(inputemail)) {
						return i;
					} 
				}
				return -1;
			}
			else if (searchInput == 9) {
				System.out.println("메인메뉴로 화면 이동합니다.");
				break;
			}
		}
		return 100;
	}
	
	public void sortMenu(){
		
	}
	
	public void modifyMenu(){
		
	}
}
