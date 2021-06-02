import java.util.Random;
import java.util.Scanner;

class minigame1{
	static int result = -1;
	public minigame1(){
		Random r = new Random();
		Scanner c = new Scanner(System.in);
		System.out.print("0.����, 1.����, 2.�� \n>>");
		System.out.println("");
		int a = c.nextInt();
		if (a==0) {
			System.out.println("Player : ����");
			}
		if (a==1) {
			System.out.println("Player : ����");
		}
		if (a==2) {
			System.out.println("Player : ��");
		}
		int com = r.nextInt(3);
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
	}
}
class minigame2{
	static int vs = 0; //��� ���
	private int Bingo_board[] = new int[25];  // ������ �迭 ����
	private int com_board[] = new int[25]; 
	public minigame2(){
		Random r = new Random();
		play();
	}
	private int HowManyBingos(int array[]) { // ���� ������ ���� ī��Ʈ�ϴ� �޼ҵ� 
	    int totalBingo = 0;
	    
	    // ���� ���� ������ ������ ī��Ʈ
	    for(int i = 0; i < 5; i++) {
	    	int cnt = 0;
	    	for(int j = 0 + 5*i; j < 5*(i+1); j++) {
	    		if (array[j] == 0)
	    			cnt++;
	    	}
	    	if (cnt >= 5)
		        totalBingo++;
	    }
	   
	    // ���� ���� ������ ������ ī��Ʈ 
	    for (int m = 0; m < 5; m++) { 
	      // �� ������ 0�� ���� ����
	      int cnt = 0;
	      for (int i = m; i <= m + 20; i += 5)
	        if (array[i] == 0)
	          cnt++; // ���� �����̸� ���� �� ���� 
	      if (cnt >= 5)
	        totalBingo++;
	    }

	    // ������ ���� ���� ī��Ʈ 
	    int cnt = 0;
	    for (int i = 0; i <= 24; i += 6)
	      if (array[i] == 0)
	        cnt++;
	    // ���� �����̸� ���� �� ����
	    if (cnt >= 5)
	        totalBingo++;
	    
	    cnt = 0;
	    // �������� ���� ī��Ʈ
	    for (int i = 4; i <= 20; i += 4)
	      if (array[i] == 0)
	        cnt++;
	    // ���� �����̸� ���� �� ���� 
	    if (cnt >= 5)
	      totalBingo++;
	  
	    return totalBingo;
	  }

	
	  // ���� ���� ���带 ����ϴ� �޼ҵ� 
	  private void display() {
	    // ������ ����ϱ�
		System.out.println("���� ���� ��: " + HowManyBingos(Bingo_board));
	    System.out.println("-------------------------");
	  
	    for (int i = 0; i < 25; i++) {
	      if(i % 5 == 0)
	        System.out.print("| ");

	      System.out.format("%02d | ", Bingo_board[i]);

	      if((i + 1) % 5 == 0) { 
	        // 5�� ��� �� �� �ٲٱ�
	        System.out.println("");
	        System.out.println("-------------------------");
	      }
	    }
	    System.out.println("���� ���ڸ� �����ϼ���. (��������� 99�� �Է��ϻ���.)");
	  }
	  private void display_com() { //test��
		    // ������ ����ϱ�
			System.out.println("���� ���� ��: " + HowManyBingos(com_board));
		    System.out.println("-------------------------");
		  
		    for (int i = 0; i < 25; i++) {
		      if(i % 5 == 0)
		        System.out.print("| ");

		      System.out.format("%02d | ", com_board[i]);

		      if((i + 1) % 5 == 0) { 
		        // 5�� ��� �� �� �ٲٱ�
		        System.out.println("");
		        System.out.println("-------------------------");
		      }
		    }
		  }
	  public void shake(int array[]) {
		  Random rd = new Random(); // ���� ��ü ���� �� �ʱ�ȭ
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
		    // �迭�� �� ä���
		    for (int i = 0; i < 25; i++) {
		    	Bingo_board[i] = i + 1;
		    	com_board[i] = i + 1;
		    }
		    shake(Bingo_board);
		    shake(com_board);
	  }
	  // ���� ���� �÷��� ���� �޼ҵ�
	  public void play() {

	    new_board();
	    Scanner in = new Scanner(System.in); // �Է� ��ü ���� �� �ʱ�ȭ
	    Random r = new Random();
	    // ���� �÷��� �ݺ�
	    int cnt = 0; //���� ��� �� ī��Ʈ
	    int cs[] = new int[49];
	    while(true) {
	    	if (HowManyBingos(Bingo_board) >= 3 && HowManyBingos(com_board)>=HowManyBingos(com_board)) {
	    		System.out.println("�÷��̾ ����Ͽ����ϴ�");
	    		vs = 1;
	    		break;
	    	}else if (HowManyBingos(com_board)>=3&& HowManyBingos(com_board) >= HowManyBingos(com_board)) {
	    		System.out.println("��ǻ�Ͱ� ����Ͽ����ϴ�");
	    		vs = -1;
	    		break;
	    	}
	    	display();  // ������ ���
	    	//display_com(); //��ǻ�� ������
	    	int c = in.nextInt();
	    	if (c == 99) {
	    		System.out.println("������ ����Ǿ����ϴ�.");
	    		break;
	    	}
	    	int result = 0;
	    	while(true) { //������ ��ġ�� ó��
	    		result = 0;
	    		for(int i = 0; i < cs.length; i++)
	            	if(cs[i]==c)
	                	result = 1;
	    		if(result == 0)
	    			break;
	    		if(result == 1) {
	    			System.out.println("�̹� �Է��� �����Դϴ�");
	    		}
	    		c = in.nextInt();
	    	}
	    	// ����ڰ� �Է��� ���� Bingo_board �迭�� �� ��°�� �ִ��� �˻�
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
	    	// ����ڰ� ������ ���ڸ� ������ �ִ� Bingo_board �迭�� ĭ�� 0���� ����
	    	Bingo_board[find] = 0;
	    	com_board[f] = 0;
	    	//����� ��� ����
	    	cs[cnt] = c;
	    	cnt++;
	    	//��ǻ�� ����
	    	find = -1;
	    	f = -1;
	    	int com_pick = 0;
	    	while(true) { //������ ��ġ�� ó��
	    		result = 0;
	    		com_pick = r.nextInt(25) + 1; //��ǻ�� pick
	    		if(c==com_pick) {
	    			result = 1;
	    		}
	    		for(int i = 0; i < cs.length; i++)
	            	if(cs[i]==com_pick)
	                	result = 1;
	    		if(result == 0)
	    			break;
	    	}
	    	cs[cnt] = com_pick; //��� ����
	    	cnt++; //��� �� ī��Ʈ
	    	//�迭���� �˻�
	    	for (int i = 0; i < 25; i++) {
	    		if (Bingo_board[i] == com_pick) {
	    			find = i;
	    		}
	    		if (com_board[i] == com_pick) {
	    			f = i;
	    		}
	    	}
	    	//��ǻ�� pick ����
	    	System.out.println("��ǻ�ʹ� ["+ com_pick+"]�� ������ϴ�!");
	    	// ����ڰ� ������ ���ڸ� ������ �ִ� com_board �迭�� ĭ�� 0���� ����
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
			System.out.println("�����մϴ�~!");
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
			System.out.println(get_some + " ��ŭ �����̽��ϴ�!!");
		}else {
			System.out.println("���� ��ȸ��~!");
		}
		System.out.println("\n/////���� ����/////");
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

		System.out.println("\n������ �����մϴ�.\n");

		System.out.println("1:�ü�, 2:������, 3:����, 4:�ϻ���");
		System.out.println("ĳ���͸� �������ּ���.");
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

		System.out.println("\n������ ĳ������ ����");
		System.out.println("name = " + User.get_name());
		System.out.println("hp = " + User.get_hp());
		System.out.println("att = " + User.get_att());
		System.out.println("def = " + User.get_def());
		System.out.println("exp = " + User.get_exp());
		System.out.println("level = " + User.get_level());

		System.out.println("\nĳ���� ������ �Ϸ�Ǿ����ϴ�.\n");
		while(true) {
			System.out.println("���� ���� �����ϼ���.");
			System.out.println("1:���� ����, 2:����(�̴ϰ���), 3:���� ����");
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
					System.out.println("(1).level_1 ����|| (2).level_2 ����|| (3).level_3 ����||(4).�������� ������");
					System.out.print(">>");
					int player_ch = c.nextInt();
					permission(player_level, player_ch);
					if(player_ch==4) 
						break;
				}
			} else if (place == 2) {
				// ��������
				store();
				
			}else if (place == 3) {
				System.out.println("������ �����մϴ�. ��");
				break;
			}else {
				System.out.println("1,2�� �ش��ϴ� ���ڸ� �Է����ּ���.");
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
				System.out.print("� ������ �����Դϴ�~~>_<\n������ �ʿ��ϽŰ���?\n0.ü��, 1.���ݷ�, 2.����, -1.�ƹ��͵� �ʿ����� ����(���� ������)\n>>");
				int want = c.nextInt();
				if(want == -1) {
					System.out.println("�� ������~~>_<");
					System.out.println("\n");
					break;
				}
				System.out.print("���ӿ��� �̱�� �帮���� ����! � ������ �Ͻ� �ǰ���?\n0.����������, 1.����\n>>");
				int game = c.nextInt();
				if (game == 0) {
					minigame1 m1 = new minigame1();
					vs v = new vs(want, minigame1.result, 1);
				}else if (game == 1) {
					minigame2 m2 = new minigame2();
					vs v = new vs(want, minigame2.vs, 2);
				}else {
					System.out.println("������ �ΰ����Դϴ�~ 0 �Ǵ� 1�� �Է��ϼ���~!");
				}
			}
	}
	public static void GameStart() {

		Scanner in = new Scanner(System.in);

		Monster monster1 = new Monster();

		boolean play = true;
		int power;

		System.out.println("\n���Ͱ� ��Ÿ�����ϴ�.\n");

		while (play) {

			System.out.println("============player choice==============");
			System.out.printf("player hp: %d \n", player_hp);
			System.out.printf("%s hp: %d\n", monster1.name, monster1.HP);

			System.out.println("1.�����ϱ�, 2.����ϱ� ");
			System.out.print(">>");
			int player_choice = in.nextInt();

			switch (player_choice) {
			case 1:

				Random_Att r = new Random_Att();

				System.out.println("\n������ �����մϴ�.");
				int att_skill = r.att_skill * player_att;
				monster1.HP -= att_skill;
				

				System.out.printf("%d��ŭ ������ �Ͽ����ϴ�.\n", att_skill);

				// ���͵� ���� ����
				power = monster1.randomskill(1,att_skill);
				player_hp -= power;

				if (monster1.HP <= 0) {
					monster1.HP = 0;
					System.out.printf("%s�� �׾����ϴ�. \n", monster1.name);

					player_exp = monster1.randomreward(10);
					player_hp = monster1.randomreward(player_hp);
					player_att = monster1.randomreward(att_skill);

					System.out.println("\n===============reward=================");
					System.out.printf("<����> exp:%d player_hp: %d attack: %d\n", player_exp, player_hp, player_att);
					player_level = (player_exp / 10);
					System.out.printf("\n>>level %d �� �Ǿ����ϴ�.\n", player_level);
					play = false;
					break;
				}

				System.out.println("\n���� player�� hp = " + player_hp);
				System.out.println("���� monster1�� hp = " + monster1.HP);
				break;

			case 2:

				System.out.println("\n������ ������ ����մϴ�.");
				power = monster1.randomskill(2,0);

				System.out.println("\n���� player�� hp = " + player_hp);
				System.out.println("���� monster1�� hp = " + monster1.HP);
				break;

			}

			if (player_hp <= 0) {
				System.out.println("\n������ �������� �÷��̾ �׾����ϴ�.");
				play = false;
			}

		}
		

	}

	public static void permission(int level, int player_ch) {

		switch (player_ch) {
		case 1:
			System.out.println("level_1 ������ �����ϼ̽��ϴ�.");
			GameStart();
			break;
		// �����÷��� �Լ� ����
		case 2:
			if (level < 10) {
				System.out.println("level 10�̻� ���� ������ �����մϴ�.");
				// ���� �÷��� �Լ��� ��
				break;
			}
			System.out.println("level_2 ������ �����ϼ̽��ϴ�.");
			GameStart();
			break;
		case 3:
			if (level < 20) {
				System.out.println("level 20�̻���� ������ �����մϴ�.");
				break;
			}
			System.out.println("level_3 ������ �����ϼ̽��ϴ�.");
			GameStart();
		case 4:
			System.out.println(">>�������� �������ϴ�.");
		}
	}

}