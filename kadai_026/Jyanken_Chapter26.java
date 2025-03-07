package kadai_026;

import java.util.HashMap;

public class Jyanken_Chapter26 {

	public String getMyChoice(String choice) {
		
		HashMap <String, String> jyanken = new HashMap<>();
		jyanken.put("r", "グー");
		jyanken.put("s","チョキ");
		jyanken.put("p", "パー");
		
		String myChoice = jyanken.getOrDefault(choice, "無効な選択");
		
		if (myChoice.equals("無効な選択")) {
			System.out.println("エラー: 無効な選択です。r(グー), s(チョキ), p(パー)を選んでください。");
		}
		return myChoice;
	}
	
	public String getRandomChoice(){
		String[] choices = {"グー", "チョキ", "パー"};
		int index = (int) Math.floor(Math.random() *3);
		
		return choices[index];
    }
	
	
	public void playGame(String userChoice){
		String myChoice = getMyChoice(userChoice);
		
		if(myChoice.equals("無効な選択")) {  
			System.out.println("無効な選択です。r(グー),s(チョキ),p(パー)のいずれかを選んでください");
			return;
	    }
		
		String computerChoice = getRandomChoice();
		
		System.out.println("自分の手は" + myChoice + "," + "対戦相手の手は" + computerChoice);
		
		if (myChoice.equals(computerChoice)) {
			System.out.println("あいこです");
		} else if((myChoice.equals("グー") && computerChoice.equals("チョキ")) ||
				  (myChoice.equals("チョキ") && computerChoice.equals("パー")) ||
		          (myChoice.equals("パー") && computerChoice.equals("グー"))) {
		    System.out.println("自分の勝ちです");
		} else {
			System.out.println("自分の負けです");
		}
	 }


}
