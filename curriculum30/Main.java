package curriculum30;


/*
 * Q1：インスタンスフィールドを定義してください
 * 
 * Q2：コンストラクタを定義してください（下記それぞれの引数）
 * 
 * Q3：コンストラクタの中で各インスタンスフィールドに値をセットしてください
 * 
 * Q4：インスタンスフィールド「weight」を定義し、コンストラクタの中で値をセットしてください（double型）
 * 
 * Q5：Main.javaの引数にweightの60を入れてください
 * 
 * Q6：インスタンスメソッド「bmi」を定義してください（戻り値：double）
 * 
 * Q7：bmiメソッドでインスタンスのBMIを返すようにしてください
 * 
 * Q8：インスタンスメソッド「print」を定義してください（戻り値：void）
 * 
 * Q9：printメソッドの中でthisを用いて「名前は〇〇です」,「年は〇〇です」「BMIは○○です」と出力してください
 * 
 * Q10：人数の合計を「合計○人です」と出力してください。
 */

public class Main {

	public static void main(String[] args) {
		
		// Q5：Main.javaの引数にweightの60を入れてください
		
		/*
		 * 入力した個人情報を登録
		 * 名前(漢字フルネーム), 年齢, 身長(m)小数点第一位(四捨五入), 体重(kg)一の位(四捨五入)
		 */
		// 1人目
		Person person1 = new Person("鈴木太郎", 20, 1.7, 60);
		
		// 出力
		System.out.println(person1.name);
		System.out.println(person1.age);
		System.out.println(person1.height);
		
		// Q9
		// 自己紹介文を出力
		person1.print();
		
		// Q10
		// 登録した人数を出力
		person1.printCount();
	
	}

}
