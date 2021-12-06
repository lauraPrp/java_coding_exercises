package com.techreturners.exercise002;

public class Exercise002 {

    public boolean isFromManchester(Person p) {
    	if(p.getCity().equals(Person.MCR)) return true;
    	
    	return false;
    }

    public boolean canWatchFilm(Person p1, int ageLimit) {
    	if(p1.getAge()>=ageLimit) return true;
    return false;
    }
    




	
	
	//"Peter", "Smith", "Manchester", 23

//	public boolean isFromManchester(Person p){
//	if(p.getCity().equals(MCR)) {
//		return true;
//	}
//return false;
//}	
static class Person{
	public static final String MCR="Manchester";
	public String name;
	public String forename;
	public String city;
	public int age;


	public Person(String name, String forename, String city, int age) {
		this.name=name;
		this.forename=forename;
		this.city=city;
		this.age=age;
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getForename() {
		return forename;
	}
	public void setForename(String forename) {
		this.forename = forename;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
}