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
			System.out.println("============player choice==============");
			System.out.println("(1).level_1 ����|| (2).level_2 ����|| (3).level_3 ����||(4).�������� ������");
			System.out.print(">");
			int player_ch = c.nextInt();
			permission(j.level, player_ch);

			
		} else if (place == 2) {
			// ��������
		} else {
			System.out.println("1,2�� �ش��ϴ� ���ڸ� �Է����ּ���.");
		}

	}
	public static void permission(int level, int player_ch){
		
		switch(player_ch){
				case 1: 
					System.out.println("level 1 ������ �����ϼ̽��ϴ�.");
					break;
					//�����÷��� �Լ� ����
				case 2:
					if(level <10){
						System.out.println("level 10�̻� ���� ������ �����մϴ�.");
						//���� �÷��� �Լ��� ��
						break;
					}
					System.out.println("level_2 ������ �����ϼ̽��ϴ�.");
					break;
				case 3:
					if(level < 20){
						System.out.println("level 20�̻���� ������ �����մϴ�.");
						break;
					}
					System.out.println("level_3 ������ �����ϼ̽��ϴ�.");
				case 4:
					System.out.println(">>�������� �������ϴ�.");
				}
	}

}
