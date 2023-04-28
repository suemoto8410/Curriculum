public class Curriculum_New_1_4 {

     public static void main(String[] args) {
    	 
	     // Q1 下記9個をローカル変数として宣言のみしてください
	     //		・バイト型・短整数型・整数型・長整数型
    	 		byte a;
    	 		short b;
    	 		int ab;
    	 		long c;
	     // 	・単精度浮動小数点数型・倍精度浮動小数点数型
    	 		float d;
    	 		double e;
	     //   	・文字型・文字列型
    	 		char f;
    	 		String h;
	     //	 	・ブーリアン型 
    	 		boolean k;
	     // Q2 それぞれのクラス変数をローカル内でそれぞれの初期値を代入し初期化してください
    	 	 a = 0;
    	 	 b = 0;
    	 	 ab = 0;
    	 	 c = 0L;
    	 	 d = 0.0f;
    	 	 e = 0.0d;
    	 	 f = '\u0000';
    	 	 h = "null";
    	 	 k = false;
    	 
	     // Q3 初期化をしたそれぞれの変数に下記の値を代入してください
	
	     // ・バイト型                 10
	     // ・短整数型                 100
	     // ・整数型                	 1000
	     // ・長整数型                 10000
	     // ・単精度浮動小数点数型   	 9.5
	     // ・倍精度浮動小数点数型		 10.5
	     // ・文字型                   a
	     // ・文字列型              	 ハロー
	     // ・ブーリアン型          	 true
	    	 a = 10;
	    	 b = 100;
	    	 ab = 1000;
	    	 c = 10000L;
	    	 d = 9.5f;
	    	 e = 10.5;
	    	 f = 'a';
	    	 h = "ハロー";
	    	 k = true;
    	 	
	     // Q4 下記の通りにコンソール出力されるようにしてください
	     // 必ず変数を使用すること
	
	     // 11110
	    	 System.out.println(a + b + ab + c);
	     // 20.0
	    	 System.out.println(d + e);
	     // a ハロー true
	    	 System.out.println(f + " " + h + " " + k);
	     // 11130.0                    数字を全て足す
	    	 System.out.println(a + b + ab + c + d + e);
	     // 10000000000                小数点以外の数字を全てかける
	    	 System.out.println(a * b * ab * c);
	     // 0.105                      10.5割る100をする
	    	 System.out.println(e / b);
	     // -90                        10引く100をする
	    	 System.out.println(a - b);
    	// Q5 
    	// 次のプログラムを実行すると「ハローJAVA2023」という結果が表示されます。
    	//「ハローJAVA43」と表示とさせたいのですが、意図通りに動きません。正しく動作するように修正してください。
	    	 
	    //String型変数numをint型に変更
	    int num = 20;
		int num1 = 23;
 		
		System.out.println("ハローJAVA" + (num + num1));

     }

}