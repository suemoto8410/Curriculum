package curriculum30;

public class Person {
	
	// Q1:インスタンスフィールドを定義してください
	
	/* 
	 * フィールド名 データ型
	 * name string
	 * age int
	 * height double
	 */
	
	// 名前(漢字フルネーム)
	public String name;
	
	// 年齢
	public int age;
	
	// 身長(m小数点第一位)
	public double height;
	
	// Q4：インスタンスフィールド「weight」を定義し、コンストラクタの中で値をセットしてください（double型）
	// 体重(kg小数点なし)
	public double weight;
	
	// 自己紹介プログラムに登録した人数をカウント
	public static int personCount;
	
	// Q2:コンストラクタを定義してください（下記それぞれの引数）
	// name,age,height
	
	/**
	 * 身長は小数点第一(四捨五入), 体重小数点なし
	 * 
	 * @param 名前(漢字フルネーム)
	 * @param 年齢
	 * @param 身長(m)小数点第一位(四捨五入)まで
	 * @param 体重(kg)一の位(四捨五入)まで
	 */
	public Person(String name, int age, double height, double weight)  {
		
		// Q3：コンストラクタの中で各インスタンスフィールドに値をセットしてください
	
		this.name = name;
		
		this.age = age;
		
		this.height = height;
		
		// Q4
		this.weight = weight;
		
		// Q10
		Person.personCount++;
	
	}
	
	// Q6:インスタンスメソッド「bmi」を定義してください（戻り値：double）
	// Q7:bmiメソッドでインスタンスのBMIを返すようにしてください
	
	/**
	 * コンストラクタに渡された値でbmiを計算
	 * @return bmi(小数第一位切り捨て)
	 */
	public double bmi() {
		
		double bmi = Math.floor(this.weight / (this.height * this.height));
		
		return bmi;
		
	}
	
	// Q8：インスタンスメソッド「print」を定義してください（戻り値：void）
	// Q9：printメソッドの中でthisを用いて「名前は〇〇です」,「年は〇〇です」「BMIは○○です」と出力してください
	
	// コンストラクタに渡された値で自己紹介文を出力
	public void print() {
		
		String text = """
				
				名前は%sです
				BMIは%.1fです
				年は%d才です
				
				""";
		
		System.out.printf(text, this.name, bmi(), this.age);
		
	}
	
	// Q10：人数の合計を「合計○人です」と出力してください。
	
	// 登録された人数を出力
	public void printCount() {
		
		System.out.println("合計" + Person.personCount + "人です");
	
	}

}
