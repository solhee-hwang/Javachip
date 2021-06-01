

import java.util.Scanner;
import java.util.Random;

class minigame1{
	static int get_some = 0;
	public minigame1(int w){
		Random r = new Random();
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
		int com = r.nextInt(3);
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
				get_some +=  r.nextInt(10) + 5;
				//player_hp += get_some;
			}
			if(w==1) {
				get_some +=  r.nextInt(10) + 5; 
				//player_sp += get_some;
			}
			if(w==2) {
				get_some +=  r.nextInt(10) + 5; 
				//player_dp += get_some
			}
		}
	}
	public static int getSome() {
		return get_some;
	}
}
class minigame2{
	static int get_some = 0;
	static int vs = 0;
	private int Bingo_board[] = new int[25];  // 빙고보드 배열 선언
	private int com_board[] = new int[25]; 
	public minigame2(int w){
		Random r = new Random();
		play();
		if(vs > 0) {
			System.out.println("축하합니다~!\n");
			if(w==0) {
				get_some += r.nextInt(20) + 30;
				//player_hp += get_some;
			}
			if(w==1) {
				get_some += r.nextInt(20) + 30; 
				//player_sp += get_some;
			}
			if(w==2) {
				get_some += r.nextInt(20) + 30; 
				//player_dp += get_some
			
			}
		}else
			System.out.println("다음 기회에~!");
	}
	public static int getSome() {
		return get_some;
	}
	private int HowManyBingos(int array[]) { // 현재 빙고의 수를 카운트하는 메소드 
	    int totalBingo = 0;
	    
	    // 가로 방향 빙고의 개수를 카운트
	    for(int i = 0; i < 5; i++) {
	    	int cnt = 0;
	    	for(int j = 0 + 5*i; j < 5*(i+1); j++) {
	    		if (array[j] == 0)
	    			cnt++;
	    	}
	    	if (cnt >= 5)
		        totalBingo++;
	    }
	   
	    // 세로 방향 빙고의 개수를 카운트 
	    for (int m = 0; m < 5; m++) { 
	      // 한 열에서 0의 갯수 세기
	      int cnt = 0;
	      for (int i = m; i <= m + 20; i += 5)
	        if (array[i] == 0)
	          cnt++; // 빙고 조건이면 빙고 수 증가 
	      if (cnt >= 5)
	        totalBingo++;
	    }

	    // 슬래시 방향 빙고 카운트 
	    int cnt = 0;
	    for (int i = 0; i <= 24; i += 6)
	      if (array[i] == 0)
	        cnt++;
	    // 빙고 조건이면 빙고 수 증가
	    if (cnt >= 5)
	        totalBingo++;
	    
	    cnt = 0;
	    // 역슬래시 방향 카운트
	    for (int i = 4; i <= 20; i += 4)
	      if (array[i] == 0)
	        cnt++;
	    // 빙고 조건이면 빙고 수 증가 
	    if (cnt >= 5)
	      totalBingo++;
	  
	    return totalBingo;
	  }


	  // 현재 빙고 보드를 출력하는 메소드 
	  private void display() {
	    // 빙고판 출력하기
		System.out.println("현재 빙고 수: " + HowManyBingos(Bingo_board));
	    System.out.println("-------------------------");
	  
	    for (int i = 0; i < 25; i++) {
	      if(i % 5 == 0)
	        System.out.print("| ");

	      System.out.format("%02d | ", Bingo_board[i]);

	      if((i + 1) % 5 == 0) { 
	        // 5개 출력 후 줄 바꾸기
	        System.out.println("");
	        System.out.println("-------------------------");
	      }
	    }
	    System.out.println("지울 숫자를 선택하세요. (게임종료는 99를 입력하새요.)");
	  }
	  private void display_com() { //test용
		    // 빙고판 출력하기
			System.out.println("현재 빙고 수: " + HowManyBingos(com_board));
		    System.out.println("-------------------------");
		  
		    for (int i = 0; i < 25; i++) {
		      if(i % 5 == 0)
		        System.out.print("| ");

		      System.out.format("%02d | ", com_board[i]);

		      if((i + 1) % 5 == 0) { 
		        // 5개 출력 후 줄 바꾸기
		        System.out.println("");
		        System.out.println("-------------------------");
		      }
		    }
		  }
	  public void shake(int array[]) {
		  Random rd = new Random(); // 랜덤 객체 선언 및 초기화
		  for (int i = 0; i < 50; i++) {
		      int pick1 = rd.nextInt(25);
		      int pick2 = rd.nextInt(25);
		      
		     //swap
		      int temp = array[pick1];
		      array[pick1] = array[pick2];
		      array[pick2] = temp;
		    }
	  }
	  public void new_board() {
		    // 배열에 수 채우기
		    for (int i = 0; i < 25; i++) {
		    	Bingo_board[i] = i + 1;
		    	com_board[i] = i + 1;
		    }
		    shake(Bingo_board);
		    shake(com_board);
	  }
	  // 빙고 게임 플레이 에인 메소드
	  public void play() {

	    new_board();
	    Scanner in = new Scanner(System.in); // 입력 객체 선언 및 초기화
	    Random r = new Random();
	    // 게임 플레이 반복
	    int cnt = 0; //이전 기록 수 카운트
	    int cs[] = new int[49];
	    while(true) {
	    	if (HowManyBingos(Bingo_board) >= 3 && HowManyBingos(com_board)>=HowManyBingos(com_board)) {
	    		System.out.println("플레이어가 우승하였습니다");
	    		vs = 1;
	    		break;
	    	}else if (HowManyBingos(com_board)>=3&& HowManyBingos(com_board) >= HowManyBingos(com_board)) {
	    		System.out.println("컴퓨터가 우승하였습니다");
	    		vs = -1;
	    		break;
	    	}
	    	display();  // 빙고판 출력
	    	//display_com(); //컴퓨터 빙고판
	    	int c = in.nextInt();
	    	if (c == 99) {
	    		System.out.println("게임이 종료되었습니다.");
	    		break;
	    	}
	    	int result = 0;
	    	while(true) { //이전과 겹치면 처리
	    		result = 0;
	    		for(int i = 0; i < cs.length; i++)
	            	if(cs[i]==c)
	                	result = 1;
	    		if(result == 0)
	    			break;
	    		if(result == 1) {
	    			System.out.println("이미 입력한 숫자입니다");
	    		}
	    		c = in.nextInt();
	    	}
	    	// 사용자가 입력한 수가 Bingo_board 배열의 몇 번째에 있는지 검색
	    	int find = -1;
	    	int f = -1;
	    	for (int i = 0; i < Bingo_board.length; i++) {
	    		if (Bingo_board[i] == c) {
	    			find = i;
	    		}
	    		if (com_board[i] == c) {
	    			f = i;
	    		}
	    	}
	    	// 사용자가 선택한 숫자를 가지고 있는 Bingo_board 배열의 칸을 0으로 변경
	    	Bingo_board[find] = 0;
	    	com_board[f] = 0;
	    	//사용자 기록 저장
	    	cs[cnt] = c;
	    	cnt++;
	    	//컴퓨터 차례
	    	find = -1;
	    	f = -1;
	    	int com_pick = 0;
	    	while(true) { //이전과 겹치면 처리
	    		result = 0;
	    		com_pick = r.nextInt(25) + 1; //컴퓨터 pick
	    		if(c==com_pick) {
	    			result = 1;
	    		}
	    		for(int i = 0; i < cs.length; i++)
	            	if(cs[i]==com_pick)
	                	result = 1;
	    		if(result == 0)
	    			break;
	    	}
	    	cs[cnt] = com_pick; //기록 저장
	    	cnt++; //기록 수 카운트
	    	//배열에서 검색
	    	for (int i = 0; i < 25; i++) {
	    		if (Bingo_board[i] == com_pick) {
	    			find = i;
	    		}
	    		if (com_board[i] == com_pick) {
	    			f = i;
	    		}
	    	}
	    	//컴퓨터 pick 설명
	    	System.out.println("컴퓨터는 ["+ com_pick+"]을 골랐습니다!");
	    	// 사용자가 선택한 숫자를 가지고 있는 com_board 배열의 칸을 0으로 변경
	    	Bingo_board[find] = 0;
	    	com_board[f] = 0;
	    }
	  }
	}
public class store {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(true) {
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
			System.out.print("하고 싶은 게임은? \n 가위바위보(0), 빙고(1), 상점 나가기(-1)  입력 :");
			int game = in.nextInt();
			if (game == 0) {
				minigame1 m1 = new minigame1(want);
				System.out.println(minigame1.get_some + " 만큼 얻으셨습니다!!");
			}else if (game == 1) {
				minigame2 m2 = new minigame2(want);
				System.out.println(minigame2.get_some + " 만큼 얻으셨습니다!!");
			}else if (game == -1) {
				System.out.println("또 오세용~~>_<");
				break;
			}
		}
	}
}