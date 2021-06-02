import java.util.Random;
import java.util.Scanner;

class minigame1{
	static int result = -1;
	public minigame1(){
		Random r = new Random();
		Scanner c = new Scanner(System.in);
		System.out.print("0.가위, 1.바위, 2.보 \n>>");
		System.out.println("");
		int a = c.nextInt();
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
	}
}
class minigame2{
	static int vs = 0; //대결 결과
	private int Bingo_board[] = new int[25];  // 빙고보드 배열 선언
	private int com_board[] = new int[25]; 
	public minigame2(){
		Random r = new Random();
		play();
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
class vs{
	static int get_some = 0;
	public vs(int w, int result, int type){
		Random r = new Random();
		if(type == 2) {
			get_some += 15;
		}
		if(result > 0) {
			System.out.println("축하합니다~!");
			if(w==0) {
				get_some += r.nextInt(10) + 5;
				PlayGame2.player_hp += get_some;
			}
			if(w==1) {
				get_some += r.nextInt(10) + 5; 
				PlayGame2.player_att += get_some;
			}
			if(w==2) {
				get_some += r.nextInt(10) + 5; 
				PlayGame2.player_def += get_some;
			}
			System.out.println(get_some + " 만큼 얻으셨습니다!!");
		}else {
			System.out.println("다음 기회에~!");
		}
		System.out.println("\n/////현재 상태/////");
		System.out.println("name = " + PlayGame2.player_name);
		System.out.println("hp = " + PlayGame2.player_hp);
		System.out.println("att = " +PlayGame2.player_att);
		System.out.println("def = " +PlayGame2.player_def);
		System.out.println("exp = " + PlayGame2.player_exp);
		System.out.println("level = " +PlayGame2.player_level);
		System.out.println("\n");
	}
	public static int getSome() {
		return get_some;
	}
}

public class PlayGame2 {

	static String player_name;
	static int player_hp = 0;
	static int player_att = 0;
	static int player_def = 0;
	static int player_exp = 0;
	static int player_level = 0;
	
	public static void main(String[] args) {

		Scanner c = new Scanner(System.in);
		Job2 User = new Job2();

		System.out.println("\n게임을 시작합니다.\n");

		System.out.println("1:궁수, 2:마법사, 3:전사, 4:암살자");
		System.out.println("캐릭터를 선택해주세요.");
		System.out.print(">>");
		int job = c.nextInt();

		if (job == 1) {
			User = new Archer2();
		} else if (job == 2) {
			User = new Wizard2();
		} else if (job == 3) {
			User = new Warrior2();
		} else if (job == 4) {
			User = new Assassin2();
		}

		System.out.println("\n선택한 캐릭터의 정보");
		System.out.println("name = " + User.get_name());
		System.out.println("hp = " + User.get_hp());
		System.out.println("att = " + User.get_att());
		System.out.println("def = " + User.get_def());
		System.out.println("exp = " + User.get_exp());
		System.out.println("level = " + User.get_level());

		System.out.println("\n캐릭터 선택이 완료되었습니다.\n");
		while(true) {
			System.out.println("어디로 갈지 선택하세요.");
			System.out.println("1:던전 입장, 2:상점(미니게임), 3:게임 종료");
			System.out.print(">>");
			int place = c.nextInt();

			player_name = User.get_name();
			player_hp += User.get_hp();
			player_att += User.get_att();
			player_def += User.get_def();
			player_exp += User.get_exp();
			player_level += User.get_level();
			
			if (place == 1) {
				while(true) {
					System.out.println("\n============player choice==============");
					System.out.println("(1).level_1 던전|| (2).level_2 던전|| (3).level_3 던전||(4).던전에서 나가기");
					System.out.print(">>");
					int player_ch = c.nextInt();
					permission(player_level, player_ch);
					if(player_ch==4) 
						break;
				}
			} else if (place == 2) {
				// 상점입장
				store();
				
			}else if (place == 3) {
				System.out.println("게임을 종료합니다. 뿅");
				break;
			}else {
				System.out.println("1,2에 해당하는 숫자만 입력해주세요.");
			}
		}
	}
	public static void store() {
			Scanner c = new Scanner(System.in);
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
				System.out.print("어서 오세요 상점입니다~~>_<\n무엇이 필요하신가요?\n0.체력, 1.공격력, 2.방어력, -1.아무것도 필요하지 않음(상점 나가기)\n>>");
				int want = c.nextInt();
				if(want == -1) {
					System.out.println("또 오세용~~>_<");
					System.out.println("\n");
					break;
				}
				System.out.print("게임에서 이기면 드리도록 하죠! 어떤 게임을 하실 건가요?\n0.가위바위보, 1.빙고\n>>");
				int game = c.nextInt();
				if (game == 0) {
					minigame1 m1 = new minigame1();
					vs v = new vs(want, minigame1.result, 1);
				}else if (game == 1) {
					minigame2 m2 = new minigame2();
					vs v = new vs(want, minigame2.vs, 2);
				}else {
					System.out.println("게임은 두가지입니다~ 0 또는 1을 입력하세요~!");
				}
			}
	}
	public static void GameStart() {

		Scanner in = new Scanner(System.in);

		Monster monster1 = new Monster();

		boolean play = true;
		int power;

		System.out.println("\n몬스터가 나타났습니다.\n");

		while (play) {

			System.out.println("============player choice==============");
			System.out.printf("player hp: %d \n", player_hp);
			System.out.printf("%s hp: %d\n", monster1.name, monster1.HP);

			System.out.println("1.공격하기, 2.방어하기 ");
			System.out.print(">>");
			int player_choice = in.nextInt();

			switch (player_choice) {
			case 1:

				Random_Att r = new Random_Att();

				System.out.println("\n공격을 시작합니다.");
				int att_skill = r.att_skill * player_att;
				monster1.HP -= att_skill;
				

				System.out.printf("%d만큼 공격을 하였습니다.\n", att_skill);

				// 몬스터도 공격 실행
				power = monster1.randomskill(1,att_skill);
				player_hp -= power;

				if (monster1.HP <= 0) {
					monster1.HP = 0;
					System.out.printf("%s가 죽었습니다. \n", monster1.name);

					player_exp = monster1.randomreward(10);
					player_hp = monster1.randomreward(player_hp);
					player_att = monster1.randomreward(att_skill);

					System.out.println("\n===============reward=================");
					System.out.printf("<보상> exp:%d player_hp: %d attack: %d\n", player_exp, player_hp, player_att);
					player_level = (player_exp / 10);
					System.out.printf("\n>>level %d 가 되었습니다.\n", player_level);
					play = false;
					break;
				}

				System.out.println("\n현재 player의 hp = " + player_hp);
				System.out.println("현재 monster1의 hp = " + monster1.HP);
				break;

			case 2:

				System.out.println("\n몬스터의 공격을 방어합니다.");
				power = monster1.randomskill(2,0);

				System.out.println("\n현재 player의 hp = " + player_hp);
				System.out.println("현재 monster1의 hp = " + monster1.HP);
				break;

			}

			if (player_hp <= 0) {
				System.out.println("\n몬스터의 공격으로 플레이어가 죽었습니다.");
				play = false;
			}

		}
		

	}

	public static void permission(int level, int player_ch) {

		switch (player_ch) {
		case 1:
			System.out.println("level_1 던전에 입장하셨습니다.");
			GameStart();
			break;
		// 던전플레이 함수 실행
		case 2:
			if (level < 10) {
				System.out.println("level 10이상 부터 입장이 가능합니다.");
				// 게임 플레이 함수로 감
				break;
			}
			System.out.println("level_2 던전에 입장하셨습니다.");
			GameStart();
			break;
		case 3:
			if (level < 20) {
				System.out.println("level 20이상부터 입장이 가능합니다.");
				break;
			}
			System.out.println("level_3 던전에 입장하셨습니다.");
			GameStart();
		case 4:
			System.out.println(">>던전에서 나갔습니다.");
		}
	}

}