package day04;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String home = null;
		String work = null;
		int user = 0;
		


		while(true) {
			
			System.out.println("1. �츮 �� ���");
			System.out.println("2. ȸ�� ���");
			System.out.println("3. ��� ����");
			
			System.out.println("���� �Է�: ");
			user = input.nextInt();
			
			switch(user) {
			case 1: System.out.println("�� �ּҸ� �Է����ּ���.");
					home = input.next();break;
			case 2: System.out.println("ȸ�� �ּҸ� �Է����ּ���.");
					work = input.next();break;
			case 3:
				if(home != null || work != null) {
					System.out.println("�츮��: " + home);
					System.out.println("ȸ��: " + work);
				}else {
					System.out.println("���� ����� ���ּ���.");
				}
			case 4: System.out.println("��Ƽ��!");continue;
			case 5: System.out.println("��Ƽ���׽�Ʈ");
			
			}
		}
		
		
		
		
		
		
		
		
		
		
	}

}
