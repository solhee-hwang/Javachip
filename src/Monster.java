import java.util.Random;

public class Monster {
	String name = "Lv1_monster";
	int HP = 100;
	int Striking_power = 10;
	int defensive_power = 3;
	int skill;
	int num;

	public int RandomAttack() {
		Random ran_attack = new Random();
		ran_attack.setSeed(System.currentTimeMillis());
		int power = ran_attack.nextInt(10) * Striking_power;
		return power;
	}

	public int Defence() {
		Random ran_defence = new Random();
		ran_defence.setSeed(System.currentTimeMillis());
		int defence = ran_defence.nextInt(10) * defensive_power;

		return defence;
	}

	public int randomskill() {
		Random Skill = new Random();
		Skill.setSeed(System.currentTimeMillis());
		skill = Skill.nextInt(3);
		switch (skill) {
		case 1:
			num = RandomAttack();
			System.out.printf(">>%s가 (player name)을 공격합니다.\n", name);
			System.out.printf(">>%s가 %d의 데미지를 입혔습니다.\n", name, num);
			break;
		case 2:
			num = Defence();
			System.out.printf(">>%s가 (player name)의 공격을 방어합니다.\n", name);
			System.out.printf(">>%s가 %d만큼 방어했습니다.\n", name, num);
			break;
		}
		if (skill == 2) {
			num = 0;
		}
		return num;
	}
}