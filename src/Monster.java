import java.util.Random;

public class Monster {
	String dun_name1 = "leve1_1";
	String name = "Lv1_monster";
	int dun_level =1;
	int HP = 70;
	int Striking_power = 5;

	int skill;
	int num;
	int rewardd = 3;

	public int RandomAttack() {
		Random ran_attack = new Random();
		ran_attack.setSeed(System.currentTimeMillis());
		int power =( ran_attack.nextInt(3)+1) * Striking_power;
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
		skill = Skill.nextInt(4)+1;
		switch (skill) {
		case 1:
		case 2:
		case 3:
			num = RandomAttack();
			
			if(choice == 2){
				System.out.println(">>�÷��̾��� ���� ���� ������ �����߽��ϴ�.");
			}else{
				System.out.printf(">>%s�� �÷��̾ �����մϴ�.\n", name);
				System.out.printf(">>%s�� %d�� �������� �������ϴ�.\n", name, num);
			}
			
			break;
		case 4:
			if(choice == 1){
				num = Defence(attack);
			
			}else{
				
			}
			System.out.printf(">>%s�� �÷��̾��� ������ ����մϴ�.\n", name);
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