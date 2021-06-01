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

		System.out.println("\n게임을 시작합니다.\n");

		System.out.println("1:궁수, 2:마법사, 3:전사, 4:암살자");
		System.out.println("캐릭터를 선택해주세요.");
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

		System.out.println("\n선택한 캐릭터의 정보");
		System.out.println("name = " + User.get_name());
		System.out.println("hp = " + User.get_hp());
		System.out.println("att = " + User.get_att());
		System.out.println("def = " + User.get_def());
		System.out.println("exp = " + User.get_exp());
		System.out.println("level = " + User.get_level());

		System.out.println("\n캐릭터 선택이 완료되었습니다.\n");
		System.out.println("어디로 갈지 선택하세요.");
		System.out.println("1:던전 입장, 2:상점(미니게임)");
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
			System.out.println("(1).level_1 던전|| (2).level_2 던전|| (3).level_3 던전||(4).던전에서 나가기");
			System.out.print(">");
			int player_ch = c.nextInt();
			permission(player_level, player_ch);

		} else if (place == 2) {
			// 상점입장
			store s = new store();
		} else {
			System.out.println("1,2에 해당하는 숫자만 입력해주세요.");
		}

	}

	public static void GameStart() {

		Scanner in = new Scanner(System.in);

		Monster monster1 = new Monster();

		boolean play = true;

		System.out.println("\n몬스터가 나타났습니다.\n");

		while (play) {

			System.out.println("\n플레이어의 선택");
			System.out.printf("player hp: %d \n", player_hp);

			System.out.println("1.공격하기, 2.방어하기 ");
			System.out.print(">");
			int player_choice = in.nextInt();

			switch (player_choice) {
			case 1:

				Random_Att r = new Random_Att();

				System.out.println("\n공격을 시작합니다.");
				int att_skill = r.att_skill * player_att;
				monster1.HP -= att_skill;

				System.out.printf("%d만큼 공격을 하였습니다.\n", att_skill);

				// 몬스터도 공격 실행

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

				// 몬스터 공격 시 플레이어 hp깎이고 다시 회복?
				player_hp -= monster1.Striking_power;
				player_hp += monster1.Striking_power;

				System.out.println("\n현재 player의 hp = " + player_hp);
				System.out.println("현재 monster1의 hp = " + monster1.HP);
				break;

			}

			if (player_hp <= 0) {
				System.out.println("\n몬스터의 공격으로 플레이어가 죽었습니다.");
				play = false;
			}

		}
		;

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
			break;
		case 3:
			if (level < 20) {
				System.out.println("level 20이상부터 입장이 가능합니다.");
				break;
			}
			System.out.println("level_3 던전에 입장하셨습니다.");
		case 4:
			System.out.println(">>던전에서 나갔습니다.");
		}
		;

	}

}
