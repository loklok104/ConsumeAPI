package com.enfec.comsumeapi.model;

public class Geo {
	private String lat;
	private String lng;
//	public Geo(String lat, String lng) {
//		super();
//		this.lat = lat;
//		this.lng = lng;
//	}
	public String getLat() {
		return lat;
	}
	public String getLng() {
		return lng;
	}
	public void setLat(String lat) {
		this.lat = lat;
	}
	public void setLng(String lng) {
		this.lng = lng;
	}
	
//	@Override
//	public String toString() {
//		return "Geo [lat=" + lat + ", lng=" + lng + "]";
//	}
}
