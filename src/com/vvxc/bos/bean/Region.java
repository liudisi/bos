package com.vvxc.bos.bean;

// Generated 2017-5-12 22:45:22 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * BcRegion generated by hbm2java
 */
public class Region implements java.io.Serializable {

	private String id;
	private String province;
	private String city;
	private String district;
	private String postcode;
	private String shortcode;
	private String citycode;
	private Set bcSubareas = new HashSet(0);

	public Region() {
	}

	public Region(String id) {
		this.id = id;
	}

	public Region(String id, String province, String city, String district,
			String postcode, String shortcode, String citycode, Set bcSubareas) {
		this.id = id;
		this.province = province;
		this.city = city;
		this.district = district;
		this.postcode = postcode;
		this.shortcode = shortcode;
		this.citycode = citycode;
		this.bcSubareas = bcSubareas;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getProvince() {
		return this.province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return this.district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getPostcode() {
		return this.postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getShortcode() {
		return this.shortcode;
	}

	public void setShortcode(String shortcode) {
		this.shortcode = shortcode;
	}

	public String getCitycode() {
		return this.citycode;
	}

	public void setCitycode(String citycode) {
		this.citycode = citycode;
	}

	public Set getBcSubareas() {
		return this.bcSubareas;
	}

	public void setBcSubareas(Set bcSubareas) {
		this.bcSubareas = bcSubareas;
	}

}
