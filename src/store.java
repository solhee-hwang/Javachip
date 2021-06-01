

import java.util.Scanner;
import java.util.Random;

class minigame1{
	static int get_some = 0;
	public minigame1(int w){
		Random r = new Random();
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
	private int Bingo_board[] = new int[25];  // ������ �迭 ����
	private int com_board[] = new int[25]; 
	public minigame2(int w){
		Random r = new Random();
		play();
		if(vs > 0) {
			System.out.println("�����մϴ�~!\n");
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
			System.out.println("���� ��ȸ��~!");
	}
	public static int getSome() {
		return get_some;
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
			System.out.print("��� ���� ����? \n ü��(0), ���ݷ�(1), ����(2) �Է� :");
			int want = in.nextInt();
			System.out.print("�ϰ� ���� ������? \n ����������(0), ����(1), ���� ������(-1)  �Է� :");
			int game = in.nextInt();
			if (game == 0) {
				minigame1 m1 = new minigame1(want);
				System.out.println(minigame1.get_some + " ��ŭ �����̽��ϴ�!!");
			}else if (game == 1) {
				minigame2 m2 = new minigame2(want);
				System.out.println(minigame2.get_some + " ��ŭ �����̽��ϴ�!!");
			}else if (game == -1) {
				System.out.println("�� ������~~>_<");
				break;
			}
		}
	}
}