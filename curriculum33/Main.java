package curriculum33;

public class Main {

	public static void main(String[] args) {
		
		/**
		 * 自己紹介プログラム
		 * 身長は小数点第一(四捨五入), 体重小数点なし
		 * @param 名前(フルネーム漢字), 年齢, 身長(m), 体重(kg)
		 */
		Person person1 = new Person("鈴木", "太郎", 20, 1.7, 60);
		
		Person person2 = new Person("山田", "花子", 22, 1.5, 40);
		
		// 自己紹介文を出力
		person1.printFullName();
		
		person2.printFullName();
		
		// 登録した人数を出力
		person1.printCount();
	
	}

}
