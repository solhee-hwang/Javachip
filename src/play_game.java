import java.util.Scanner;

public class play_game {

	public static void main(String[] args) {

		job j = new job();
		System.out.println("���ӿ� �����Ͽ����ϴ�.");

		Scanner c = new Scanner(System.in);
		System.out.println("1:�ü�, 2:������, 3:����, 4:�ϻ���");
		System.out.print("ĳ���͸� �������ּ���. -> ");
		int job = c.nextInt();

		System.out.println("ĳ���� ������ �Ϸ�Ǿ����ϴ�.");
		System.out.println("���� ���� �����ϼ���.");
		System.out.print("1:���� ����, 2:����(�̴ϰ���) -> ");
		int place = c.nextInt();

		if (place == 1) {
			// ��������
		} else if (place == 2) {
			// ��������
		} else {
			System.out.println("1,2�� �ش��ϴ� ���ڸ� �Է����ּ���.");
		}

	}

}
