import java.util.Scanner;

class Dun {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("==============Deongeon=================");
		System.out.println(">>���� ������ ȯ���մϴ�.");
		Monster monster1 = new Monster();
		int player_Lv = 1; // �ٸ� Ŭ�������� ������ �÷��̾��� ���� �켱 �ʱ�ȭ 0
		int player_hp = 200; // �ӽ��� �÷��̾��� hp
		int power;
		boolean play = true;
		if (player_Lv <= 5) {
			System.out.printf(">>%s �� �����Ͽ����ϴ�.", monster1.name);
			System.out.println();
		}
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
				monster1.HP -= 20;
				System.out.printf("player hp: %d \n", player_hp);
				System.out.printf("%s hp: %d \n", monster1.name, monster1.HP);
				System.out.printf(">>%d��ŭ ���ݿ� �����Ͽ����ϴ�.", 20);//
				power = monster1.randomskill();
				// ���� Ŭ���� ��������� �� Ŭ�������� hp�� ��°ɷ� �ϱ� (monster Ŭ��������)
				player_hp -= power;
				break;
			case 2:
				System.out.println(">>�� �����ϼ̽��ϴ�.");
				// player_hp += power; // ���Ͱ� �����Ѹ�ŭ hp�� ä���� ����??
				System.out.printf("player hp: %d \n", player_hp);
				System.out.printf("%s hp: %d\n", monster1.name, monster1.HP);
				power = monster1.randomskill();

				player_hp -= power;
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