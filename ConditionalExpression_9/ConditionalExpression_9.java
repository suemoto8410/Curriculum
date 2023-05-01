package ConditionalExpression_9;

import java.util.Random;

public class ConditionalExpression_9 {
	public static void main(String[] args) {
//		問１）
//		boolean型変数 rain を宣言し、今日の天気が雨なら「true」雨でないなら「false」を代入して下さい。
//		もし rain が true ならコンソールに「DVDを見ます。」と false なら「外で遊びます。」と表示して下さい。
		
		// boolean型変数rainを宣言
		boolean rain = false;
		
		// rainをif型条件分岐で出力
		System.out.println("問1)");
		System.out.println("boolean型変数 rain を宣言し、今日の天気が雨なら「true」");
		System.out.println("雨でないなら「false」を代入して下さい。");
		System.out.println("もし rain が true ならコンソールに「DVDを見ます。」と");
		System.out.println("false なら「外で遊びます。」と表示して下さい。\n");
		
		if(rain == true) {
			System.out.println("出力結果: DVDを見ます。\n");
		}else if(rain == false) {
			System.out.println("出力結果: 外で遊びます。\n");
		}

//		問２）
//		String型変数 name に任意の名前を入れて下さい。
		
		String name = "わんこ";
		
//		int型変数 score に「0~100」までの乱数を代入して下さい。
//		もし score が 40点以下なら「〇〇さんは□□点です。もう少し頑張りましょう。」、
//		もし score が 40点以上、60点以下なら「〇〇さんは□□点です。もう少しでした。」、
//		もし score が 60点以上、80点以下なら「〇〇さんは□□点です。よくできました。」、
//		もし score が 80点以上なら「〇〇さんは□□点です。たいへんよくできました。」とコンソールに出力して下さい。

		// int型変数scoreを宣言、乱数0～100を代入
		Random rnd = new Random();
		int score = rnd.nextInt(101);
		
		// scoreをif型条件分岐で出力
		System.out.println("問2)");
		System.out.println("int型変数 score に「0~100」までの乱数を代入して下さい。");
		System.out.println("もし score が 40点以下なら「〇〇さんは□□点です。もう少し頑張りましょう。」、");
		System.out.println("もし score が 40点以上、60点以下なら「〇〇さんは□□点です。もう少しでした。」、");
		System.out.println("もし score が 60点以上、80点以下なら「〇〇さんは□□点です。よくできました。」、");
		System.out.println("もし score が 80点以上なら「〇〇さんは□□点です。たいへんよくできました。」とコンソールに出力して下さい。\n");
		
		if(score >= 80) {
			System.out.println("出力結果: " + name + "さんは" + score + "点です。たいへんよくできました。\n");
		} else if(score >= 60) {
			System.out.println("出力結果: " + name + "さんは" + score + "点です。よくできました。\n");
		} else if(score >= 40) {
			System.out.println("出力結果: " + name + "さんは" + score + "点です。もう少しでした。\n");
		} else {
			System.out.println("出力結果: " + name + "さんは" + score + "点です。もう少し頑張りましょう。\n");
		}
		
//		問３）
//		①変数 isTired を定義し、0 か 1 を代入する。（どちらを代入しても構わない。）
		
		// int型変数isTiredを宣言
		int isTired = 0;
//		②変数 study を定義し、文字列 "カリキュラム" を代入する
		
		// String型変数studyを宣言
		String study = "カリキュラム";
//		③もし変数 isTired が 0 であれば「私はとても元気です。」、そうでなければ「私は疲れています。」と表示する。
		System.out.println("問3③: ③もし変数 isTired が 0 であれば「私はとても元気です。」、");
		System.out.println("そうでなければ「私は疲れています。」と表示する。\n");
		
		//isTiredをif型条件分岐で出力
		if(isTired == 0) {
			System.out.println("出力結果: 私はとても元気です。\n");
		} else {
			System.out.println("出力結果: 私は疲れています。\n");
		}
		
//		※④は System.out.println() のカッコ内に条件演算子（三項演算子）を使って、一行で書いてください。
//		④もし変数 isTired が 0 であれば、変数 study を利用して「カリキュラムを続けます。」と表示する。
		
		// isTiredを条件演算子で出力
		System.out.println("問3④: ※④は System.out.println() のカッコ内に");
		System.out.println("条件演算子（三項演算子）を使って、一行で書いてください。");
		System.out.println("④もし変数 isTired が 0 であれば、変数 study を");
		System.out.println("利用して「カリキュラムを続けます。」と表示する。\n");
		System.out.println(isTired == 0 ? "出力結果: " +study + "を続けます。" : "出力結果: 今日の" + study + "を終わります。");
	}
}
