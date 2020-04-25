package kadai;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		//再帰呼び出しで繰り返させる
		practiceCheck();
	}

	//課題選択メソッド(1~6が課題番号に対応、7は停止)
	static void practiceCheck() {
		System.out.println("課題番号を入力してください。");
		Scanner scan = new Scanner(System.in);

		//入力した課題番号を格納する
		int practiceNo = scan.nextInt();

		//入力した数値に応じて課題クラスに分岐
		if(practiceNo == 1) {
			//課題1：String型変数greetに挨拶を格納し、sysoで出力する
			GreetingHelloWorld_two_first greetingHello = new GreetingHelloWorld_two_first();
			greetingHello.greeting();
			
		} else if(practiceNo == 2) {
			//課題2：for文を用いて1~10までの和を出力する
			Increment_two_second Inc = new Increment_two_second();
			Inc.fourFor();
			
		} else if(practiceNo == 3) {
			//課題3：今日の日付曜日と3年後の今日の日付曜日の出力
			Threeyearslatertoday_two_third three = new Threeyearslatertoday_two_third();
			three.threeYearslatertoday();

		} else if(practiceNo == 4) {
			//課題4：ランダム値を生成値によって"真""偽"を切り分ける
			Judge_two_fourth judgeTwo = new Judge_two_fourth();
			judgeTwo.randomNumber();
			
		} else if(practiceNo == 5) {
			//課題5：Mapに値を格納し、選択した番号でリスト表示個数を変更(ランダム順番)
			DisplayOfMap_two_fifth disp = new DisplayOfMap_two_fifth();
			disp.askDisplayNumber();
			
		} else if(practiceNo == 6) {
			//課題6-1：職場 or それ以外で挨拶するかしないかを切り分ける
			WorkplaceCommunication workplace = new WorkplaceCommunication();
			System.out.println(workplace.greet());
			System.out.println("職場か否か==================");
			System.out.println("");
			System.out.println("例外と話し掛けてくれた人========");
			
			//課題6-2：挨拶してきた人で対応を変える／社長と火星人は例外処理
			System.out.println(workplace.choisePersonGreet());
			workplace.practiceSixEnd();
			
		} else if(practiceNo == 7) {
			//7：終了
			System.out.println("処理を終了します、見ていただいてありがとうございました！");
			scan.close();
			return;
		} else {
			System.out.println("1~7までの数字を入れてね！");
		}
	practiceCheck();
	//閉じる時に開放しておく
	scan.close();
	}
}