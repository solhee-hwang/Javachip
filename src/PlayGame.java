import java.util.Scanner;

public class PlayGame {

	public static void main(String[] args) {

		Scanner c = new Scanner(System.in);

		System.out.println("\n게임을 시작합니다.\n");
		Job j = new Job();
		j.job_info();

		System.out.println("1:궁수, 2:마법사, 3:전사, 4:암살자");
		System.out.println("캐릭터를 선택해주세요.");
		System.out.print(">");
		int job = c.nextInt();

		System.out.println("\n캐릭터 선택이 완료되었습니다.\n");
		System.out.println("어디로 갈지 선택하세요.");
		System.out.println("1:던전 입장, 2:상점(미니게임)");
		System.out.print(">");
		int place = c.nextInt();

		if (place == 1) {

			System.out.println("\n============player choice==============");
			System.out.println("(1).level_1 던전|| (2).level_2 던전|| (3).level_3 던전||(4).던전에서 나가기");
			System.out.print(">");
			int player_ch = c.nextInt();
			permission(j.level, player_ch);

		} else if (place == 2) {
			// 상점입장
			store s = new store();
		} else {
			System.out.println("1,2에 해당하는 숫자만 입력해주세요.");
		}

	}

	public static void permission(int level, int player_ch) {

		switch (player_ch) {
		case 1:
			System.out.println("level_1 던전에 입장하셨습니다.");
			break;
		// 던전플레이 함수 실행
		case 2:
			if (level < 10) {
				System.out.println("level 10이상 부터 입장이 가능합니다.");
				// 게임 플레이 함수로 감
				break;
			}
			System.out.println("level_2 던전에 입장하셨습니다.");
			break;
		case 3:
			if (level < 20) {
				System.out.println("level 20이상부터 입장이 가능합니다.");
				break;
			}
			System.out.println("level_3 던전에 입장하셨습니다.");
		case 4:
			System.out.println(">>던전에서 나갔습니다.");
		}
	}

}