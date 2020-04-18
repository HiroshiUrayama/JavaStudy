package kadai;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("課題番号を入力してください。");
		Scanner scan = new Scanner(System.in);
		if(scan.nextInt() == 1) {
			greetingHelloWorld_two_first.greeting();
		}
	}
}
