package kadai;

import java.util.Random;

public class Judge_two_fourth {
	static void randomNumber() {
 
		//乱数を生成する(0or1)
		Random r = new Random();
		int rNum = r.nextInt(2);

		//実行部分(引数に乱数を設定)
		System.out.println("課題4　実行結果==================");
		judgeRandomNumber(rNum);
		System.out.println("課題4　終了=====================");

	}
	
	//int型のrNumを引数に取って真偽を判定するメソッド
	private static void judgeRandomNumber(int rNumber) {
		if(rNumber == 0) {
			System.out.println("引数は" + rNumber + " 【結果：真】");
		} else {
			System.out.println("引数は" + rNumber + " 【結果：偽】");
		}
	}
}
