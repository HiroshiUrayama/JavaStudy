package kadai;

//20200422アクセス修飾子を無名に変更
class Increment_two_second {
	public void fourFor() {
		int sum = 0;
		for(int i = 1 ; i < 11 ; i++) {
			sum += i;
		}
		System.out.println("課題2　実行結果==================");
		System.out.println("1から10までの和は" + sum + "です！");
		System.out.println("課題2　終了=====================");
	}
}
