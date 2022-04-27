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
			System.out.println("���� ��ϵ� ȸ������ " + mManager.memberCount + "�� �Դϴ�.");
			System.out.println("1. �� ȸ�� ���");
			System.out.println("2. ȸ�� ��ȸ");
			System.out.println("3. ȸ�� ���� ����");
			System.out.println("4. ȸ�� ���� ����");
			System.out.println("5. ȸ�� ����");
			System.out.println("6. ��� ���");
			System.out.println("9. ������");
			
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
				System.out.print("������ �����ðڽ��ϱ�? (y/n) : ");
				
				while(true) {
					String endInput = sc.nextLine();

					if (endInput.equalsIgnoreCase("y")) {
						break Outer;
					} else if (endInput.equalsIgnoreCase("n")) {
						System.out.println("�ý����� �����մϴ�.");
					} else
						System.out.println("�߸��� �Է��Դϴ�.");
				} // end�� while.
			}
			
		} // while�� 
	} //mainMenu �޼���.
	
	public int searchMenu(){
		while (true) {
			System.out.println("1. ���̵�� �˻�");
			System.out.println("2. �̸����� �˻�");
			System.out.println("3. �̸��Ϸ� �˻�");
			System.out.println("9. ���� �޴��� ����");
			
			int searchInput = sc.nextInt();
			if (searchInput == 1) {
				System.out.print("���̵� �Է��ϼ���: ");
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
				System.out.println("���θ޴��� ȭ�� �̵��մϴ�.");
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
