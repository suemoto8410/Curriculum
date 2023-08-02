package curriculum31;

public class Person {
	
	// 名前(漢字フルネーム)
	public String name;
	
	// 年齢
	public int age;
	
	// 身長(m小数点第一位)
	public double height;
	
	// 体重(kg小数点なし)
	public double weight;
	
	// 自己紹介プログラムに登録した人数をカウント
	public static int personCount;

	/**
	 * 身長は小数点第一(四捨五入), 体重小数点なし
	 * 
	 * @param 名前
	 * @param 年齢
	 * @param 身長(m)
	 * @param 体重(kg)
	 */
	public Person(String name, int age, double height, double weight)  {
		
		this.name = name;
		
		this.age = age;
		
		this.height = height;
		
		this.weight = weight;
		
		personCount++;
	
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
	
	// 登録された人数を出力
	public void printCount() {
		
		System.out.println("\n合計" + personCount + "人です");
	
	}
	
	// Q6：Personクラスにインスタンスメソッド「buy」を定義しましょう。（仮引数：car）
	// 自動車の購入者を出力
	public void buy(Car car) {
		
		// Q7：buyメソッドの中でsetOwnerメソッドとthisを用いてownerフィールドの値をセットしましょう。
		car.setOwner(this.name);
		
		// Q8：さらに、「〇〇が購入しました」と出力する処理を追加してください。
		System.out.println(car.getOwner() + "が購入しました");
	}
	
	// Q9：引数の型が異なるbuyメソッドを定義しましょう。（仮引数：bicycle）
	// 自転車の購入者を出力
	public void buy(Bicycle bicycle) {
		
		// Q7
		bicycle.setOwner(this.name);
		
		// Q8
		System.out.println(bicycle.getOwner() + "が購入しました");
		
	}

}
