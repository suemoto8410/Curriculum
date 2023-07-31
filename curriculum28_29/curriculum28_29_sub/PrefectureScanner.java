package curriculum28_29.curriculum28_29_sub;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class PrefectureScanner {
	
	/**
	 * 数字を受け取り返すメソッド
	 * 「,」を挟むと2つ以上受け取る
	 * 2つ以上数字が入力された場合
	 * 昇順、降順の選択を表示
	 * @return 入力された数字
	 */
	public List<Integer> inputIndex() {
		
		// 入力指示
		String text = """
				都道府県データ
				0～10のいずれかの数字を入力してください
				複数入力したい場合は「,」を入れてください
				例) 2, 4…
				
				0～10の中から入力してください:""";
		
		// 入力指示を出力
		System.out.print(text);
		
		try (Scanner scanner = new Scanner(System.in)) {
			
			// 入力を受け取り、「,」で複数を受け取る
			List<String> inputIndexes = Arrays.asList(scanner.nextLine().split(","));
			
			// ソートをするためにIntegerに変換し格納する用
			List<Integer> indexes = new ArrayList<>();
			
			/*
			 * 入力された値が数字がどうか判別し
			 * 数字ならばIntegerに変換し
			 * Integerリストに格納
			 */
			for (String index: inputIndexes) {
				
				// 数字のみにするため空白を削除
				index = index.trim();
				
				// 数字のバリデーション、数字以外が入力された場合処理を終了
				if (!index.matches("^[0-9]+$")) {
					
					System.err.println("数字を入力してください");
					
					System.exit(0);
				}
				
				// Integerに変換し格納
				indexes.add(Integer.parseInt(index));
			
			}
			
			// 2つ以上入力された場合昇順、降順のソートを行う
			if (1 < indexes.size()) {
				
				System.out.print("昇順か降順を入力してください:");
			
				String orderSort = scanner.nextLine();
				
				/*
				 * 昇順,降順が入力されたかのバリデーション
				 * 一致でソートを実行
				 * それ以外処理を終了
				 */
				if (orderSort.equals("昇順")) {
					
					indexes.sort(Comparator.naturalOrder());
				
				} else if (orderSort.equals("降順")) {
				
					indexes.sort(Comparator.reverseOrder());
				
				} else {
				
					System.err.println("正しい値を入力してください");
				
					System.exit(0);
				}
			
			}
			
			return indexes;
		
		}
	
	}

}
