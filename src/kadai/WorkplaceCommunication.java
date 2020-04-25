package kadai;

import java.util.Random;

//Communication_two_sixthインタフェースの実装クラス
public class WorkplaceCommunication implements Communication_two_sixth {

	//職場かどうかを格納するフィールド
	private Boolean isWorkPlace;
	
	//挨拶して来た人を格納するフィールド
	private String greetPerson;
	
	//コンストラクタ
	public WorkplaceCommunication() {
		//Randomクラスインスタンスを生成
		Random r = new Random();

		//int型の変数に入れる(0と1)/職場か否か
		int randomNum = r.nextInt(2);

		//int型の変数に入れる(0,1,2,3,4)
		int randomPerson = r.nextInt(5);
		
		//職場か否かを判断する
		if(randomNum == 0 ) {
			this.isWorkPlace = true;
		} else {
			this.isWorkPlace = false;
		}
		
		//話してきた人を判断する
		if(randomPerson == 0) {
			this.greetPerson = "ちえぺん";
		} else if(randomPerson == 1) {
			this.greetPerson = "ポメっち";
		} else if(randomPerson == 2) {
			this.greetPerson = "同僚";
		} else if(randomPerson == 3) {
			this.greetPerson = "社長";
		} else if(randomPerson == 4) {
			this.greetPerson = "火星人";
		}
		System.out.println("課題6開始==================");
	}
	
	@Override	
	//Communication_two_javaインタフェースのgreetメソッドの実装を記載
	public String greet() {
		if (this.isWorkPlace == true) {
			System.out.println("【職場】です。");
			return "Hello!";
		} else {
			System.out.println("【職場以外】です。");
			return "心の声「嫌だからやめておこう」";
		}
	}
	
	@Override
	//Communication_two_javaインタフェースのchoisePersonGreetメソッドの実装を記載
	public String choisePersonGreet() {
		System.out.println("挨拶してくれたのは" + greetPerson + "です");
		try {
			if(greetPerson.equals("ちえぺん")) {
				return "ひろぺん：おはよう、ちえぺん!!!";
			} else if(greetPerson.equals("ポメっち")) {
				return "ひろぺん：ワンワンワワン、ワワワンワワン!!";
			} else if(greetPerson.equals("同僚")) {
				return "浦山さん：おはようございます、今日も頑張りましょう！";
			} else if (greetPerson.equals("社長")) {
				throw new PresidentException("【例外】社長だった！");
			} else {
				throw new OtherPlanetPersonException("【例外】宇宙人!?");
			}

		} catch (PresidentException p) {
			System.out.println(p.getMessage());
			System.out.println("しゃ、社長！！おはようございます！！");
		} catch (OtherPlanetPersonException o) {
			System.out.println(o.getMessage());
			System.out.println("◎☓△□◆#!!");
		} 
		//例外時はreturnしないのでここで処理
		return "想定外だったけどなんとかやり過ごせた・・・";
	}
	
	//処理終了メソッド
	void practiceSixEnd() {
		System.out.println("課題6終了==================");
	}
}