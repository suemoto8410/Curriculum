package curriculum_B;

public class Qes5 {

	public static void main(String[] args) {
		
		// 値が1から9になるまで繰り返す
		for (int num2 = 1; num2 <= 9; num2++) {
			
			// 値が1から20になるまで繰り返す
			for (int num1 = 1; num1 <= 20; num1++) {
				
				// 値毎に表示を変えるため変数を宣言
				String numStr1;
				
				if (num1 >9) {
					
					// 引数が10以上の時代入、表示を「010」形式に変換し代入
					numStr1 = String.format("%03d", num1);
					
				} else {
					
					// 引数が10未満の時代入、表示を「01」形式に変換し代入
					numStr1 = String.format("%02d", num1);
					
				}
				
				// 表示を「01」形式にする
				String numStr2 = String.format("%02d", num2);
				
				// かけ算の結果を代入
				int product = num1 * num2;
				
				// かけ算の結果毎に表示を変えるため変数を宣言、
				// 結果が10未満の時「001」、100未満の時「010」に変換し代入
				
				String productStr = String.format("%03d", product);
				
				// かけ算の結果を式形式で出力
				System.out.print(numStr1 + " * "+ numStr2 + " = " + productStr);
				
				// 計算ごとに区切る
				if (num1 <= 19) {
					
					// 区切りを出力
					System.out.print(" || ");
					
				}
			}
			
			// コンソール状の表示を見やすくするために改行を出力
			System.out.println("\n");
			
		}
	}
}
