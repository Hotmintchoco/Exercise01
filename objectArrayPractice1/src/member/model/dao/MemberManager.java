package member.model.dao;

import java.util.Scanner;

import member.model.dto.Member;

public class MemberManager {
	Member[] member = new Member[10];
	public static final int SIZE = 10;
	public int memberCount = 0;
	
	public void memberInput() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("아이디와 이름을 입력해주세요.");
		
		for(int i = 0; i < memberCount; i++) {
			member[i] = new Member();
		}
	}
}
