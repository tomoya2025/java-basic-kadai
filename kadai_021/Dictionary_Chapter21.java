package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	
	private HashMap<String,String>words;
	
	public Dictionary_Chapter21() {
		words = new HashMap<>();
		
		words.put("apple", "りんご");
		words.put("peach","桃");
		words.put("banana","バナナ");
		words.put("lemon","レモン");
		words.put("pear","梨");
		words.put("kiwi","キウイ");
		words.put("strawberry","いちご");
		words.put("grape","ぶどう");
		words.put("muscat","マスカット");
		words.put("cherry","さくらんぼ");
		
	}
	
	public String getMeaning(String word) {
		if (words.containsKey(word)) {
			return word + "の意味は" + words.get(word);
		} else {
			return word + "は辞書に存在しません";
		}		
		
	}
	
	
}
