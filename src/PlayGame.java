import java.util.Scanner;

public class PlayGame {

	public static void main(String[] args) {

		Scanner c = new Scanner(System.in);

		System.out.println("\n������ �����մϴ�.\n");
		Job j = new Job();
		j.job_info();

		System.out.println("1:�ü�, 2:������, 3:����, 4:�ϻ���");
		System.out.println("ĳ���͸� �������ּ���.");
		System.out.print(">");
		int job = c.nextInt();

		System.out.println("\nĳ���� ������ �Ϸ�Ǿ����ϴ�.\n");
		System.out.println("���� ���� �����ϼ���.");
		System.out.println("1:���� ����, 2:����(�̴ϰ���)");
		System.out.print(">");
		int place = c.nextInt();

		if (place == 1) {

			System.out.println("\n============player choice==============");
			System.out.println("(1).level_1 ����|| (2).level_2 ����|| (3).level_3 ����||(4).�������� ������");
			System.out.print(">");
			int player_ch = c.nextInt();
			permission(j.level, player_ch);

		} else if (place == 2) {
			// ��������
			store s = new store();
		} else {
			System.out.println("1,2�� �ش��ϴ� ���ڸ� �Է����ּ���.");
		}

	}

	public static void permission(int level, int player_ch) {

		switch (player_ch) {
		case 1:
			System.out.println("level_1 ������ �����ϼ̽��ϴ�.");
			break;
		// �����÷��� �Լ� ����
		case 2:
			if (level < 10) {
				System.out.println("level 10�̻� ���� ������ �����մϴ�.");
				// ���� �÷��� �Լ��� ��
				break;
			}
			System.out.println("level_2 ������ �����ϼ̽��ϴ�.");
			break;
		case 3:
			if (level < 20) {
				System.out.println("level 20�̻���� ������ �����մϴ�.");
				break;
			}
			System.out.println("level_3 ������ �����ϼ̽��ϴ�.");
		case 4:
			System.out.println(">>�������� �������ϴ�.");
		}
	}

}