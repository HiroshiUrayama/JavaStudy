package kadai;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class DisplayOfMap {
	public static void askDisplayNumber() {
		//先にmapにリストを入れておく
		Map<Integer , String> map = new HashMap<Integer , String>();
		map.put(1, "ちえぺん");
		map.put(2, "ひろぺん");
		map.put(3, "ぺんちゃん");
		map.put(4, "ぽめっち");
		map.put(5, "しばっち");
		
		//表示数はいくつ？って標準入力で聞く
		System.out.println("課題5／表示するリスト数を入力してね！(1～5)");
		Scanner scan = new Scanner(System.in);
		int inputNum = scan.nextInt();
		
		//表示するMapのKeyを取得するための乱数生成
		Random r = new Random();
		System.out.println("課題5　実行結果==================");

		for(int i = 0; i < inputNum; i++) {
			int randomNumber = r.nextInt(5) + 1; //1から5まで
			System.out.println(randomNumber + "番目は／" + map.get(randomNumber) + "だよ！");
		}
		System.out.println("課題5　終了=====================");
	}
}