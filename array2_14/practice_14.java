
//	string型の配列を作成し、アルファベットa～jまでを格納してください。
//	brake文を使用し、a～dまで表示してください。
//	
//	 出力結果：a
//	           b
//	           c
//	           d
//	          
//	cotinue文を使用し、i以外を表示してください。
//	
//	 出力結果：a
//	           b
//	           c
//	           d
//	           e
//	           f
//	           g
//	           h
//	           j

package array2_14;

public class practice_14 {
	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		//String型配列alphabetを宣言,値a～jを代入
		String[] alphabet = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
		
		//配列alphabetをfor文,break分とcontinue分を用いて出力
		for(int x = 0; x <= 1; x++) {
			
			//文字"出力結果"を出力
			System.out.print("出力結果:");
			
			//String型変数spaceを宣言、,文字"出力結果"以降の行間を代入
			String space = "         ";
			
			for(int num = 0; num < alphabet.length; num++) {
				
				//配列alphabetの値dまで出力
				if(alphabet[num] == "e" && x == 0) {
					break;
				}
				
				//配列alphabetの値i以外を出力
				if(alphabet[num] == "i" && x == 1) {
					continue;
				}
				
				if(num >= 1) {
					//変数spaceを出力
					System.out.print(space);
				}
				//配列alphabetを出力
				System.out.println(alphabet[num]);
			}
			//出力結果を改行
			System.out.println("\r\n");
		}
		
		
	}

}


