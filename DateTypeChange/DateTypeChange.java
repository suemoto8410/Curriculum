package DateTypeChange;

public class DateTypeChange {
	public static void main(String[] args) {
		
//		問１）
//		以下のプログラムを作成してください。
//		①int型変数 i に 3 を代入する。
		
		//int型変数iを宣言し値3を代入
		int i = 3;
//		②double型変数 d に i を代入する。
		
		//double型変数dを宣言しiを代入
		double d = i;
//		③変数 i と変数 d の値をそれぞれコンソールに表示する。
		
		//変数iと変数dを出力
		System.out.println(i);
		System.out.println(d);
//		問２）
//		以下のプログラムを作成してください。
//		①double型変数 pi に数値「3.14」を代入して下さい。。
		
		//double型変数piを宣言し値3.14を代入
		double pi = 3.14;
//		②変数 pi に「3」を掛けた値をコンソールに出力して下さい。
		
		//変数piに値3を掛けて出力
		System.out.println(pi * 3);
//		④int型の変数 integer を宣言し、変数 pi を int型に型変換しコンソールに出力して下さい。
		
		//int型変数integerを宣言、double型変数piをintに型変換して代入
		int integer = (int)pi;
		
		//変数integerを出力
		System.out.println(integer);
//		問３）
//		①double型の変数を定義し、「2 + 6.0」を代入して下さい。
//		　double型の変数をコンソールに出力して下さい。
		
		//double型変数sを宣言、2 + 6.0を代入
		double s = 2 + 6.0;
		
		//変数sを出力
		System.out.println(s);
//		②int型の変数を定義し、double型の変数をint型に型変換して代入下さい。
//		　int型の変数をコンソールに出力して下さい。
		
		//int型変数tを宣言、double型変数sをintに型変換して代入
		int t = (int)s;
		//変数tを出力
		System.out.println(t);
//		③String型の変数を定義し、int型の変数をString型に型変換して代入して下さい。
//		　String型の変数をコンソールに出力して下さい。
		
		//String型変数u,int型変数vを宣言,変数vをStringに型変換して変数uに代入
		String u;
		int v = 3;
		u = String.valueOf(v);
		
		//変数uを出力
		System.out.println(u);
//		④「②」で定義したint型変数に、String型の変数をint型に型変換して代入して下さい。
//		　int型の変数をコンソールに出力して下さい。
		
		//String変数wを宣言、int型変数変数tを型変換して変数wに代入
		String w = String.valueOf(t);
		
		//変数wを出力
		System.out.println(w);

	}
}
