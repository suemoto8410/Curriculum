package sub;
// nullチェック用
import java.util.Objects;

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

// ステータスを格納するクラス
public class Data {
	
	// 各ステータスを受け取るフィールドを宣言 
	
	// 入力された名前
	private String name;
	
	// HP
	private int hitPoints;
	
	// MP
	private int magicPoints;
	
	// 攻撃力
	private int atackPower;
	
	// 素早さ
	private int agility;
	
	// 防御力
	private int defencePower;

	// 各フィールドをカプセル化 
	
	// 入力された名前のゲッター
	public String getName() {
		
		return name;
		
	}
	
	// 入力された名前のセッター
	public void setName(String name) {
		
		// nullチェック
		if (Objects.nonNull(name)) {
			
			// 引数が渡された場合代入
			this.name = name;
			
		}
		
	}

	// HPのゲッター
	public int getHitPoints() {
		
		return hitPoints;
		
	}
	
	// HPのセッター
	public void setHitPoints(int hitPoints) {
		
		// nullチェック
		if (Objects.nonNull(hitPoints)) {
			// 引数が渡された場合代入
			this.hitPoints = hitPoints;
			
		}
		
	}

	// MPのゲッター
	public int getMagicPoints() {
		
		return magicPoints;
		
	}

	// MPのセッター
	public void setMagicPoints(int magicPoints) {
		
		// nullチェック
		if (Objects.nonNull(magicPoints)) {
		
			// 引数が渡された場合出力
			this.magicPoints = magicPoints;
			
		}
		
	}

	public int getAtackPower() {
		
		return atackPower;
		
	}

	// 攻撃力のセッター
	public void setAtackPower(int atackPower) {
		
		if (Objects.nonNull(atackPower)) {
		
			this.atackPower = atackPower;
		
		}
		
	}

	// 素早さのゲッター
	public int getAgility() {
		
		return agility;
		
	}

	// 素早さのセッター
	public void setAgility(int agility) {
		
		// nullチェック
		if (Objects.nonNull(agility)) {
		
			// 引数が渡された場合代入
			this.agility = agility;
		
		}
		
	}
	
	// 防御力のゲッター
	public int getDefencePower() {
		
		return defencePower;
		
	}
	
	// 防御力のセッター
	public void setDefencePower(int defencePower) {
		
		// nullチェック
		if (Objects.nonNull(defencePower)) {
			
			// 引数が渡された場合代入
			this.defencePower = defencePower;
		
		}
		
	}
	
}
