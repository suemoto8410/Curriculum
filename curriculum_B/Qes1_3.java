package curriculum_B;

// じゃんけんの手をランダムにするためRandomクラスをインポート
import java.util.Random;
// コンソールから入力を受け取るためにScannerクラスをインポート
import java.util.Scanner;

public class Qes1_3 {

	public static void main(String[] args) {
	/* -----------------------------------------------------------------------------------------------------------
    	Q1 ログイン時の入力チェックシステムを下記条件で作成してください
      	・コンソールにユーザー名を入力できるようにしてください
      	・ユーザー名の文字数が10文字より大きい場合「名前を10文字以内にしてください」と出力してください
      	・ユーザー名の文字数が0文字以下もしくはnullの場合「名前を入力してください」と出力してください
      	・ユーザー名が正常な値だった場合「ユーザー名「 入力したユーザー名 」を登録しました」と出力してください
		-------------------------------------------------------------------------------------------------------*/
		
//		Q2 ユーザー名が半角英数字以外の場合「半角英数字のみで名前を入力してください」と出力してください
				
		// scannerクラスを生成
		Scanner scanner = new Scanner(System.in);
		
		// コンソールへの入力を受け取るための変数を宣言、空欄を代入し初期化
		String name = "";
		
		// 半角英数字を判別するための正規表現
		String regex_AlphaNum = "^[A-Za-z0-9]+$";
		
		// ユーザーネーム入力が正確に入力を繰り返す為、真偽値を宣言 false を代入
		boolean validate = false;
		
		// ユーザーネームが半角英数字かつ10文字以内で入力されるまで繰り返し処理
		while (validate == false) {
			// 入力指示をコンソール上に出力
			System.out.print("名前(半角英数字)を入力してください: ");
			
			// コンソールへの入力値を受け取る
			name = scanner.nextLine();
			
			// ユーザーネームをバリデーション
			if (name.length() > 10) {
				
				// ユーザーネームが10文字を超えた場合出力
				System.err.println("\n名前を10文字以内にしてください\n");
				
			} else if (name.isBlank()) {
				
				// ユーザーネームが未入力の場合出力
				System.err.println("\n名前を入力してください\n");
				
			} else if (name.matches(regex_AlphaNum) == false) {
				
				// Q2の処理 半角英数字以外が入力され場合出力
				System.err.println("\n半角英数字のみで名前を入力してください\n");
				
			} else {
				
				// 繰り返し処理を終了するため値 true を代入
				validate = true;
				
			}
			
		}
		
		// 入力された名前を出力
		System.out.println("ユーザー名「" + name + "」を登録しました\n");
		
//      Q3 じゃんけんのシステムを作成してください

		// Randomクラスを宣言
		Random rnd = new Random();
		
		// ユーザーが勝つまでじゃんけんを繰り返す為、真偽値を宣言
		boolean win = false;
		
		// じゃんけんを行った回数を記録
		int count = 0;
		
		// じゃんけんの手を配列に格納
		String[] handName = {"グー", "チョキ", "パー"};
		
		// 入力されたユーザーの手を受け取る変数を宣言
		int hand;
		
		// 相手(CPU)の手を受け取る変数を宣言
		int handCp;
		
		// じゃんけんゲームのルールを出力
		System.out.println("じゃんけんゲーム(数字で入力してください「0: グー、1：チョキ、2：パー」)");
		
		// じゃんけんゲームで入力者が勝利するまで繰り返す
		while(win == false) {
			
			// 数字以外が入力された際の例外処理
			try {
				
				// 入力指示を出力
				System.out.print("\nじゃんけん: ");
				
				// コンソールへの入力を受け取る
				hand = Integer.parseInt(scanner.nextLine());
				
			} catch (NumberFormatException e) {
				
				// 数字以外が入力された場合出力
				System.err.println("\n0～2の中で入力してください");
				
				// じゃんけんゲーム入力に戻る
				continue;
				
			} 
			
			// 0～2以外が入力された場合、入力に戻す
			if(hand > 2) {
				
				// 0～2以外が入力された場合出力
				System.err.println("\n0～2の中で入力してください");
				
				// じゃんけんゲーム入力に戻る
				continue;
				
			} else {
				
				// 相手(CPU)の手を0～2までの範囲で乱数を生成し代入
				handCp = rnd.nextInt(3);
				
				// お互いの手を表示
				System.out.println("\n" + name + "の手は「" + handName[hand] + "」");
				System.out.println("相手の手は「" + handName[handCp] + "」\n");
				
			}
			
			// じゃんけんの勝敗を出力
			if(hand == 1 && handCp == 0) {
				
				// ユーザーがチョキで負けた場合出力
				System.out.println("俺の勝ち！");
				System.out.println("負けは次につながるチャンスです！");
				System.out.println("ネバーギブアップ！");
				
				// 行った回数をカウント
				count++;
				
			} else if (hand == 2 && handCp == 1) {
				
				// ユーザーがパーで負けた場合出力
				System.out.println("俺の勝ち！");
				System.out.println("たかがじゃんけん、そう思ってないですか？");
				System.out.println("それやったら次も、俺が勝ちますよ");
				
				// 行った回数をカウント
				count++;
				
			} else if (hand == 0 && handCp == 2) {
				
				// ユーザーがグーで負けた場合出力
				System.out.println("俺の勝ち！");
				System.out.println("なんで負けたか、明日まで考えといてください");
				System.out.println("そしたら何かが見えてくるはずです");
				
				// 行った回数をカウント
				count++;
				
			} else if (hand == handCp) {
				
				// あいこの場合出力
				System.out.println("DRAW あいこ もう一回しましょう！");
				
				// 行った回数をカウント
				count++;
				
			} else {
				
				// ユーザーが勝った場合出力
				System.out.println("やるやん。");
				System.out.println("次は俺にリベンジさせて");
				
				// 行った回数をカウント
				count++;
				
				// じゃんけんを行った回数を出力
				System.out.println("\n勝つまでに行った回数は" + count + "回です");
				
				// 繰り返し処理を終了
				win = true;
			}
			
		}
		
	}
	
}
