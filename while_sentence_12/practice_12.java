/*
	問題．while文を使用し、以下のプログラムを作成してください。
		・1～100を出力
		・奇数の数字に「〇は奇数です」と出力
		・偶数の数字に「○は偶数です」と出力
		  出力結果  1は奇数です
					2は偶数です
					3は奇数です
					4は偶数です
						・
						・
						・
					100は偶数です
*/
package while_sentence_12;

public class practice_12 {
	
	public static void main(String[] args) {
		
		//int型変数numを宣言,値1を代入
		int num = 1;
		
		//変数numをwhileを用いて1～100まで出力
		while(num <= 100) {
			
			if(num % 2 == 0) {
				System.out.println(num + "は偶数です");
			} else {
				System.out.println(num + "は奇数です");
			}
			
			num ++;
		}
	}

}
