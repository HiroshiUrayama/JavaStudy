package kadai;

//Communication_two_sixthインタフェースの実装クラス
public class WorkplaceCommunication implements Communication_two_sixth {
	@Override
	public String greet(String aisatu) {
		return aisatu;
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
