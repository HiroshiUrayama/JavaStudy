package kadai;

public class OtherPlanetPersonException extends Exception {

	//シリアライズ可能クラス PresidentExceptionは,
	//long 型の static final serialVersionUID フィールドを宣言していませんを回避するために宣言
	private static final long serialVersionUID = 1L;

	public OtherPlanetPersonException(String msg) {
		super(msg);
	}

}
