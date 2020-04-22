package kadai;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		practiceCheck();
	}

	//課題選択メソッド(1~12が課題番号に対応、13は前処理、14は停止、再帰呼び出しする)
	static void practiceCheck() {
		System.out.println("課題番号を入力してください。");
		Scanner scan = new Scanner(System.in);

		//受け皿を用意する
		int practiceNo = scan.nextInt();

		//入力した数値に応じて課題クラスに分岐する
		if(practiceNo == 1) {
			GreetingHelloWorld_two_first greetingHello = new GreetingHelloWorld_two_first();
			greetingHello.greeting();
		} else if(practiceNo == 2) {
			Increment_two_second Inc = new Increment_two_second();
			Inc.fourFor();
		} else if(practiceNo == 3) {
			Threeyearslatertoday_two_third three = new Threeyearslatertoday_two_third();
			three.threeYearslatertoday();
		} else if(practiceNo == 4) {
			Judge_two_fourth judgeTwo = new Judge_two_fourth();
			judgeTwo.randomNumber();
		} else if(practiceNo == 5) {
			DisplayOfMap_two_fifth disp = new DisplayOfMap_two_fifth();
			disp.askDisplayNumber();
		} else if(practiceNo == 6) {
			WorkplaceCommunication workplace = new WorkplaceCommunication();
			System.out.println(workplace.greet("year!"));
		} else if(practiceNo == 13) {
			//処理を書く
		} else if(practiceNo == 14) {
			//終了させる
			System.out.println("処理を終了します、見ていただいてありがとうございました！");
			scan.close();
			return;
		} else {
			System.out.println("1~14までの数字を入れてね！");
		}
	practiceCheck();
	//閉じる時に開放しておく
	scan.close();
	}
}
//鍵を変えたので、テストでアップする