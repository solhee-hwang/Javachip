import java.util.Random;

public class boss{
	String dun_name1 = "level_3";
	String name = "boss";
	int HP = 500;
	int Striking_power = 50;
	int skill;
	int num;
	int reward = 50;

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
		int ward = (reward.nextInt(20) + 20)  * nm ;
		return ward;
	}

}