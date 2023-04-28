/*
	int型の配列aを作成してください。
	配列aに1～5の数字を格納してください。
	繰り返し処理を使用し、
	配列aの数字を順番に表示させてください。

	出力結果：1
			  2
			  3
			  4
			  5
*/
package array1_13;

public class Practice1_13 {
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		//int型配列aを宣言
		int[] a = {1, 2, 3, 4, 5};
		
		//変数iを宣言、forを用いてiの値が4になるまで出力
		for(int i = 0; i < 5; i++) {
			
			//配列aを変数iを用いて出力
			System.out.println(a[i]);
		}
		
	}

}