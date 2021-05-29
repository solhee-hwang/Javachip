import java.util.Scanner;

public class Job {

	String name;
	int hp;
	int att;
	int def;
	int exp;
	int level;

	public int job_info() {

		Archer a = new Archer("궁수", 100, 20, 30, 0, 1);
		Wizard b = new Wizard("마법사", 100, 10, 40, 0, 1);
		Warrior c = new Warrior("전사", 100, 30, 30, 0, 1);
		Assassin d = new Assassin("암살자", 90, 40, 20, 0, 1);

		Scanner in = new Scanner(System.in);

		System.out.println("게임에서 사용하게 될 캐릭터의 정보입니다.");
		a.jobinfo();
		b.jobinfo();
		c.jobinfo();
		d.jobinfo();

		return 0;

	}

	void jobinfo() {
		System.out.println("name = " + name);
		System.out.println("hp = " + hp);
		System.out.println("striking_power = " + att);
		System.out.println("defensive_power = " + def);
		System.out.println("experience = " + exp);
		System.out.println("level = " + level);
		System.out.println();
	}

}

class Archer extends Job {
	Archer(String name, int hp, int att, int def, int exp, int level) {
		this.name = name;
		this.hp = hp;
		this.att = att;
		this.def = def;
		this.exp = exp;
		this.level = level;
	}

}

class Wizard extends Job {
	Wizard(String name, int hp, int att, int def, int exp, int level) {
		this.name = name;
		this.hp = hp;
		this.att = att;
		this.def = def;
		this.exp = exp;
		this.level = level;
	}
}

class Warrior extends Job {
	Warrior(String name, int hp, int att, int def, int exp, int level) {
		this.name = name;
		this.hp = hp;
		this.att = att;
		this.def = def;
		this.exp = exp;
		this.level = level;
	}
}

class Assassin extends Job {
	Assassin(String name, int hp, int att, int def, int exp, int level) {
		this.name = name;
		this.hp = hp;
		this.att = att;
		this.def = def;
		this.exp = exp;
		this.level = level;
	}

}