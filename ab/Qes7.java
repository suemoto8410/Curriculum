package curriculum_B;
// 表示を変えるためDecimalFormatクラスをインポート
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

public class Qes7 {

	public static void main(String[] args) {
		
		// scannerクラスを生成
		Scanner scanner = new Scanner(System.in); 
		
		// 生徒の数を受け取るための変数を宣言、0を代入し初期化
		int number = 0; 
		
		// 入力された値が整数でない場合例外処理を行う
		try {
			
			// 入力指示を出力
			System.out.print("生徒の人数を入力してください（2以上） :");
			
			// 入力された生徒の数を受け取る
			number = Integer.parseInt(scanner.nextLine());
			
			// 見やすくするため改行を出力
			System.out.println();
			
		} catch (NumberFormatException e) {
			
			// 整数以外が入力された場合出力
			System.err.println("数字で入力してください");
			
			// 処理を終了
			System.exit(0);
			
		}
		
		// 入力された値が2以上
		if (number <= 1) {
			
			// 2未満の場合出力
			System.err.println("人数は2人以上で入力してください");
			
			// 処理を終了
			System.exit(0);
			
		}
		
		// 入力された各教科の点数を受け取るための変数を宣言、0を代入し初期化
		// 英語
		int eng = 0;
		// 数学
		int mat = 0;
		// 理科
		int sci = 0;
		// 社会
		int soc = 0;
		
		// 各教科の点数を格納するための配列を宣言、
		// 入力された生徒の数分の格納数を作成
		// 英語
		double[] engArr = new double[number];
		// 数学
		double[] matArr = new double[number];
		// 理科
		double[] sciArr = new double[number];
		// 社会
		double[] socArr = new double[number];
		
		// 入力された生徒の数分繰り返す
		for (int x = 0; x < number; x++) {
			
			// 入力された値が整数でない場合例外処理を行う
			try {
				
				// 英語の入力欄
				System.out.print(x + 1 + "人目の『英語』の点数を入力してください :");
				// 入力された英語の点数を代入
				eng = Integer.parseInt(scanner.nextLine());
				
				// 数学の入力欄
				System.out.print(x + 1 + "人目の『数学』の点数を入力してください :");
				// 入力された英語の点数を代入
				mat = Integer.parseInt(scanner.nextLine());
				
				// 理科の入力欄
				System.out.print(x + 1 + "人目の『理科』の点数を入力してください :");
				// 入力された英語の点数を代入
				sci = Integer.parseInt(scanner.nextLine());
				
				// 社会の入力欄
				System.out.print(x + 1 +"人目の『社会』の点数を入力してください :");
				// 入力された英語の点数を代入
				soc = Integer.parseInt(scanner.nextLine());
				
				// 見やすくするため改行を出力
				System.out.println();
				
			} catch (NumberFormatException e) {
				
				// 整数以外が入力された場合出力
				System.err.println("数字で入力してください");
				
				// 処理を終了
				System.exit(0);
				
			}
			
			// 101以上が入力されていないかバリデーション
			if (eng > 100 || mat > 100 || sci > 100 || soc > 100) {
				
				// 101以上が入力された場合出力
				System.err.println("0～100の範囲で入力してください");
				
				// 処理を終了
				System.exit(0);
				
			}
			
			// 入力された各教科の点数を代入
			// 英語
			engArr[x] = eng; 
			// 数学
			matArr[x] = mat;
			// 理科
			sciArr[x] = sci; 
			// 社会
			socArr[x] = soc; 
			
		}
		
		// 各平均点の表示を「0.00」形式にするため DecimalFormatクラスを生成
		DecimalFormat  secondDecimal = new DecimalFormat("0.00");
		
		// 入力された生徒の平均点
		for (int y = 0; y < number; y++) {
			
			// 生徒の平均点を代入
			double scoreAve = (engArr[y] + matArr[y] + sciArr[y] + socArr[y]) / 4;
			
			// 表示を「0.00」形式に変換
			String sdScoreAve = secondDecimal.format(scoreAve);
			
			// 生徒の平均点を出力
			System.out.println(y + 1 + "人目の平均点は" + sdScoreAve + "点です。");
			
		}
		
		// 各教科の平均点を代入
		// 英語
		double engAve = (double)Math.round(Arrays.stream(engArr).average().getAsDouble() * 100) / 100;
		// 表示を「0.00」形式に変換
		String sdEngAve = secondDecimal.format(engAve);
		
		// 数学
		double matAve = (double)Math.round(Arrays.stream(matArr).average().getAsDouble() * 100) / 100;
		// 表示を「0.00」形式に変換
		String sdMatAve =  secondDecimal.format(matAve);
		
		// 理科
		double sciAve = (double)Math.round(Arrays.stream(sciArr).average().getAsDouble() * 100) / 100;
		// 表示を「0.00」形式に変換
		String sdSciAve = secondDecimal.format(sciAve);
		
		// 社会
		double socAve = (double)Math.round(Arrays.stream(socArr).average().getAsDouble() * 100) / 100;
		// 表示を「0.00」形式に変換
		String sdSocAve = secondDecimal.format(socAve);
		
		// 全体の点数の平均点を代入
		double allScoreAverage = (engAve + matAve + sciAve + socAve) / 4;
		// 表示を「0.00」形式に変換
		String sdAllScoreAverage = secondDecimal.format(allScoreAverage);
		
		// 各教科の平均点を出力
		// 英語
		System.out.println("\n英語の平均点は" + sdEngAve  + "点です。");
		// 数学
		System.out.println("数学の平均点は" + sdMatAve + "点です。");
		// 理科
		System.out.println("理科の平均点は" + sdSciAve + "点です。");
		// 社会
		System.out.println("社会の平均点は" + sdSocAve + "点です。");
		// 全体の平均点を出力
		System.out.println("全体の平均点は" + sdAllScoreAverage + "点です。");
	}

}
