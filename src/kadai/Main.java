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

		//リソース・リーク防止(Stackflow懸念を消しておきたいんだが...NosuchElementExceptionが出る)
		//scan.close();

		//入力した数値に応じて課題クラスに分岐する
		if(practiceNo == 1) {
			greetingHelloWorld_two_first.greeting();
		} else if(practiceNo == 2) {
			Increment_two_second.fourFor();
		} else if(practiceNo == 3) {
			Threeyearslatertoday_two_third.threeYearslatertoday();
		} else if(practiceNo == 13) {
			//一気に実行
			greetingHelloWorld_two_first.greeting();
			Increment_two_second.fourFor();
			Threeyearslatertoday_two_third.threeYearslatertoday();			
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
