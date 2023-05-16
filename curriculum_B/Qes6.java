package curriculum_B;
// Randomクラスをインポート
import java.util.Random;
// Scannerクラスをインポート
import java.util.Scanner;

public class Qes6 {

	public static void main(String[] args) {
		
		// Randomクラスを生成
		Random rnd = new Random();
		
		// Scannerクラスを生成
		Scanner scanner = new Scanner(System.in);
		
		// コンソールに家電一覧と入力の際ルールを表示
		System.out.println("パソコン、冷蔵庫、扇風機、洗濯機、加湿器、テレビ、ディスプレイの中から入力してください。");
		System.out.println("(複数入力する場合は「、」で区切って入力してください 例:パソコン、冷蔵庫、扇風機)");
		
		// コンソールに入力された値を配列として受け取る
		String[] homeAppliances = scanner.nextLine().split("、");
		
		// 配列の要素を分解
		for (String homeAppliance: homeAppliances) {
			
			// 乱数を受け取る為の変数を宣言
			int quantity;
			
			// テレビ、ディスプレイのどちらが入力されたか判別をするための真偽値、false を代入し初期化
			boolean tvOrDisplay = false;
			
			// 上記の家電の中から入力されたモノの台数を家電ごとに出力
			
			switch(homeAppliance) {
				case "パソコン":
					
				case "冷蔵庫":
					
				case "扇風機":
				
				case "洗濯機":
				
				case "加湿器":		
					
					// 0～11の間で乱数を生成し代入
					quantity = rnd.nextInt(12);
					
					// 入力された家電の残り台数を出力
					System.out.println("\n" + homeAppliance + "の残り台数は" + quantity + "台です");
					
					break;
					
				case "テレビ":
					
					// テレビが入力された場合、 trueを代入
					tvOrDisplay = true;
					
				case "ディスプレイ":
					
					// 0～11の間で乱数を生成し代入
					quantity = rnd.nextInt(12);
					
					// 入力された値が「テレビ」の場合「テレビ」を、「ディスプレイ」の場合 「ディスプレイ」を出力
					System.out.println( "\n" + (tvOrDisplay ? "テレビ":"ディスプレイ") + "の残り台数は" + quantity + "台です");
					
					break;
					
				default:
					
					// 上記以外の家電が入力された場合出力
					System.out.println("\n" + homeAppliance + "は指定の商品ではありません");
					
			}
			
		}
		
	}
	
}
