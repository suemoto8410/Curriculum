package main;
// 処理用のクラスをインポート
import sub.Status;

/* -------------------------------------------------------------------------------------------------------------------

	名前を入力したら下記がコンソールに出力されるように作ってください
	条件：数値は毎回変わるように作ってください
		サブクラスを使用してください
		スーパークラスを使用してください
		getterとsetterを使用してください
		packageを2つ作ってメインと処理を分けてください
		命名する場合は規則にのっとってください
		コンストラクタを使用してください

	こんにちは 「 名前 」 さん
	ステータス
	HP：849
	MP：862
	攻撃力：375
	素早さ：937
	防御力：24

	さあ冒険に出かけよう！

------------------------------------------------------------------------------------------------------------------- */

// メインクラス
public class Execution {

	public static void main(String[] args) {
		
		// 処理用のクラスを呼び出す
		new Status();
		
	}

}