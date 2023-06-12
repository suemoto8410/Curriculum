package curriculum26_27;
// BufferredReader用の例外処理
import java.io.IOException;

/*

	コンソールに下記が入力されたときにコンソール出力結果がコンソールに表示されるように作ってください
	ライオン:2.1:80,ゾウ:3.2:40,パンダ:1.9:30,チンパンジー:0.94:25,シマウマ:2.4:65,インコ:0.1:50

	コンソール出力結果

	コンソールに文字を入力してください
	動物名：ライオン
	体長：2.1m
	速度：80km/h
	学名：パンテラ レオ

	動物名：ゾウ
	体長：3.2m
	速度：40km/h
	学名：ロキソドンタ・サイクロティス

	動物名：パンダ
	体長：1.9m
	速度：30km/h
	学名：アイルロポダ・メラノレウカ

	動物名：チンパンジー
	体長：0.94m
	速度：25km/h
	学名：パン・トゥログロディテス

	動物名：シマウマ
	体長：2.4m
	速度：65km/h
	学名：チャップマンシマウマ

	動物名：インコ
	体長：0.1m
	速度：50km/h
	学名：不明


 */
// 実行クラス処理クラスを継承
public class Main extends Sub {

	public static void main(String[] args) {
		
		// 入力指示
		System.out.println("""
							コンソールに文字を入力してください
							注意事項:「動物名:体長:速度」の順に
							各データ毎に「:」で分けて入力してください
							続けて入れる場合は「,」を入力してください
							例(ライオン:2.1:80,ゾウ…)""");
		
		try {
			// 入力を処理
			inputProcessor();
			
		} catch(IndexOutOfBoundsException | NullPointerException e) {
			
			// エラーがあった場合出力
			System.out.println("正しく入力してください");
			
		} catch(IOException e) {
			
			// エラーがあった場合エラー箇所を出力
			e.printStackTrace();
			
		} finally {
			
			// 処理を終了
			System.exit(0);
		
		}
	
	}

}