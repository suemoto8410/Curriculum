package pro_22;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Objects;

/* ----------------------------------------------------------------------------------------------------------------

		下記がコンソールに出力されるように作成してください
		
			こんにちは！ここは日本です！
			この寿司はうまい
			寿司は和食です
			今の現在日時は2023/03/09 10:23:39です
		
		【条件】
			・JavaProjectを新規作成し、実行用のpackageと処理用のpackageを作成してください。
			・適切なファイルにフィールドで変数を必要な数作ってください。
			・thisを使って作成してください。
			・日時は今日の日付を取得してください。
	
---------------------------------------------------------------------------------------------------------------- */

// 処理用のクラス
public class Process {
	
	// 国名を受け取る為のインスタンス変数 country を宣言
	private String country;
	
	// 料理名を受け取る為のインスタンス変数 dishName を宣言
	private String dishName;
	
	// 料理の種類を受け取るためのインスタンス変数 kindOfFoods を宣言
	private String kindsOfFoods;
	
	// インスタンス変数 nowDate を宣言
	private String nowDate;
	
	/*
	 * コンストラクタを生成
	 * 呼び出された際以下を出力
	 * 
	 * こんにちは！ここは日本です！
	 * この寿司はうまい
	 * 寿司は和食です
	 * 今の現在日時は「yyyy/MM/dd H:m:s」です
	 */
	
	public Process() {
		
		// 現在日時を取得する為、Dateクラスを生成
		Date date = new Date();
		
		// 表示を「yyyy/MM/dd H:m:s」形式にする為、SimpleDateFormatクラスを生成
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd H:m:s");
		
		// 国名「日本」を代入
		this.country = "日本";
		
		// 料理名「寿司」を代入
		this.dishName = "寿司";
		
		// 料理の種類「和食」を代入
		this.kindsOfFoods = "和食";
		
		// 現在の日時を「yyyy/MM/dd H:m:s」形式にし代入
		this.nowDate = dateFormat.format(date);
		
		if (Objects.nonNull(this.country) ) {
			
			// 国名が代入されていた場合出力
			System.out.println("\nこんにちは！ここは" + this.country + "です！");
			
		}
		
		if (Objects.nonNull(this.dishName)) {
			
			// 料理名が代入されていた場合出力
			System.out.println("この" + this.dishName + "はうまい");
			
		}
		
		if (Objects.nonNull(this.dishName) && Objects.nonNull(this.kindsOfFoods)) {
			
			// 料理名と料理の種類が代入されていた場合出力
			System.out.println(this.dishName + "は" + this.kindsOfFoods + "です");
			
		}
		
		if (Objects.nonNull(nowDate)) {
			
			// 現在の日時が代入されていた場合出力
			System.out.println("今の現在日時は" + this.nowDate + "です");
			
		}
		
	}
	
}
