import java.util.Random;

public class User_Play {

	Job j = new Job();

	String name = j.name;
	int player_hp = j.hp;
	int player_att = j.att;
	int player_def = j.def;
	int exp = j.exp;
	int player_level = j.level;
	int att_skill;

	// 플레이어 랜덤 공격
	public int Random_Att() {
		Random random_att = new Random();
		att_skill = random_att.nextInt(3) * player_att;
		return att_skill;
	}

	// 플레이어 방어
	public int Def(int att) {
		player_hp += att;
		return player_hp;
	}

}
