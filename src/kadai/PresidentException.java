package kadai;

//独自の例外クラス(社長に声を掛けられたら)
public class PresidentException extends Exception {

	//シリアライズ可能クラス PresidentExceptionは,
	//long 型の static final serialVersionUID フィールドを宣言していませんを回避するために宣言
	private static final long serialVersionUID = 1L;
	
	public PresidentException(String msg) {
		super(msg);
	}

	
}
