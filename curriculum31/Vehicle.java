package curriculum31;

public class Vehicle {
	
	// Q1：Vehicleクラスを作成し、String型のprivateなインスタンスフィールド「owner」を定義しましょう。
	
	// 乗り物のオーナー名
	private String owner;

	// Q3：Vehicleクラスにownerフィールドのゲッター「getOwner」とセッター「setOwner」を定義しましょう。
	
	/**
	 * 乗り物のオーナー名を返す
	 * @return オーナー名
	 */
	public String getOwner() {
		return owner;
	}

	/**
	 * 乗り物のオーナー名を格納
	 * @param オーナー名
	 */
	public void setOwner(String owner) {
		this.owner = owner;
	}

}
