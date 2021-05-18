import java.util.Scanner;

public class job {

	String name;
	int hp;
	int att;
	int def;
	int exp;
	int level;

	void jobinfo() {
		System.out.println("name = " + name);
		System.out.println("hp = " + hp);
		System.out.println("striking_power = " + att);
		System.out.println("defensive_power = " + def);
		System.out.println("experience = " + exp);
		System.out.println("level = " + level);
	}

}

class Archer extends job {
	Archer(String name, int hp, int att, int def, int exp, int level) {
		this.name = name;
		this.hp = hp;
		this.att = att;
		this.def = def;
		this.exp = exp;
		this.level = level;
	}
}

class Wizard extends job {
	Wizard(String name, int hp, int att, int def, int exp, int level) {
		this.name = name;
		this.hp = hp;
		this.att = att;
		this.def = def;
		this.exp = exp;
		this.level = level;
	}
}

class Warrior extends job {
	Warrior(String name, int hp, int att, int def, int exp, int level) {
		this.name = name;
		this.hp = hp;
		this.att = att;
		this.def = def;
		this.exp = exp;
		this.level = level;
	}
}

class Assassin extends job {
	Assassin(String name, int hp, int att, int def, int exp, int level) {
		this.name = name;
		this.hp = hp;
		this.att = att;
		this.def = def;
		this.exp = exp;
		this.level = level;
	}

	public void job_info() {

		Archer a = new Archer("궁수", 100, 20, 30, 0, 1);
		Wizard b = new Wizard("마법사", 100, 10, 40, 0, 1);
		Warrior c = new Warrior("전사", 100, 30, 30, 0, 1);
		Assassin d = new Assassin("암살자", 90, 40, 20, 0, 1);

		Scanner in = new Scanner(System.in);

		System.out.println("1:궁수, 2:마법사, 3:전사, 4:암살자");
		System.out.print("캐릭터의 정보를 보려면 캐릭터에 해당하는 숫자를 입력해주세요. -> ");
		int choice = in.nextInt();

		if (choice == 1) {
			a.jobinfo();
		} else if (choice == 2) {
			b.jobinfo();
		} else if (choice == 3) {
			c.jobinfo();
		} else if (choice == 4) {
			d.jobinfo();
		} else {
			System.out.println("1~4에 해당하는 숫자만 입력해주세요.");
		}
	}

}
