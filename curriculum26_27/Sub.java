package curriculum26_27;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

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

// 処理クラス
public class Sub {
	
	// 入力を受け取り動物のデータを要素毎に分け出力
	protected static void inputProcessor() throws IOException {
		
		// 入力を受け取るインスタンス
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		// 入力を受け取り各動物毎に格納
		List<String> inputList = new ArrayList<>(Arrays.asList(reader.readLine().split("[,]")));
		
		// 格納した値を要素毎に渡す
		Iterator<String> inputList_iterated = inputList.iterator();
		
		// 各動物のデータを受け取る用
		List<String> animalData;
		
		// 要素を受け取り受け取った分繰り返す
		while (inputList_iterated.hasNext()) {
			
			// 「動物名」、「体長」、「速度」に分けて格納
			animalData = new ArrayList<>(Arrays.asList(inputList_iterated.next().split(":")));
			
			// 受け取った各動物の情報を出力
			System.out.println("動物名:" + animalData.get(0) +
								"\n体長:" + animalData.get(1) + "m" +
								"\n速度:" + animalData.get(2) + "km/h" +
								"\n学名:" + switchScientificName(animalData.get(0)) + "\n");
		
		}
	
	}
	
	// 動物名を受け取りそれぞれの学名を渡す
	protected static String switchScientificName(String animalName) {
		
		// 学名
		switch(animalName) {
		
		case "ライオン":
			
			return "パンテラ レオ";
			
		case "ゾウ":
			
			return "ロキソドンタ・サイクロティス";
			
		case "パンダ":
			
			return "アイルロポダ・メラノレウカ";
			
		case "チンパンジー":
			
			return "パン・トゥログロディテス";
			
		case "シマウマ":
			
			return "チャップマンシマウマ";
			
		case "インコ":
			
			return "不明"; 
			
		default:
			
			return "";
		
		}
	
	}

}
