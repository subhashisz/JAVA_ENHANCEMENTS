package com.myapp.beans;

public class Apple<T> implements Comparable<T> {
	
	private String color;
	private Integer weight;
	
	public Apple(int weight,String color) {
		this.weight=weight;
		this.color=color;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Integer getWeight() {
		return weight;
	}
	public void setWeight(Integer weight) {
		this.weight = weight;
	}
	@Override
	public int compareTo(T o) {
		Apple<T> apple=(Apple<T>)o;
		return this.getWeight() > apple.getWeight()?0:1;
	}
	
	

}
