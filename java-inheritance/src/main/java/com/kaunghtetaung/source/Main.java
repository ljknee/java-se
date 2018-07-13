package com.kaunghtetaung.source;

public class Main {

	public static void main(String[] args) {

		Person person1 = new Person();
		person1.setName("Kaung Htet Aung");

		Student student1 = new Student();
		student1.setName("Kyaw Htet Aung");
		student1.setSchool("Higashi Ojima");

		InternationalStudent intStudent1 = new InternationalStudent();
		intStudent1.setName("Akira Ogasawara");
		intStudent1.setSchool("Tokhyo");
		intStudent1.setCountry("Japan");

		Teacher teacher1 = new Teacher();
		teacher1.setName("John Stone");
		teacher1.setSubject("Soccer");

		System.out.println("  person1.getName() = " + person1.getName());
		System.out.println("  student1.getName() = " + student1.getName());
		System.out.println("  intStudent1.getName() = " + intStudent1.getName());
		System.out.println("  teacher1.getName() = " + teacher1.getName());
		
		Class class1 = intStudent1.getClass();
		
		System.out.println("Displaying class hierarchy of International Student Class!");
		while (class1.getSuperclass() != null) {
			String child = class1.getName();
			String parent = class1.getSuperclass().getName();
			System.out.println(" " + child + " class is a child class of " + parent);
			class1 = class1.getSuperclass();
		}

	}

}
