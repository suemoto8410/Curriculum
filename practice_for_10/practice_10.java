/*
問題.for文を使用し、以下のプログラムを作成してください。
	①変数iに1を代入
	②変数iに2ずつ足す処理を10回繰り返す。
		出力結果：  3
					5
					7
					9
					・
					・
					・
					21
					*/
package practice_for_10;

public class practice_10 {
	
	/*
	問題.for文を使用し、以下のプログラムを作成してください。
		①変数iに1を代入
		②変数iに2ずつ足す処理を10回繰り返す。
			出力結果：  3
						5
						7
						9
						・
						・
						・
						21
						*/
	public static void main(String[] args) {

		//int型変数iを宣言、iに2を10回まで足し続けるfor分を出力
		for(int i = 1; i / 2 < 10;) {
			
			i += 2;
			
			System.out.println(i);
		}
	}

}
