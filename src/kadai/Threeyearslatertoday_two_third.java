package kadai;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Threeyearslatertoday_two_third {
	void threeYearslatertoday() {
		int plus = 3;
		System.out.println("課題3　実行結果==================");

		//基準日をLocalDateTimeクラスで取得
		LocalDateTime dateTime = LocalDateTime.now();
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy年MM月dd日E曜日");

		//今日・3年後の今日
		LocalDate date = LocalDate.of(dateTime.getYear(),dateTime.getMonth(),dateTime.getDayOfMonth());
		LocalDate threeYearsLaterdate = date.plusYears(plus);

		//出力
		System.out.println("【今日】" + date.format(fmt));
		System.out.println("【3年後の今日】" + threeYearsLaterdate.format(fmt));
		System.out.println("課題3　終了=====================");
	}
}