package kiet.dev.models;

public class Person {
	private String name;
	private int old;
	
	public Person(String name, int old) {
		this.name = name;
		this.old = old;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public int getOld() {
		return old;
	}
	
	public void show() {
		System.out.println(name + " : " + old);
	}
}
