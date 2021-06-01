import java.util.Scanner;

public class PlayGame2 {

	static String player_name;
	static int player_hp;
	static int player_att;
	static int player_def;
	static int player_exp;
	static int player_level;

	public static void main(String[] args) {

		Scanner c = new Scanner(System.in);
		Job2 User = new Job2();

		System.out.println("\n������ �����մϴ�.\n");

		System.out.println("1:�ü�, 2:������, 3:����, 4:�ϻ���");
		System.out.println("ĳ���͸� �������ּ���.");
		System.out.print(">");
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
		System.out.println("���� ���� �����ϼ���.");
		System.out.println("1:���� ����, 2:����(�̴ϰ���)");
		System.out.print(">");
		int place = c.nextInt();

		player_name = User.get_name();
		player_hp = User.get_hp();
		player_att = User.get_att();
		player_def = User.get_def();
		player_exp = User.get_exp();
		player_level = User.get_level();

		if (place == 1) {

			System.out.println("\n============player choice==============");
			System.out.println("(1).level_1 ����|| (2).level_2 ����|| (3).level_3 ����||(4).�������� ������");
			System.out.print(">");
			int player_ch = c.nextInt();
			permission(player_level, player_ch);

		} else if (place == 2) {
			// ��������
			store s = new store();
		} else {
			System.out.println("1,2�� �ش��ϴ� ���ڸ� �Է����ּ���.");
		}

	}

	public static void GameStart() {

		Scanner in = new Scanner(System.in);

		Monster monster1 = new Monster();

		boolean play = true;

		System.out.println("\n���Ͱ� ��Ÿ�����ϴ�.\n");

		while (play) {

			System.out.println("\n�÷��̾��� ����");
			System.out.printf("player hp: %d \n", player_hp);

			System.out.println("1.�����ϱ�, 2.����ϱ� ");
			System.out.print(">");
			int player_choice = in.nextInt();

			switch (player_choice) {
			case 1:

				Random_Att r = new Random_Att();

				System.out.println("\n������ �����մϴ�.");
				int att_skill = r.att_skill * player_att;
				monster1.HP -= att_skill;

				System.out.printf("%d��ŭ ������ �Ͽ����ϴ�.\n", att_skill);

				// ���͵� ���� ����

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

				// ���� ���� �� �÷��̾� hp���̰� �ٽ� ȸ��?
				player_hp -= monster1.Striking_power;
				player_hp += monster1.Striking_power;

				System.out.println("\n���� player�� hp = " + player_hp);
				System.out.println("���� monster1�� hp = " + monster1.HP);
				break;

			}

			if (player_hp <= 0) {
				System.out.println("\n������ �������� �÷��̾ �׾����ϴ�.");
				play = false;
			}

		}
		;

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
			break;
		case 3:
			if (level < 20) {
				System.out.println("level 20�̻���� ������ �����մϴ�.");
				break;
			}
			System.out.println("level_3 ������ �����ϼ̽��ϴ�.");
		case 4:
			System.out.println(">>�������� �������ϴ�.");
		}
		;

	}

}
