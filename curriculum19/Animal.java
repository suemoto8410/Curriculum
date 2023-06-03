package curriculum19;
// yyyy-MM-dd H:m:s 形式で表示するためのフォーマット
import java.text.SimpleDateFormat;
// 現在の日付を取得
import java.util.Date;

public class Animal {

	public static void main(String[] args) {

		/* ----------------------------------------------------
		Q1：Dogクラスを呼び出して変数に代入し、動物の名前をコンソールに出力してください。
	    ------------------------------------------------------- */

		// Dogクラスを生成
		Dog dog = new Dog();

		// Dogクラスからメンバ変数 animalName を呼び出し代入
		String animal = dog.animalName;

		// 代入した値を出力
		System.out.println(animal + "\n");

		/* ---------------------------------------------------
		Q2：Dogクラスを呼び出して変数に代入し、動物の数をコンソールに出力してください。
	    ------------------------------------------------------ */

		// Dogクラスのインスタンスを呼び出し、引数に 2 を渡す
		dog = new Dog(2);

		// Dogクラスからメンバ変数 animalNumber を呼び出し代入
		int animalNumber = dog.animalNumber;

		// 代入した値を出力
		System.out.println(animalNumber + "\n");
		
		/* ------------------------------------------------------------
		Q3 現在の日時を「yyyy-MM-dd H:m:s」形式で変数に代入して、コンソールに出力してください
	    --------------------------------------------------------------- */

		// Dateクラスを生成
		Date date = new Date();

		// SimpleDateFormatクラスを生成、年、月、日、時間を渡した場合表示を「yyyy-MM-dd H:m:s」形式に変換
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd H:m:s");

		// dateFormat に 現在の日時を渡し表示を「yyyy-MM-dd H:m:s」形式にし出力
		System.out.println(dateFormat.format(date));

	}

}
