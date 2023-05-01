/*
①配列int test[][]に以下の成績を格納し、表示してください。
	出力結果：生徒1：国語64点、数学73点、英語69点
			  生徒2：国語58点、数学81点、英語75点
			  生徒3：国語86点、数学68点、英語79点
			  生徒4：国語72点、数学55点、英語80点
	
②それぞれの教科の平均点を表示してください。
	出力結果：国語の平均点は○○点です。
			  数学の平均点は○○点です。
			  英語の平均点は○○点です。
*/
package multidimensional_array_15;

import java.util.Arrays;

public class Practice_15 {

	public static void main(String[] args) {
		
		// 多次元配列testを宣言
		int[][] test = new int[4][3];
			
		// testに値を代入
		
		// 生徒1の国語、数学、英語の成績
		test[0][0] = 64;
		test[0][1] = 73;
		test[0][2] = 69;
		
		// 生徒2の成績
		test[1][0] = 58;
		test[1][1] = 81;
		test[1][2] = 75;
		
		// 生徒3の成績
		test[2][0] = 86;
		test[2][1] = 68;
		test[2][2] = 79;
		
		// 生徒4の成績
		test[3][0] = 72;
		test[3][1] = 55;
		test[3][2] = 80;
		
		// String型配列subjectを宣言
		String[] subjects = {"国語", "数学", "英語"};

		// 問①の問題文を出力
		System.out.println("①配列int test[][]に以下の成績を格納し、表示してください。\n");
		
		// 生徒4人の成績をfor分を用いて出力
		for(int x = 0; x <= 3; x++) {
			
			// int型変数yを宣言、生徒の番数を代入
			int y = x + 1;
			
			System.out.println("生徒" + y + ":" + subjects[0] + test[x][0] + "点、" + subjects[1] +  test[x][1] + "点、" + subjects[2] + test[x][2] + "点");
		}
		
		// 改行を出力
		System.out.println("\n");
				
		// int型配列testScoresを宣言
		int[] testScores = new int[4];
		
		// int型配列subjectAveragesを宣言
		int[] subjectAverages = new int[3];
		
		// 問題➁の問題文を出力
		System.out.println("②それぞれの教科の平均点を表示してください。\n");
		
		// int型変数sを宣言、for分を用いて各教科ごとの平均点を出力
		for(int s = 0; s <= 2; s++) {
			
			// 文字"各教科の平均点は"を出力
			System.out.print(subjects[s] + "の平均点は");
			
			// int型変数tを宣言、for分を用いて各教科ごとの点数を、
			// int型変数に代入
			for(int t = 0; t <= 3; t++) {
				 testScores[t] = test[t][s];
			}
			
			// int型変数averageに教科の平均点を代入
			int average = (int)Math.round(Arrays.stream(testScores).average().getAsDouble());
			
			// int型配列subjectAveragesを宣言、各教科の平均点を代入
			subjectAverages[s] = average;
			
			// 平均点の出力
			System.out.println(subjectAverages[s] + "点です。");
		}
	}
}
