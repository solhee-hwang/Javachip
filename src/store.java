package javachip;

import java.util.Scanner;

class minigame1{
	static int get_some = 0;
	public minigame1(int w){
		Scanner in = new Scanner(System.in);
		System.out.print("����(0), ����(1) ��(2) �Է� :");
		System.out.println("");
		int a = in.nextInt();
		if (a==0) {
			System.out.println("Player : ����");
			}
		if (a==1) {
			System.out.println("Player : ����");
		}
		if (a==2) {
			System.out.println("Player : ��");
		}
		int com=(int)(Math.random()*3);
		if(com==0){
			System.out.println("��ǻ�� : ����");
		}
		if(com==1){
			System.out.println("��ǻ�� : ����");
		}
		if(com==2){
			System.out.println("��ǻ�� : ��");
		}
		System.out.println("");
		//��ǻ�Ͱ� ������ ��
		int result = 0;
		if(com==0) {
			if(a==0){
				System.out.println("�����ϴ�.");
			}
			if(a==1) {	
				System.out.println("!! YOU WIN!!");
				result = 1;
			}
			if(a==2) {	
				System.out.println("You lose...");
			}
		}
		//��ǻ�Ͱ� ������ ��
		if(com==1) {
			if(a==0){
				System.out.println("You lose...");
			}
			if(a==1) {	
				System.out.println("�����ϴ�.");
			}
			if(a==2) {	
				System.out.println("!! YOU WIN!!");
				result = 1;
			}			
		}
			//��ǻ�Ͱ� �� �϶�
		if(com==2) {
			if(a==0){
				System.out.println("!! YOU WIN!!");
				result = 1;
			}
			if(a==1) {	
				System.out.println("You lose...");
			}
			if(a==2) {	
				System.out.println("�����ϴ�.");
			}
		}
		if(result == 1) {
			System.out.println("�����մϴ�~!");
			if(w==0) {
				get_some += 5; //random ������ �ٲ� ����
				//player_hp += get_some;
			}
			if(w==1) {
				get_some += 10; //random ������ �ٲ� ����
				//player_sp += get_some;
			}
			if(w==2) {
				get_some += 10; //random ������ �ٲ� ����
				//player_dp += get_some
			}
		}
	}
	public static int getSome() {
		return get_some;
	}
}


public class store {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("$$$_____$$$$$$$_$$$$$$$_$$$_______$$$_$$$$$$$$$$\r\n"
				+ "$$$____$$$____$$$____$$$_$$$_____$$$__$$$_______\r\n"
				+ "$$$____$$$_____$_____$$$_$$$_____$$$__$$$_______\r\n"
				+ "$$$_____$$$_________$$$___$$$___$$$___$$$$$$$$__\r\n"
				+ "$$$______$$$_______$$$_____$$$_$$$____$$$_______\r\n"
				+ "$$$_______$$$_____$$$______$$$_$$$____$$$_______\r\n"
				+ "$$$$$$$$$___$$$$$$$_________$$$$$_____$$$$$$$$$$\r\n"
				+ "________________________________________________\n"
				+ "\n____________Welcome, There is store_____________\n\n"
				+"________________________________________________\n");
		System.out.print("��� ���� ����? \n ü��(0), ���ݷ�(1), ����(2) �Է� :");
		int want = in.nextInt();
		System.out.print("�ϰ� ���� ������? \n ����������(0), another game(1)  �Է� :");
		int game = in.nextInt();
		if (game == 0) {
			minigame1 m1 = new minigame1(want);
			System.out.println(minigame1.get_some + " ��ŭ �����̽��ϴ�!!");
		}
	}
}