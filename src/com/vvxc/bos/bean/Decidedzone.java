package com.vvxc.bos.bean;

// Generated 2017-5-12 22:45:22 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

/**
 * BcDecidedzone generated by hbm2java
 */
public class Decidedzone implements java.io.Serializable {

	private String id;
	private Staff bcStaff;
	private String name;
	private Set bcSubareas = new HashSet(0);

	public Decidedzone() {
	}

	public Decidedzone(String id) {
		this.id = id;
	}

	public Decidedzone(String id, Staff bcStaff, String name, Set bcSubareas) {
		this.id = id;
		this.bcStaff = bcStaff;
		this.name = name;
		this.bcSubareas = bcSubareas;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Staff getBcStaff() {
		return this.bcStaff;
	}

	public void setBcStaff(Staff bcStaff) {
		this.bcStaff = bcStaff;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set getBcSubareas() {
		return this.bcSubareas;
	}

	public void setBcSubareas(Set bcSubareas) {
		this.bcSubareas = bcSubareas;
	}

}