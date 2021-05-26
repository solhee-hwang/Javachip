package javachip;

import java.util.Scanner;

class minigame1{
	static int get_some = 0;
	public minigame1(int w){
		Scanner in = new Scanner(System.in);
		System.out.print("가위(0), 바위(1) 보(2) 입력 :");
		System.out.println("");
		int a = in.nextInt();
		if (a==0) {
			System.out.println("Player : 가위");
			}
		if (a==1) {
			System.out.println("Player : 바위");
		}
		if (a==2) {
			System.out.println("Player : 보");
		}
		int com=(int)(Math.random()*3);
		if(com==0){
			System.out.println("컴퓨터 : 가위");
		}
		if(com==1){
			System.out.println("컴퓨터 : 바위");
		}
		if(com==2){
			System.out.println("컴퓨터 : 보");
		}
		System.out.println("");
		//컴퓨터가 가위일 때
		int result = 0;
		if(com==0) {
			if(a==0){
				System.out.println("비겼습니다.");
			}
			if(a==1) {	
				System.out.println("!! YOU WIN!!");
				result = 1;
			}
			if(a==2) {	
				System.out.println("You lose...");
			}
		}
		//컴퓨터가 바위일 때
		if(com==1) {
			if(a==0){
				System.out.println("You lose...");
			}
			if(a==1) {	
				System.out.println("비겼습니다.");
			}
			if(a==2) {	
				System.out.println("!! YOU WIN!!");
				result = 1;
			}			
		}
			//컴퓨터가 보 일때
		if(com==2) {
			if(a==0){
				System.out.println("!! YOU WIN!!");
				result = 1;
			}
			if(a==1) {	
				System.out.println("You lose...");
			}
			if(a==2) {	
				System.out.println("비겼습니다.");
			}
		}
		if(result == 1) {
			System.out.println("축하합니다~!");
			if(w==0) {
				get_some += 5; //random 범위로 바꿀 예정
				//player_hp += get_some;
			}
			if(w==1) {
				get_some += 10; //random 범위로 바꿀 예정
				//player_sp += get_some;
			}
			if(w==2) {
				get_some += 10; //random 범위로 바꿀 예정
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
		System.out.print("얻고 싶은 것은? \n 체력(0), 공격력(1), 방어력(2) 입력 :");
		int want = in.nextInt();
		System.out.print("하고 싶은 게임은? \n 가위바위보(0), another game(1)  입력 :");
		int game = in.nextInt();
		if (game == 0) {
			minigame1 m1 = new minigame1(want);
			System.out.println(minigame1.get_some + " 만큼 얻으셨습니다!!");
		}
	}
}