package com.smart.book.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Happy")
public class Book {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int Happy_id;
	private String Happy_name;
	private String Happy_authorName;
	private int Happy_cost;

	public int getHappy_id() {
		return Happy_id;
	}

	public void setHappy_id(int happy_id) {
		Happy_id = happy_id;
	}

	public String getHappy_name() {
		return Happy_name;
	}

	public void setHappy_name(String happy_name) {
		Happy_name = happy_name;
	}

	public String getHappy_authorName() {
		return Happy_authorName;
	}

	public void setHappy_authorName(String happy_authorName) {
		Happy_authorName = happy_authorName;
	}

	public int getHappy_cost() {
		return Happy_cost;
	}

	public void setHappy_cost(int happy_cost) {
		Happy_cost = happy_cost;
	}

	
	public Book(String happy_name, String happy_authorName, int happy_cost) {
		Happy_name = happy_name;
		Happy_authorName = happy_authorName;
		Happy_cost = happy_cost;
	}

	

	public Book() {
	}
	@Override
	public String toString() {
		return "Book [Happy_id=" + Happy_id + ", Happy_name=" + Happy_name + ", Happy_authorName=" + Happy_authorName
				+ ", Happy_cost=" + Happy_cost + "]";
	}
}
