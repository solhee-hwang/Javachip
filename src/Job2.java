
public class Job2 {

	String name;
	int hp;
	int att;
	int def;
	int exp;
	int level;

	public String get_name() {
		return name;
	}

	public int get_hp() {
		return hp;
	}

	public int get_att() {
		return att;
	}

	public int get_def() {
		return def;
	}

	public int get_exp() {
		return exp;
	}

	public int get_level() {
		return level;
	}

}

class Archer2 extends Job2 {

	static String name = "궁수";
	int hp = 100;
	int att = 10;
	int def = 20;
	int exp = 0;
	int level = 1;

	public String get_name() {
		return name;
	}

	public int get_hp() {
		return hp;
	}

	public int get_att() {
		return att;
	}

	public int get_def() {
		return def;
	}

	public int get_exp() {
		return exp;
	}

	public int get_level() {
		return level;
	}

}

class Wizard2 extends Job2 {

	String name = "마법사";
	int hp = 100;
	int att = 5;
	int def = 20;
	int exp = 0;
	int level = 1;

	public String get_name() {
		return name;
	}

	public int get_hp() {
		return hp;
	}

	public int get_att() {
		return att;
	}

	public int get_def() {
		return def;
	}

	public int get_exp() {
		return exp;
	}

	public int get_level() {
		return level;
	}

}

class Warrior2 extends Job2 {

	String name = "전사";
	int hp = 100;
	int att = 15;
	int def = 10;
	int exp = 0;
	int level = 1;

	public String get_name() {
		return name;
	}

	public int get_hp() {
		return hp;
	}

	public int get_att() {
		return att;
	}

	public int get_def() {
		return def;
	}

	public int get_exp() {
		return exp;
	}

	public int get_level() {
		return level;
	}

}

class Assassin2 extends Job2 {

	String name = "암살자";
	int hp = 90;
	int att = 20;
	int def = 5;
	int exp = 0;
	int level = 1;

	public String get_name() {
		return name;
	}

	public int get_hp() {
		return hp;
	}

	public int get_att() {
		return att;
	}

	public int get_def() {
		return def;
	}

	public int get_exp() {
		return exp;
	}

	public int get_level() {
		return level;
	}

}