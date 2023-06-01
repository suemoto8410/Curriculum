package curriculum_23;
// nullチェック用
import java.util.Objects;

/* --------------------------------------------------------------------------------------------------------------
	
	下記がコンソールに出力されるように作成してください
	※thisとsetterとgetterとフィールドを使ってください
	
	動物名：ライオン
	体長：2.1m
	速度：80km/h
	
--------------------------------------------------------------------------------------------------------------------- */

// 動物の情報を格納
public class Data {
	
	// 動物名を受け取る為のフィールド animal を宣言
	private String animal;
	
	// 体長を受け取る為のフィールド bodyLength を宣言
	private double bodyLength;
	
	// 速度を受け取る為のフィールド speed を宣言
	private int speed;
	
	// 動物名のゲッター
	public String getAnimal() {
		
		return animal;
		
	}
	
	// 動物名のセッター
	public void setAnimal(String animal) {
		
		// nullチェック
		if (Objects.nonNull(animal)) {
			
			// 引数が渡されていた場合代入
			this.animal = animal;
			
		}
		
	}
	
	// 体長のゲッター
	public double getBodyLength() {
		
		return bodyLength;
		
	}
	
	// 体長のセッター
	public void setBodyLength(double bodyLength) {
		
		// nullチェック
		if (Objects.nonNull(bodyLength)) {
			
			/// 引数が渡されていた場合代入
			this.bodyLength = bodyLength;
		
		}
		
	}
	
	// 速度のゲッター
	public int getSpeed() {
		
		return speed;
		
	}

	// 速度のセッター
	public void setSpeed(int speed) {
		
		// nullチェック
		if (Objects.nonNull(speed)) {
			
			// 引数が渡されていた場合代入
			this.speed = speed;
			
		}
		
	}

}
