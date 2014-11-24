package com.hxp.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="goods_cate")
public class GoodsCate {
	
	private String id;//
	private String name;//
	private String remark;//
	
	private GoodsCate parentCate;//
	private List<GoodsCate> childCates;//
	
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
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
	@ManyToOne
	@JoinColumn(name="pid")
	public GoodsCate getParentCate() {
		return parentCate;
	}
	public void setParentCate(GoodsCate parentCate) {
		this.parentCate = parentCate;
	}
	
	@OneToMany(mappedBy="parentCate")
	public List<GoodsCate> getChildCates() {
		return childCates;
	}
	public void setChildCates(List<GoodsCate> childCates) {
		this.childCates = childCates;
	}
}
