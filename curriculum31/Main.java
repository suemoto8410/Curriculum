package curriculum31;

/*
 * Q1:Vehicleクラスを作成し、String型のprivateなインスタンスフィールド「owner」を定義しましょう。
 * 
 * Q2：CarクラスとBicycleクラスを作成しましょう。
 * 
 * Q3：Vehicleクラスにownerフィールドのゲッター「getOwner」とセッター「setOwner」を定義しましょう。
 * 
 * Q4：MainクラスにsetOwnerを用いて、Carクラスのインスタンス「car」の所有者を「person1」に、Bicycleクラスのインスタンス「bicycle」の所有
 * 者を「person2」に設定します。Personクラスのインスタンスからフルネームを取得し、ownerにセットしてください。
 * 
 * Q5：セットできたら、ownerをコンソールに出力してください。
 * 
 * Q6：Personクラスにインスタンスメソッド「buy」を定義しましょう。（仮引数：car）
 * 
 * Q7：buyメソッドの中でsetOwnerメソッドとthisを用いてownerフィールドの値をセットしましょう。
 * 
 * Q8：さらに、「〇〇が購入しました」と出力する処理を追加してください。
 * 
 * Q9：引数の型が異なるbuyメソッドを定義しましょう。（仮引数：bicycle）
 * 
 * Q10：Mainクラスからbuyメソッドを用いて、「person1」がcarを購入、「person2」がbicycleを購入するプログラムを作成しましょう。
 */

public class Main {

	public static void main(String[] args) {
		
		/*
		 * 入力した個人情報を登録
		 * 名前(漢字フルネーム), 年齢, 身長(m)小数点第一位(四捨五入), 体重(kg)一の位(四捨五入)
		 */
		// 1人目
		Person person1 = new Person("鈴木太郎", 20, 1.7, 60);
		
		// 2人目
		Person person2 = new Person("山田花子", 22, 1.5, 40);
		
		/*
		 * 4：MainクラスにsetOwnerを用いて、Carクラスのインスタンス「car」の所有者を「person1」に、Bicycleクラスのインスタンス「bicycle」の所有
		 * 者を「person2」に設定します。Personクラスのインスタンスからフルネームを取得し、ownerにセットしてください。
		 */
		
		/*
		 * 乗り物の種類
		 */
		Car car = new Car();
		
		Bicycle bicycle = new Bicycle();
		
		/*
		 * 乗り物ごとにオーナーを設定
		 */
		car.setOwner(person1.name);
		
		bicycle.setOwner(person2.name);
		
		// Q5：セットできたら、ownerをコンソールに出力してください。
		
		/*
		 * 乗り物ごとにオーナー名出力
		 */
		System.out.println(car.getOwner());

		System.out.println(bicycle.getOwner());
		
		// Q10：Mainクラスからbuyメソッドを用いて、「person1」がcarを購入、「person2」がbicycleを購入するプログラムを作成しましょう。
		
		/*
		 * 乗り物ごとに購入者を出力
		 */
		person1.buy(car);
		
		person2.buy(bicycle);
		
		// 自己紹介文を出力
		person1.print();
		
		person2.print();
		
		// 登録した人数を出力
		person1.printCount();
	
	}

}
