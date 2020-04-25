package kadai;

import java.util.Random;

//Communication_two_sixthインタフェースの実装クラス
public class WorkplaceCommunication implements Communication_two_sixth {
	//職場かどうかを判断するフィールド
	private Boolean isWorkPlace;
	
	//コンストラクタ
	public WorkplaceCommunication() {
		//Randomクラスを生成
		Random r = new Random();

		//int型の変数に入れる
		int randomNum = r.nextInt(2);
		
		//職場か否かを判断する
		if(randomNum == 0 ) {
			this.isWorkPlace = true;
		} else {
			this.isWorkPlace = false;
		}
	}
	
	@Override
	public String greet(boolean doko) {
		if (this.isWorkPlace == true) {
			return "Hello!";
		} else {
			return "心の声「嫌だからやめておこう」";
		}
	}
}
//職場にいるかどうかは、
	//引数
	//ランダムに生成して判断する

//WorkplaceCommunicationクラスで
//新しく話しかけてきた人が誰か(同僚とか上司とか)で応答を返すか、例外を返すような処理を作ってみよう(引数)
	//引数はStringでもbooleanでもOK
	//戻り値はStringにでもしておいて、適当に返すかどうかはお任せ。
	//例外にする対象もお任せ。
	//例外クラスは自作も可能である。何か面白い例外をかってに自作してもいいし、既存の例外クラスを使ってもいい。
	//とにかく例外をthrowする。

//MyException/自作クラス
	//PresidentException
	//iseijinException
//Error
