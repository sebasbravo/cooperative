package ca.cooperative.general.model;

public class City {
	
	private int cityCode;
	private String cityName;
	private State state;
	
	
	public City() {
		super();
	}


	public int getCityCode() {
		return cityCode;
	}


	public void setCityCode(int cityCode) {
		this.cityCode = cityCode;
	}


	public String getCityName() {
		return cityName;
	}


	public void setCityName(String cityName) {
		this.cityName = cityName;
	}


	public State getState() {
		return state;
	}


	public void setState(State state) {
		this.state = state;
	}
	
	

}
