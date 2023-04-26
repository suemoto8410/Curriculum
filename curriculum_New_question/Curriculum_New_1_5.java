package curriculum_New_question;

public class Curriculum_New_1_5 {

    public static void main(String[] args) {
    	
        // Q1 『』で囲われた人の情報を変数にして、formatの通りコンソールに出力してください
        //  ローカル変数に代入し○○に入れてください
        // 『山田太郎 18歳 170.5cm 62.2kg 寿司』    	
    	
        // ↓↓format↓↓
        // 「初めまして○○です」
        // 「年齢は○○歳です」
        // 「身長は○○cmです」
        // 「体重は○○kgです」
        // 「好きな食べ物は○○です」

    	// Q1を下記に記載
    	//山田太郎　Profile
    	//氏名
    	String name = "山田太郎";
    	//年齢
    	int age = 18;
    	//身長
    	float height = 170.5f;
    	//体重
    	float weight = 62.2f;
    	//好きな食べ物
    	String favorite = "寿司";
    		
    	// 山田太郎　自己紹介　出力
    		System.out.println("初めまして" + name + "です");
    		System.out.println("年齢は" + age + "歳です");
    		System.out.println("身長は" + height + "cmです");
    		System.out.println("体重は" + weight + "kgです");
    		System.out.println("好きな食べ物は" + favorite +  "です");
        // Q2 Q1で作成した自己紹介に続いて、BMIがコンソールに出力されるようにしてください
    	// 「BMIは○○です」
        // ただし計算は数値を直書きせず、全て変数を使ってすること

        // Q2を下記に記載
    		
    	// 山田太郎　BMI
    		float BMI = (float)Math.round(weight * 10000 / (height * height) * 10) / 10;
    	// BMI 出力
    		System.out.println("BMIは" + BMI + "です");
    	    	
        // Q3 Q1で宣言した変数に再代入し、下記の通りコンソールに出力してください
    	// 初めまして鈴木一郎です
    	// 年齢は24歳です
    	// 身長168.5cmです
    	// 体重は64.2kgです
    	// 好きな食べ物はオムライスです
    	// BMIは22.6です

        // Q3を下記に記載
    
    	// 鈴木一郎　Profile
    	// 氏名
    	name = "鈴木一郎";
    	// 年齢
    	age = 24;
    	// 身長
    	height = 168.5f;
    	//体重
    	weight = 64.2f;
    	//好きな食べ物
    	favorite = "オムライス";
    	//BMI
    	BMI = (float)Math.round(weight * 10000 / (height * height) * 10) / 10; 
    	
    	//鈴木一郎　自己紹介　出力
    	System.out.println("初めまして" + name + "です");
    	System.out.println("年齢は" + age + "歳です");
    	System.out.println("身長" + height + "cmです");
    	System.out.println("体重は" + weight + "kgです");
    	System.out.println("好きな食べ物は" + favorite + "です");
    	System.out.println("BMIは" + BMI + "です");
    	
    	// ↓↓コンソール最終結果↓↓
    	
    	//	初めまして山田太郎です
		//	年齢は18歳です
		//	身長170.5cmです
		//	体重は62.2kgです
		//	好きな食べ物は寿司です
		//	BMIは21.4です
		//	
		//	初めまして鈴木一郎です
		//	年齢は24歳です
		//	身長168.5cmです
		//	体重は64.2kgです
		//	好きな食べ物はオムライスです
		//	BMIは22.6です
    	 
     }

}