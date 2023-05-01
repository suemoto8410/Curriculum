package Bool_8;

public class Bool_8 {
	public static void main(String[] args) {
//		問１）
//		以下の変数を使ってboolean型変数 result_1 に「変数 a の値は変数 b の値以上」という条件式を代入して下さい。
//		boolean型変数 result_1 をコンソールに出力して下さい。
		int a = 20;
		int b = 5;
		
		// boolean型変数result_1を宣言
		boolean result_1 = a >= b;

		// result_1を出力
		System.out.println("問１)");
		System.out.println("以下の変数を使ってboolean型変数 result_1 に");
		System.out.println("「変数 a の値は変数 b の値以上」");
		System.out.println("という条件式を代入して下さい。");
		System.out.println("boolean型変数 result_1 をコンソールに出力して下さい。\n");
		System.out.println("boolean型変数 result_1");
		System.out.println("出力結果: " + result_1 + "\n");
		
//		問２）
//		以下の変数を使ってboolean型変数 result_2 に「変数 c の値と変数 d の値は等しくない」という条件式を代入して下さい。
//		boolean型変数 result_2 をコンソールに出力して下さい。
		int c = 5;
		int d = 10;
		
		// boolean型変数result_2を宣言
		boolean result_2 = c != d;
		
		// result_2を出力
		System.out.println("問2)");
		System.out.println("boolean型変数 result_1 をコンソールに出力して下さい。");
		System.out.println("「変数 c の値と変数 d の値は等しくない」");
		System.out.println("という条件式を代入して下さい。");
		System.out.println("boolean型変数 result_2 をコンソールに出力して下さい。\n");
		System.out.println("boolean型変数 result_2");
		System.out.println("出力結果: " + result_2 + "\n");
		
//		問３）
//		以下の変数を使ってboolean型変数 result_3 に「変数 e の値は10より大きい かつ 変数 f の値は10未満」という条件式を代入して下さい。
//		boolean型変数 result_3 をコンソールに出力して下さい。
		int e = 12;
		int f = 8;
		
		// boolean型変数result_3を宣言
		boolean result_3 = e > 10 && f < 10;
		
		// result_3を出力
		System.out.println("問3)");
		System.out.println("以下の変数を使ってboolean型変数 result_3 に");
		System.out.println("「変数 e の値は10より大きい かつ 変数 f の値は10未満」");
		System.out.println("という条件式を代入して下さい。");
		System.out.println("boolean型変数 result_3 をコンソールに出力して下さい。\n");
		System.out.println("boolean型変数 result_3");
		System.out.println("出力結果: " + result_3 + "\n");
//		問４）
//		以下の変数を使ってboolean型変数 result_4 に「変数 g の値は5以下 または 変数 g の値は10以上」という条件式を代入して下さい。
//		boolean型変数 result_4 をコンソールに出力して下さい。
		int g = 7;

		// boolean変数result_4を宣言
		boolean result_4 = g <= 5 || g  >= 10;
		
		// result_4を出力
		System.out.println("問4)");
		System.out.println("以下の変数を使ってboolean型変数 result_4 に");
		System.out.println("「変数 g の値は5以下 または 変数 g の値は10以上」");
		System.out.println("という条件式を代入して下さい。");
		System.out.println("boolean型変数 result_4 をコンソールに出力して下さい。\n");
		System.out.println("boolean型変数 result_4");
		System.out.println("出力結果: "  + result_4 + "\n");
	}
}
