package sub;
// Listインターフェイスをインポート
import java.util.List;
// 入力を受け取る用
import java.util.Scanner;
// 乱数生成用
import java.util.SplittableRandom;
// 
import java.util.stream.Collectors;

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

---------------------------------------------------------------------------------------------------------------------- */

// ステータスを格納するクラスを継承
public class Status extends Data {
		
	public Status() {
		
		// 入力を受け取るため、Scannerインスタンスを生成
		Scanner scanner = new Scanner(System.in);
		
		// 入力指示
		System.out.println("名前を入力してください");
		
		// 名前の入力欄
		System.out.print("名前: " );
		
		// 入力された値を引数に渡す
		super.setName(scanner.nextLine());
		
		// scannerを閉じる
		scanner.close();
		
		// 乱数を生成するため、SpilittableRandomインスタンスを生成
		SplittableRandom random = new SplittableRandom();
		
		// Listを生成、0～1000 までの乱数を5つ生成し格納
		List<Integer> randomList = random.ints(5, 0, 1000).boxed().collect(Collectors.toList());
		
		// 生成した乱数を各セッター毎に引数として渡す
		
		// HP
		super.setHitPoints(randomList.get(0));
		
		// MP
		super.setMagicPoints(randomList.get(1));
		
		// 攻撃力
		super.setAtackPower(randomList.get(2));
		
		// 素早さ
		super.setAgility(randomList.get(3));
		
		// 防御力
		super.setDefencePower(randomList.get(4));
		
		// セッターに渡した値をゲッターで呼び出し各変数に代入
		
		// 入力された名前
		String name = getName();
		
		// HP
		int hitPoints = getHitPoints();
		
		// MP
		int magicPoints = getMagicPoints();
		
		// 攻撃力
		int atackPower = getAtackPower();
		
		// 素早さ
		int agility = getAgility();
		
		// 防御力
		int defencePower = getDefencePower();
		
		// 呼び出された際出力
		System.out.println("\nこんにちは「 " + name + " 」さん");
		System.out.println("ステータス");
		System.out.println("HP:" + hitPoints);
		System.out.println("MP:" + magicPoints);
		System.out.println("攻撃力:" + atackPower);
		System.out.println("素早さ:" + agility);
		System.out.println("防御力:" + defencePower);
		System.out.println("\nさあ冒険に出かけよう！\n");
		
	}
	
}
