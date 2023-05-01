package dateTypeAndMemory_16;

public class DataTypeAndMemory {

	public static void main(String[] args) {
		// Q1：「A」という文字列を変数に代入してコンソールに出力してください。

		// String型変数 str を宣言
		System.out.println("Q1：「A」という文字列を変数に代入してコンソールに出力してください。\n");
		String str = "「A」\n";
		
		// 変数 str を出力
		System.out.println("出力結果: " + str);
		
		// Q2：「Hello Java」という文字列を変数に代入してコンソールに出力してください。
		
		// String型変数 helloWorld を宣言,文字列「Hello Java」を代入
		System.out.println("Q2：「Hello Java」という文字列を変数に代入してコンソールに出力してください。\n");
		String helloWorld = "「Hello Java」\n";
		
		// 変数 helloWorld を出力
		System.out.println("出力結果: " + helloWorld);
			
		// Q3：富士山の標高を整数で変数に代入してコンソールに出力してください。
		
		// int型変数 fujiElevation を宣言、富士山の標高を代入
		int fujiElevation = 3776;
		
		// 変数 fujiElevation を出力
		System.out.println("Q3：富士山の標高を整数で変数に代入してコンソールに出力してください。\n");
		System.out.println("出力結果: " + fujiElevation + "\n");

		// Q4：円周率を小数点第二位まで変数に代入してコンソールに出力してください。
		
		// double型 pi を宣言、円周率を小数点第二までを代入
		double pi = 3.14;
		
		// 変数 pi を出力
		System.out.println("Q4：円周率を小数点第二位まで変数に代入してコンソールに出力してください。\n");
		System.out.println("出力結果: " + pi + "\n");
				
		// Q5：変数numsに「10, 100, 1000」が格納された配列を代入して、コンソールにメモリの番地が1のデータを出力してください。
		
		// int型配列numsを宣言
		 int[] nums = {10, 100, 1000};
		 
		// 配列nums[0]のメモリの番地の1のデータを出力
		 System.out.println("Q5：変数numsに「10, 100, 1000」が格納された配列を代入して、");
		 System.out.println("コンソールにメモリの番地が1のデータを出力してください。\n");
		 System.out.println("出力結果: " + nums[0] + "\n");
		 

		// Q6：Q5で作成した変数numsを変数bに代入し、その後変数bのメモリの番地が1のデータを「8」に上書きさせて
		//     コンソールに変数numsと変数bのメモリの番地が1のデータを出力させて、変数nums値が変わることを確認してください。
		 
		 // 変数 b を宣言、変数 nums を代入　
		 int[] b = nums;
		 
		 // 変数b[0]に値 8 を代入
		 b[0] = 8;
		 
		 // 変数 b[0]を出力
		 System.out.println("Q6：Q5で作成した変数numsを変数bに代入し、その後変数bのメモリの番地が1のデータを「8」に上書きさせて");
		 System.out.println("コンソールに変数numsと変数bのメモリの番地が1のデータを出力させて、変数nums値が変わることを確認してください。\n");
		 System.out.println("出力結果: " + b[0]);

	}

}
