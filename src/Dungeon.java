import java.util.Scanner;

class Dungeon {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("==============Deongeon=================");
		System.out.println(">>던전 입장을 환영합니다.");
		Monster monster1 = new Monster();
		int player_Lv = 1; // 다른 클래스에서 가져올 플레이어의 레벨 우선 초기화 0
		int player_hp = 200; // 임시의 플레이어의 hp
		int attack = 20;
		int power;
		int exp =0;
		boolean play = true;
		
		// 우선 여기에 임시로 play 화면 구현 예정rwar5
		while (play) {
			System.out.println("============player choice==============");
			System.out.printf("player hp: %d \n", player_hp);
			System.out.printf("%s hp: %d\n", monster1.name, monster1.HP);
			System.out.println("(1).공격하기|| (2).방어하기|| (3).던전에서 나가기 ");// 공격 추가로 할거면 직업 class 에서 (임시)
			System.out.print(">");
			int player_choice = in.nextInt();
			switch (player_choice) {
			case 1:
				// 공격함수 실행 임의로 결정
				System.out.println(">>공격을 선택하셨습니다.");
				monster1.HP -= attack;
				System.out.printf("%d만큼 공격을 하였습니다.\n",attack);
				power = monster1.randomskill(1,attack);
				player_hp -= power;
				if(monster1.HP<=0){
					monster1.HP = 0;
					System.out.printf("%s가 죽었습니다. \n",monster1.name);
					int exp_1 =  monster1.randomreward(10);
					exp += exp_1;
					player_hp = monster1.randomreward(player_hp);
					attack = monster1.randomreward(attack);
					System.out.println("===============reward=================");
					System.out.printf("<보상> exp:%d player_hp: %d attack: %d\n",exp_1,player_hp,attack);
					player_Lv = (exp/10);
					System.out.printf(">>level %d 가 되었습니다.\n",player_Lv);
					play = false;
					break;
				} 
				System.out.printf("player hp: %d \n", player_hp);
				System.out.printf("%s hp: %d \n", monster1.name, monster1.HP);
				
				// 직업 클래스 만들어지면 그 클래스에서 hp를 깎는걸로 하기 (monster 클래스에서)
				
				break;
			case 2:
				System.out.println(">>방어를 선택하셨습니다.");
				power = monster1.randomskill(2,attack);
				System.out.printf("player hp: %d \n", player_hp);
				System.out.printf("%s hp: %d\n", monster1.name, monster1.HP);
				break;
			case 3:
				System.out.println(">>던전에서 나갔습니다.");
				play = false;
			}
			if (player_hp <= 0) {
				System.out.println(">>죽었습니다.");
				play = false;
			}
		}
	}

}