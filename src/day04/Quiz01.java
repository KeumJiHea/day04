package day04;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String home = null;
		String work = null;
		int user = 0;
		


		while(true) {
			
			System.out.println("1. 우리 집 등록");
			System.out.println("2. 회사 등록");
			System.out.println("3. 등록 보기");
			
			System.out.println("숫자 입력: ");
			user = input.nextInt();
			
			switch(user) {
			case 1: System.out.println("집 주소를 입력해주세요.");
					home = input.next();break;
			case 2: System.out.println("회사 주소를 입력해주세요.");
					work = input.next();break;
			case 3:
				if(home != null || work != null) {
					System.out.println("우리집: " + home);
					System.out.println("회사: " + work);
				}else {
					System.out.println("먼저 등록을 해주세요.");
				}
			case 4: System.out.println("컨티뉴!");continue;
			case 5: System.out.println("컨티뉴테스트");
			
			}
		}
		
		
		
		
		
		
		
		
		
		
	}

}
