package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "HTL_TBL")
public class Hotel implements Serializable {
	
	private static final long serialVersionUID = -3465813074586304567L;
	
	@Id
	@GeneratedValue
	private int hid;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "email")
	private String email;
	
	@Column(name="buissitem")
	private String buissitem;
	
	@Column(name = "buissdesc")
	private String buissdesc;
	
	@Column(name = "cost")
	private int cost;
	
	
	
	public Hotel() {
		
	}
	
	
	public Hotel(String name, String email, String buissitem, String buissdesc, int cost) {
		
		super();
		this.name = name;
		this.email = email;
		this.buissitem = buissitem;
		this.buissdesc = buissdesc;
		this.cost = cost;
	}


	public int getHid() {
		return hid;
	}
	public void setHid(int hid) {
		this.hid = hid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getBuissitem() {
		return buissitem;
	}
	public void setBuissitem(String buissitem) {
		this.buissitem = buissitem;
	}
	public String getBuissdesc() {
		return buissdesc;
	}
	public void setBuissdesc(String buissdesc) {
		this.buissdesc = buissdesc;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}


	@Override
	public String toString() {
		return "Hotel [hid=" + hid + ", name=" + name + ", email=" + email + ", buissitem=" + buissitem + ", buissdesc="
				+ buissdesc + ", cost=" + cost + "]";
	}
	
	
	
	

}

