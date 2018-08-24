package kiet.dev;

import kiet.dev.models.Person;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String arrName[] = {"Bao", "Tu", "Tao", "Teo", "Nam"};
		final int arrOld[] = {21, 25, 26, 15, 16};
		
		Person arrPerson[] = new Person[arrName.length];
		for(int i=0; i < arrPerson.length; i++) {
			Person p = new Person(arrName[i], arrOld[i]);
			arrPerson[i] = p;
		}
		
		for(int i=0; i < arrPerson.length; i++) {
			arrPerson[i].show();
		}
	}
}
