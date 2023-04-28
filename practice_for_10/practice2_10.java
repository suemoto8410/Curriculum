/*	
問題.for文を使用して九九の計算を出力してください。
	※出力例 	1×1=1 1×2=2…1×9=9
				2×1=2 2×2=4…2×9=18
						・
						・
						・
				9×1=9 9×2=18…9×9=81
				*/
package practice_for_10;

public class practice2_10 {

	public static void main(String[] args) {
		
		//int型変数numを宣言、変数numに1を値9まで足し続けるfor分を定義
		for(int num = 1; num < 10; num++) {
			
			//int型変数num2を宣言、変数num2に1を値9まで足し続けるfor分を定義
			for(int num2 = 1; num2 < 10; num2++) {
				
				//int型変数productを宣言、変数x,yの積を代入
				int product = num * num2;
				
				//九九の計算を出力
				System.out.print(num + "×" + num2 + " = " + product + " ");
			}
			
			//九九の段ごとに改行を出力
			System.out.print("\r\n");
		}
	}
}
