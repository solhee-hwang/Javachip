import java.util.Scanner;

class Dungeon {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("==============Deongeon=================");
		System.out.println(">>���� ������ ȯ���մϴ�.");
		Monster monster1 = new Monster();
		int player_Lv = 1; // �ٸ� Ŭ�������� ������ �÷��̾��� ���� �켱 �ʱ�ȭ 0
		int player_hp = 200; // �ӽ��� �÷��̾��� hp
		int attack = 20;
		int power;
		int exp =0;
		boolean play = true;
		
		// �켱 ���⿡ �ӽ÷� play ȭ�� ���� ����rwar5
		while (play) {
			System.out.println("============player choice==============");
			System.out.printf("player hp: %d \n", player_hp);
			System.out.printf("%s hp: %d\n", monster1.name, monster1.HP);
			System.out.println("(1).�����ϱ�|| (2).����ϱ�|| (3).�������� ������ ");// ���� �߰��� �ҰŸ� ���� class ���� (�ӽ�)
			System.out.print(">");
			int player_choice = in.nextInt();
			switch (player_choice) {
			case 1:
				// �����Լ� ���� ���Ƿ� ����
				System.out.println(">>������ �����ϼ̽��ϴ�.");
				monster1.HP -= attack;
				System.out.printf("%d��ŭ ������ �Ͽ����ϴ�.\n",attack);
				power = monster1.randomskill(1,attack);
				player_hp -= power;
				if(monster1.HP<=0){
					monster1.HP = 0;
					System.out.printf("%s�� �׾����ϴ�. \n",monster1.name);
					int exp_1 =  monster1.randomreward(10);
					exp += exp_1;
					player_hp = monster1.randomreward(player_hp);
					attack = monster1.randomreward(attack);
					System.out.println("===============reward=================");
					System.out.printf("<����> exp:%d player_hp: %d attack: %d\n",exp_1,player_hp,attack);
					player_Lv = (exp/10);
					System.out.printf(">>level %d �� �Ǿ����ϴ�.\n",player_Lv);
					play = false;
					break;
				} 
				System.out.printf("player hp: %d \n", player_hp);
				System.out.printf("%s hp: %d \n", monster1.name, monster1.HP);
				
				// ���� Ŭ���� ��������� �� Ŭ�������� hp�� ��°ɷ� �ϱ� (monster Ŭ��������)
				
				break;
			case 2:
				System.out.println(">>�� �����ϼ̽��ϴ�.");
				power = monster1.randomskill(2,attack);
				System.out.printf("player hp: %d \n", player_hp);
				System.out.printf("%s hp: %d\n", monster1.name, monster1.HP);
				break;
			case 3:
				System.out.println(">>�������� �������ϴ�.");
				play = false;
			}
			if (player_hp <= 0) {
				System.out.println(">>�׾����ϴ�.");
				play = false;
			}
		}
	}

}