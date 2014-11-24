package com.hxp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="goods")
public class Goods {
	private String id;//
	private String name;//
	private String title;//
	private int price;//
	
	private GoodsCate cate;//
	
	@Id
	@GeneratedValue
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@ManyToOne
	@JoinColumn(name="cid")
	public GoodsCate getCate() {
		return cate;
	}
	public void setCate(GoodsCate cate) {
		this.cate = cate;
	}
}
