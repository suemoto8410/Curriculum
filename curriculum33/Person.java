package curriculum33;

/*
 * インスタンスフィールドの追加
 * Q1：インスタンスフィールドに「lastName」を追加しましょう
 * 
 * コンストラクタのオーバーロード
 * Q2：lastNameの値を引数で受け取るコンストラクタを追加で定義してください
 * ※順番はfirstNameの次
 * 
 * Q3：作成したコンストラクタの中に「Person.count++; this.lastName;」を追加しlastNameフィールドの値をセットしてください
 * 
 */
public class Person {
	
	// 名前(漢字フルネーム)
	public String name;
	
	// 苗字(漢字)
	public String firstName;
	
	// Q1：インスタンスフィールドに「lastName」を追加しましょう
	
	// 名前(漢字)
	public String lastName;
	
	// 年齢
	public int age;
	
	// 身長(m小数点第一位)
	public double height;
	
	// 体重(kg小数点なし)
	public double weight;
	
	// 自己紹介プログラムに登録した人数をカウント
	public static int count;

	/**
	 * 身長はmで小数点第一位(四捨五入), 体重はkgで小数点なし
	 * 
	 * @param 名前(漢字フルネーム)
	 * @param 年齢
	 * @param 身長
	 * @param 体重
	 */
	public Person(String name, int age, double height, double weight)  {
		
		this.name = name;
		
		this.age = age;
		
		this.height = height;
		
		this.weight = weight;
		
		Person.count++;
	
	}
	
	// Q2：lastNameの値を引数で受け取るコンストラクタを追加で定義してください
	
	/**
	 * 身長はmで小数点第一位(四捨五入), 体重はkgで小数点なし
	 * 
	 * @param 苗字 
	 * @param 名前
	 * @param 年齢
	 * @param 身長
	 * @param 体重
	 */
	
	public Person(String firstName, String lastName, int age, double height, double weight)  {
		
		this.firstName = firstName;
		
		// Q3：作成したコンストラクタの中に「Person.count++; this.lastName;」を追加しlastNameフィールドの値をセットしてください
		
		this.lastName = lastName;
		
		Person.count++;
		
		this.age = age;
		
		this.height = height;
		
		this.weight = weight;
	
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
	
	// 苗字と名前を合わせフルネームにして返す
	public String fullName() {
		
		String fullName = firstName + lastName;
		
		return fullName;
		
	}
	
	// 
	public void printFullName() {
		
		String text = """	
				名前は%sです
				BMIは%.1fです
				年は%d才です
				
				""";
		
		System.out.printf(text, this.fullName(), bmi(), this.age);
		
	}
	
	
	// 登録された人数を出力
	public void printCount() {
		
		System.out.println("合計" + Person.count + "人です\n");
	
	}

}
