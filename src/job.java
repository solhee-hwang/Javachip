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

		Archer a = new Archer("�ü�", 100, 20, 30, 0, 1);
		Wizard b = new Wizard("������", 100, 10, 40, 0, 1);
		Warrior c = new Warrior("����", 100, 30, 30, 0, 1);
		Assassin d = new Assassin("�ϻ���", 90, 40, 20, 0, 1);

		Scanner in = new Scanner(System.in);

		System.out.println("1:�ü�, 2:������, 3:����, 4:�ϻ���");
		System.out.print("ĳ������ ������ ������ ĳ���Ϳ� �ش��ϴ� ���ڸ� �Է����ּ���. -> ");
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
			System.out.println("1~4�� �ش��ϴ� ���ڸ� �Է����ּ���.");
		}
	}

}
