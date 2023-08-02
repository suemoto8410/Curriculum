package curriculum32;

/*
 * クラスフィールド
 * 
 * Q1：クラスフィールド「count」を定義してください（初期値：0,データ型：int）
 * 
 * Q2：Personコンストラクタの中でクラスフィールドcountに1を足してください
 * 
 * Q3：Main.javaで System.out.printlnを使い「合計〇〇人です」と出力してください。〇〇はcountの値です。
 * 
 * クラスメソッド
 * 
 * Q4：クラスメソッド「printCount」を定義してください（データ型：void）
 * 
 * Q5：クラスメソッドの中にクラスフィールド「count」を用いて「合計〇〇人です」と出力してください
 * 
 * Q6：クラスメソッド「printCount」を呼び出してください
 */
public class Person {
	
	// 名前(漢字フルネーム)
	public String name;
	
	// 年齢
	public int age;
	
	// 身長(m小数点第一位)
	public double height;
	
	// 体重(kg小数点なし)
	public double weight;
	
	// Q1：クラスフィールド「count」を定義してください（初期値：0,データ型：int）
	
	// 自己紹介プログラムに登録した人数をカウント
	public static int count;
	
	/**
	 * 身長は小数点第一(四捨五入), 体重小数点なし
	 * 
	 * @param 名前(漢字フルネーム)
	 * @param 年齢
	 * @param 身長(m)
	 * @param 体重(kg)
	 */
	
	public Person(String name, int age, double height, double weight)  {
		
		this.name = name;
		
		this.age = age;
		
		this.height = height;
		
		this.weight = weight;
		
		// Q2：Personコンストラクタの中でクラスフィールドcountに1を足してください
		
		Person.count++;
	
	}
	
	/**
	 * コンストラクタに渡された値でbmiを計算
	 * @return bmi(小数第一位切り捨て)
	 */
	public double bmi() {
		
		double bmi = Math.floor(this.weight / (this.height * this.height));
		
		return bmi;
		
	}
	
	// コンストラクタに渡された値で自己紹介文を出力
	public void print() {
		
		String text = """
				名前は%sです
				BMIは%.1fです
				年は%d才です
				
				""";
		
		System.out.printf(text, this.name, bmi(), this.age);
		
	}
	
	// Q4：クラスメソッド「printCount」を定義してください（データ型：void）
	
	// 登録された人数を出力
	public void printCount() {
		
		// Q5：クラスメソッドの中にクラスフィールド「count」を用いて「合計〇〇人です」と出力してください
		System.out.println("合計" + Person.count + "人です\n");
	
	}

}
