import java.util.Scanner;

public class play_game {

	public static void main(String[] args) {

		job j = new job();
		System.out.println("게임에 참가하였습니다.");

		Scanner c = new Scanner(System.in);
		System.out.println("1:궁수, 2:마법사, 3:전사, 4:암살자");
		System.out.print("캐릭터를 선택해주세요. -> ");
		int job = c.nextInt();

		System.out.println("캐릭터 선택이 완료되었습니다.");
		System.out.println("어디로 갈지 선택하세요.");
		System.out.print("1:던전 입장, 2:상점(미니게임) -> ");
		int place = c.nextInt();

		if (place == 1) {
			// 던전입장
		} else if (place == 2) {
			// 상점입장
		} else {
			System.out.println("1,2에 해당하는 숫자만 입력해주세요.");
		}

	}

}
