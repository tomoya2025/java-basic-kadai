package kadai_026;

import java.util.Scanner;

public class JyankenExec_Chapter26 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		Jyanken_Chapter26 game = new Jyanken_Chapter26();
		
		System.out.println("自分のじゃんけんの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");

		String userChoice = scanner.nextLine();
		
		game.playGame(userChoice);
		
		scanner.close();
		
	}

}
