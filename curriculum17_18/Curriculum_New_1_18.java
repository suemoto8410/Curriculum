package curriculum17_18;

import java.util.Arrays;
import java.util.Random;

public class Curriculum_New_1_18{
	/* ------------------------------------------------------------------------------------------------------
	   Q1：引数に文字列型と整数型をいれてコンソールに「Hello JavaSE 11」と出力するメソッドを作成してください。
 	   ------------------------------------------------------------------------------------------------------ */
	
	// 入力された文字と整数を出力するメソッド
	private static void printHello(String hello, int number) {
		
		// 入力された値を組み合わせ出力
		System.out.println(hello + number + "\n");
		
	}
	
	/* ------------------------------------------------------------------------------------------
	   Q2：引数に整数を渡すと渡した値同士を乗算しコンソールに出力するメソッドを作成してください
	   ------------------------------------------------------------------------------------------ */
	// 値を乗算し出力するメソッド
	private static void printProduct(int num1, int num2) {
		
		// int型変数 proInt を宣言、num1 と num2 を乗算し代入
		int proInt = num1 * num2;
		
		// 入力された値の積を出力
		System.out.println(proInt + "\n");
		
	}
	
	/* ----------------------------------------------------------------------------------------------------
	   Q3：引数として整数の配列を渡すと、受け取った値を順番にコンソールに出力するメソッドを作成してください
	   ---------------------------------------------------------------------------------------------------- */
	
	// 整数の配列を渡すと、値を順番に出力するメソッド
	private static void printArray(int[] arr) {
		
		// 入力された配列を出力
		System.out.println(Arrays.toString(arr) + "\n");
		
	}
	
	
	/* ----------------------------------------------------------------------------------------------
	   Q4：Q2をオーバーロードして引数を小数2つに変更し、引数同士を和算しコンソールに出力してください。
	   ---------------------------------------------------------------------------------------------- */
	
	// Q2で作成した整数を乗算するメソッドをオーバーロード
	private static void printProduct(double dou1, double dou2) {
		
		// double型変数 proDouble を宣言、dou1 と dou2 を乗算し代入
		double proDouble = Math.round(dou1 * dou2 * 100) / 100;
		
		// 入力された値の積を出力
		System.out.println(proDouble + "\n");
		
	}
	
	/* ----------------------------------------------------------------------------------
		Q5：引数に整数を渡すと、1～100までのランダムな数字を引数の回数分格納して
	 	格納した値を順番にコンソールで出力後、格納した値を返すメソッドを作成してください。
	 	※0は出力＆格納しないようにしてください。
	   ---------------------------------------------------------------------------------- */
	
	// 配列に格納して出力し、配列 randomArrayに値を返すメソッド
	private static int[] printRandom(int r) {
		
		// Randomクラスの生成
		Random rnd = new Random();
		
		// 配列 randomArray の格納数を 入力された値分追加
		int[] randomArray = new int[r];
		
			// for文を用いて乱数を入力された値分生成
		for (int y = 0; y <  r;  y++) {
			
			// int型変数 randomNum を宣言, 乱数1～100を生成し代入
			int randomNum = rnd.nextInt(100) + 1;
			
			// 変数 randomNum の値を配列randomArrayに格納
			randomArray[y] = randomNum;
			
		}
		
		// Q3で作成した配列を出力するメソッドを活用
		printArray(randomArray);
		
		// 配列 randomArray に生成された乱数を格納した配列を返す
		return randomArray;
		
	}
	
	/* --------------------------------------------------------------------------------------------------------------------------------
		Q6：引数にQ5で作成したメソッドの返り値を受け取り、受け取った配列の要素の平均値をコンソールに出力するメソッドを作成してください。
		※小数点以下も表示されるようにしてください。
	   ------------------------------------------------------------------------------------------------------------------------------ */
	
	// 入力された配列の平均値を計算し出力し変数 average に値を返すメソッド
	
	private static double printAverage(int[] array) {
		
		// 変数 average に入力された配列の要素の平均値を代入
		double average = (double)Math.round(Arrays.stream(array).average().getAsDouble() * 100) /100;
		
		// 平均値を出力
		System.out.println(average + "\n");
		
		// 平均値を 変数 average に返す
		
		return average;
		
	}
	
	/* ---------------------------------------------------------------------------------------------------------------------------------
	   Q7：引数にQ6で作成したメソッドの返り値を受け取り、受け取った値が50以上ならばtrueそれ以外はfalseを返しコンソールに出力してください
	   --------------------------------------------------------------------------------------------------------------------------------- */
	
	// 入力された値が50以上ならtrueそれ以外ならfalseを出力するメソッドを作成
	private static void printBoolean(double ave) {
		
		// boolean型変数 bool を宣言
		boolean bool;
		
		// 入力された値が50以上ならtrueそれ以外ならfalseを出力するif文を作成
		if(ave >= 50) {
			
			// 50以上の場合、変数 bool にtrueを代入
			bool = true;
			
		} else {
			
			// それ以外はfalseを変数 bool に代入
			bool = false;
			
		}
		
		// 変数 bool に代入された値を出力
		System.out.println(bool);
		
	}
	
	public static void main(String[] args) {
    // 作成したメソッドをここで呼び出してください
		
		// Q1で作成したメソッドの出力
		System.out.println("Q1：引数に文字列型と整数型をいれてコンソールに");
		System.out.println("「Hello JavaSE 11」と出力するメソッドを作成してください。\n");
		printHello("Hello JavaSE ", 11);
		
		//  Q2で作成したメソッドの出力
		System.out.println("Q2：引数に整数を渡すと渡した値同士を");
		System.out.println("乗算しコンソールに出力するメソッドを作成してください。\n");
		printProduct(2, 4);
		
		// Q3で作成したメソッドの出力と配列arrayの宣言
		int[] array = {3, 2, 5, 3, 6};
		System.out.println("Q3：引数として整数の配列を渡すと、受け取った値を");
		System.out.println("順番にコンソールに出力するメソッドを作成してください\n");
		printArray(array);
		
		// Q4で作成したメソッドの出力
		System.out.println("Q4：Q2をオーバーロードして引数を小数2つに変更し、");
		System.out.println("引数同士を和算しコンソールに出力してください。\n");
		printProduct(3.13, 3.21);
		
		// Q5で作成したメソッドの出力
		System.out.println("Q5：引数に整数を渡すと、1～100までのランダムな数字を");
		System.out.println("引数の回数分格納して格納した値を順番にコンソールで出力後、");
		System.out.println("格納した値を返すメソッドを作成してください。\n");
		// 生成された乱数を受け取る為、int型配列 randomArray を宣言
		int[] randomArray = printRandom(5);
		
		// Q6で作成したメソッドの出力
		System.out.println("Q6：引数にQ5で作成したメソッドの返り値を受け取り、");
		System.out.println("受け取った配列の要素の平均値をコンソールに");
		System.out.println("出力するメソッドを作成してください。\n");
		// メソッド printAverage で生成された平均値を受け取る為、double型変数 average を宣言
		double average = printAverage(randomArray);
		
		// Q7で作成したメソッドの出力
		System.out.println("Q7：引数にQ6で作成したメソッドの返り値を受け取り、");
		System.out.println("受け取った値が50以上ならばtrueそれ以外は");
		System.out.println("falseを返しコンソールに出力してください\n");
		printBoolean(average);
		
	}
	
}