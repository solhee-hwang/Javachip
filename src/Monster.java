import java.util.Random;

public class Monster {
	String dun_name1 = "leve_1";
	String name = "Lv1_monster";
	int HP = 50;
	int Striking_power = 10;

	int skill;
	int num;
	int reward = 5;

	public int RandomAttack() {
		Random ran_attack = new Random();
		ran_attack.setSeed(System.currentTimeMillis());
		int power = ran_attack.nextInt(5) * Striking_power;
		return power;
	}

	public int Defence(int attack) {
		HP += attack;
		int defence = 0;
		return defence;
	}

	public int randomskill(int choice, int attack) {
		Random Skill = new Random();
		Skill.setSeed(System.currentTimeMillis());
		skill = Skill.nextInt(2)+1;
		switch (skill) {
		case 1:
			num = RandomAttack();
			System.out.printf(">>%s가 (player name)을 공격합니다.\n", name);
			System.out.printf(">>%s가 %d의 데미지를 입혔습니다.\n", name, num);
			break;
		case 2:
			if(choice == 1){
				num = Defence(attack);
			
			}
			System.out.printf(">>%s가 (player name)의 공격을 방어합니다.\n", name);
			break;
		}
		return num;
	}
	public int randomreward(int nm){
		Random reward = new Random();
		reward.setSeed(System.currentTimeMillis());
		int ward = (reward.nextInt(5) + 1) * 1 * nm ;
		return ward;
	}

}