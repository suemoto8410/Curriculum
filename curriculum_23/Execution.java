package curriculum_23;

/* ----------------------------------------------------------------------------------------------------------------

	下記がコンソールに出力されるように作成してください
	※thisとsetterとgetterとフィールドを使ってください

	動物名：ライオン
	体長：2.1m
	速度：80km/h

-------------------------------------------------------------------------------------------------------------------- */

// 実行用のクラス
public class Execution {

	public static void main(String[] args) {
		
		// 動物の名前を受け取るクラスのインスタンスを生成
		Data data = new Data();
		
		// 引数に動物名「ライオン」を渡す
		data.setAnimal("ライオン");
		
		// 引数に体長「2.1」を渡す
		data.setBodyLength(2.1);
		
		// 引数に速度「80」を渡す
		data.setSpeed(80);
		
		// セットした動物名を呼び出し変数に代入
		String animal = data.getAnimal();
		
		// セットした体長を呼び出し変数に代入
		double bodyLength = data.getBodyLength();
		
		// セットした速度を呼び出し変数に代入
		int speed = data.getSpeed();
		
		// 変数に代入した値をフォーマットと出力
		System.out.println("動物名:" + animal);
		
		System.out.println("体長:" + bodyLength + "m");
		
		System.out.println("速度:" + speed + "km/h");
		
	}

}
