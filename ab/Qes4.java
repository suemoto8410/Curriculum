package curriculum_B;

public class Qes4 {

	public static void main(String[] args) {
		
		// 値が1から9になるまで繰り返す
		for (int num1 = 1; num1 <= 9; num1++) {
			
			// 値が1から9になるまで繰り返す
			for (int num2 = 1; num2 <= 9; num2++) {
				
				// 表示を「01」形式に変換し代入
				String num01 = String.format("%02d", num1);
				
				// 表示を「01」形式に変換し代入
				String num02 = String.format("%02d", num2);
				
				// 表示を「01」形式に変換し代入
				String product = String.format("%02d", (num1 * num2));
				
				// かけ算の結果を式形式で出力
				System.out.print(num01 + " * "+ num02 + " = " + product);
				
				// 計算毎に区切る
				if (num2 <= 8) {
					
					// 区切りを出力
					System.out.print(" || ");
					
				}
			}
			
			// 段ごとに改行
			System.out.println("\n");
			
		}

	}

}
