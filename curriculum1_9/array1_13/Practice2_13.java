/*
	①配列aを作成し、1～5を格納してください。
	
	②参照型配列bを作成し、3を表示してください。
		出力結果：3
		
	③配列a[3]を10で上書きし表示してください。
		出力結果：10
		
	④配列aの要素数を「配列aの要素数は、○です。」という形で表示してください。
		出力結果：配列aの要素数は、５です。
*/
package array1_13;

import java.awt.Point;

public class Practice2_13 {
	
	public static void main(String[] args) {
		
		// int型配列aを宣言
		int[] a = {1, 2, 3, 4, 5};
		
		// 参照型配列bを宣言、格納数3
		Point[] b = new Point[3];
		
		// 配列bの要素数を出力
		System.out.println("② 参照型配列 b を作成し、3を表示してください。");
		System.out.println("出力結果:" + b.length + "\n");
		
		// 配列a[3]に値10を代入
		a[3] = 10;
		
		// 配列a[3]を出力
		System.out.println("③配列a[3]を10で上書きし表示してください。");
		System.out.println("出力結果:"+a[3] + "\n");
		
		// 配列aの要素数を出力
		System.out.println("④配列aの要素数を「配列aの要素数は、○です。」");
		System.out.println("という形で表示してください。");
		System.out.println("出力結果:配列aの要素数は、" +  a.length + "です。");
	}

}
