/*	
問題.for文を使用して九九の計算を出力してください。
	※出力例 	1×1=1 1×2=2…1×9=9
				2×1=2 2×2=4…2×9=18
						・
						・
						・
				9×1=9 9×2=18…9×9=81
				*/
package practice_for;

public class practice2 {
	
	/*	
	問題.for文を使用して九九の計算を出力してください。
		※出力例 	1×1=1 1×2=2…1×9=9
					2×1=2 2×2=4…2×9=18
							・
							・
							・
					9×1=9 9×2=18…9×9=81
					*/

	public static void main(String[] args) {
	
		
		//int型変数xを宣言、変数xに1を値9まで足し続けるfor分を定義
		for(int x = 1; x < 10; x++) {
			
			//int型変数yを宣言、変数yに1を値9まで足し続けるfor分を定義
			for(int y = 1; y < 10; y++) {
				
				//int型変数zを宣言、変数x,yを掛ける式を代入
				int z = x * y;
				
				//九九の計算を出力
				System.out.print(x + "×" + y + " = " + z + " ");
			}
			
			//九九の段ごとに改行を出力
			System.out.print("\r\n");
		}
	}
}
