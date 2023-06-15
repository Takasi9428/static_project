package practice;

public class PracticeSwitch {

	public static void main(String[] args) {
		// array準備
		int[] array = { 1, 2, 3, 4, 5, 1, 3, 2, 4, 5 };
		// arrayをfor文でまわすi
		for (int i = 0; i <= 10; i++) {
			switch (array[i]) {
			case 1:
				System.out.println("勇者");
				break;

			case 2:
				System.out.println("バトルマスタ");
				break;

			case 3:
				System.out.println("パラディン");
				break;

			case 4:
				System.out.println("海賊");
				break;

			case 5:
				System.out.println("魔法剣士");
				break;
			}
		}
	}
}