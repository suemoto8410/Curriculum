package curriculum32;

public class Main {
	
	public static void main(String[] args) {
		
		/*
		 * 入力した個人情報を登録
		 * 名前(漢字フルネーム), 年齢, 身長(m)小数点第一位(四捨五入), 体重(kg)一の位(四捨五入)
		 */
		// 1人目
		Person person1 = new Person("鈴木太郎", 20, 1.7, 60);
		
		// 1人目の自己紹介文を出力
		person1.print();
		
		// Q3：Main.javaで System.out.printlnを使い「合計〇〇人です」と出力してください。〇〇はcountの値です。
		// 登録した人数分出力
		System.out.println("合計" + Person.count + "人です\n");
		
		// 2人目
		Person person2 = new Person("山田花子", 22, 1.5, 40);
		
		// 2人目の自己紹介文を出力
		person2.print();
		
		// Q6：クラスメソッド「printCount」を呼び出してください
		
		// 登録した人数を出力
		person1.printCount();
	
	}

}
