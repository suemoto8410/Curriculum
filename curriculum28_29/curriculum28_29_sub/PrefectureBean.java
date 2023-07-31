package curriculum28_29.curriculum28_29_sub;

import java.io.Serializable;

/**
 * Beanクラス 
 * 都道府県の情報を格納
 */
public class PrefectureBean implements Serializable {
	
	/**
	 * シリアルバージョンUID
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 都道府県名
	 */
	private String prefectureName;
	
	/**
	 * 県庁所在地
	 */
	private String cityName;
	
	/**
	 * 面積
	 */
	private int area;
	
	/**
	 *  newなし用
	 */
	public PrefectureBean() {};
	
	/**
	 * 都道府県の情報を設定
	 * @param 都道府県名
	 * @param 県庁所在地名
	 * @param 面積
	 */
	public PrefectureBean(String prefectureName, String cityName, int area) {
		
		this.prefectureName = prefectureName;
		
		this.cityName = cityName;
		
		this.area = area;
	
	}
	
	/**
	 * 設定された都道府県名を返す
	 * @return　都道府県名
	 */
	public String getPrefectureName() {
		return prefectureName;
	}

	/**
	 * 都道府県名を設定
	 * @param 都道府県名
	 */
	public void setPrefectureName(String prefectureName) {
		this.prefectureName = prefectureName;
	}

	/**
	 * 設定された県庁所在地を返す
	 * @return 県庁所在地名
	 */
	public String getCityName() {
		return cityName;
	}

	/**
	 * 県庁所在地を設定
	 * @param 県庁所在地名
	 */	
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	/**
	 * 設定された面積を返す
	 * @return 面積
	 */
	public int getArea() {
		return area;
	}

	/**
	 * 面積を設定
	 * @param 面積
	 */
	public void setArea(int area) {
		this.area = area;
	}

}
