package curriculum28_29.curriculum28_29_sub;

import static java.util.Map.*;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;
import java.util.Map;

/*

	0, "北海道:札幌市:83424"
	1, "青森県:青森市:9646"
	2, "岩手県:盛岡市:15275"
	3, "宮城県:仙台市:7282"
	4, "秋田県:秋田市:11638"
	5, "山形県:山形市:9323"
	6, "福島県:福島市:13784"
	7, "茨城県:水戸市:6097"
	8, "栃木県:宇都宮市:6408"
	9, "群馬県:前橋市:6362"
	10, "埼玉県:さいたま市:3798"

	コンソールに数字と昇順・降順の値が入力されると上記配列に対応する
	都道府県がソートされてコンソールに出力されるように作ってください
	※Packageを2つ作ってください
	※複数選択できるようにしてください

	例:
	8,5,9,.....
	と入力された場合（昇順）

	都道府県名：山形県
	県庁所在地：山形市
	面積：9323.0km2

	都道府県名：栃木県
	県庁所在地：宇都宮市
	面積：6408.0km2

	都道府県名：群馬県
	県庁所在地：前橋市
	面積：6362.0km2

 */

/**
 * 数字を受け取り一致する
 * 都道府県の情報を出力するクラス
 */
public class PrefectureData {

	/**
	 * 受け取った数字に一致する
	 * 都道府県の情報を返すメソッド
	 * @param 入力された索引
	 */
	public void createMap(List<Integer> list) {
		
		/**
		 * 都道府県の情報
		 * 都道府県名, 県庁所在地名, 面積 
		 */
		Map<Integer, PrefectureBean> prefectureData = Map.ofEntries(
				entry(0, new PrefectureBean("北海道", "札幌市", 83424)),
				entry(1, new PrefectureBean("青森県", "青森市", 9646)),
				entry(2, new PrefectureBean("岩手県", "盛岡市", 15275)),
				entry(3, new PrefectureBean("宮城県", "仙台市", 7282)),
				entry(4, new PrefectureBean("秋田県", "秋田市", 11638)),
				entry(5, new PrefectureBean("山形県", "山形市", 9323)),
				entry(6, new PrefectureBean("福島県", "福島市", 13784)),
				entry(7, new PrefectureBean("茨城県", "水戸市", 6097)),
				entry(8, new PrefectureBean("栃木県", "宇都宮市", 6408)),
				entry(9, new PrefectureBean("群馬県", "前橋市", 6362)),
				entry(10, new PrefectureBean("埼玉県", "さいたま市", 3798)));
		
		// 入力された数字
		List<Integer> indexes = list;
			
		// 入力された数字の分だけ繰り返す
		for (Integer index : indexes) {
			
			// 範囲外の数字が入力された場合処理を終了
			if (prefectureData.size() < index + 1) {
				
				System.err.println("\n0～" + prefectureData.size() + "までの範囲で数字を入力してください");
				
				System.exit(0);
				
			}
			
			// 都道府県の情報をファイルに保存
			inputPrefectureData(prefectureData.get(index));
			
		}
		
	}

	/**
	 * 保存した都道府県情報をフォーマットに入れ出力
	 * @parm 都道府県名, 県庁所在地, 面積
	 */
	public void printPrefecture(String prefectureName, String cityName, int area) {
		
		// フォーマット
		String text = """
				
				都道府県名:%s
				県庁所在地:%s
				面積:%.1fkm2
				""";
		
		// 面積を小数に変換
		double doubleArea = area;
		
		// フォーマットに引数を入れ出力
		System.out.printf(text, prefectureName, cityName, doubleArea);
		
	}

	/**
	 * 選択された都道府県の情報をファイルに保存
	 * @parm 都道府県の情報
	 */
	public void inputPrefectureData(PrefectureBean pb) {
		
		// 引数を元にインスタンスを生成
		PrefectureBean beanOut = pb;
		
		// データを保存するファイル
		String fileName = "binary.bin";
		
		// ファイルに保存
		try {
			// ファイルに保存をするためのストリーム
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName));
			
			// 都道府県の情報を保存
			oos.writeObject(beanOut);
			
			// ストリームを閉じる
			oos.close();
			
		} catch (Exception e) {
			
			// エラー箇所を表示
			e.printStackTrace();
			
		}
		
		// 復元用インスタンス
		PrefectureBean beanIn = null;
		
		// ファイルを復元
		try {
			// ファイルを復元するためのストリーム
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName));
			
			// インスタンスを復元
			beanIn = (PrefectureBean) ois.readObject();
			
			// ストリームを閉じる
			ois.close();
			
		} catch (Exception e) {
			
			// エラー箇所を表示
			e.printStackTrace();
			
			return;
		
		}
		
		// 都道府県名
		String prefectureName = beanIn.getPrefectureName();
		
		// 県庁所在地名
		String cityName = beanIn.getCityName();
		
		// 面積
		int area = beanIn.getArea();
		
		// 出力用メソッド
		printPrefecture(prefectureName, cityName, area);
	
	}

}
