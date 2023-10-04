package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Person2 {
	@Id
  private int person_id;
  private String first_name;
  private String last_name;
  
  
public Person2() {

}
public Person2(int person_id, String first_name, String last_name) {
	super();
	this.person_id = person_id;
	this.first_name = first_name;
	this.last_name = last_name;
}
public int getperson_id() {
	return person_id;
}
public void setperson_id(int person_id) {
	this.person_id = person_id;
}
public String getfirst_name() {
	return first_name;
}
public void setfirst_name(String first_name) {
	this.first_name = first_name;
}
public String getlast_name() {
	return last_name;
}
public void setlast_name(String last_name) {
	this.last_name = last_name;
}
}
