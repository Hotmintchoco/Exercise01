package member.model.dao;

import java.util.Scanner;

import member.model.dto.Member;

public class MemberManager {
	public static final int SIZE = 10;
	Member[] member = new Member[SIZE];
	public int memberCount;
	
	public Member memberInput() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���̵� �Է����ּ���.");
		String id = sc.nextLine();
		System.out.println("�̸��� �Է����ּ���.");
		String name = sc.nextLine();
		System.out.println("��й�ȣ�� �Է����ּ���.");
		String password = sc.nextLine();
		System.out.println("�̸����� �Է����ּ���.");
		String email = sc.nextLine();
		System.out.println("������ �Է����ּ���.(������ M / ������ W)");
		String inputGender = sc.nextLine();
		System.out.println("������ �Է����ּ���.");
		int age = sc.nextInt();
		
		char gender = inputGender.charAt(0);
		
		member[memberCount] = new Member(id, name, password, email, gender, age);
		return member[memberCount];
	}
	public void deleteMember() {
		
	}
	
	public void printAllMember() {
		
	}
	
	public void printMember(int index) {
		if (index == -1) {
			System.out.println("ȸ�������� �������� �ʽ��ϴ�.");
		} else if (index == 100){
			System.out.println();
		} else {
			System.out.println("ȸ���� �迭�ε����� [" + index + "]�Դϴ�.");
		}
	}
}
