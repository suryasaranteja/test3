package edu.neu.csye6200;

public class Person { 
	private int id;
	private String lastName;
	private int age;

	    public Person(int id, String lastName, int age) {
	    	this.id=id;
	        this.lastName = lastName;
	        this.age = age;
	    }
    
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}


		public String getLastName() {
			return lastName;
		}

		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		@Override
		public String toString() {
			return "Person [id=" + id + ", lastName=" + lastName + ", age=" + age + "]";
		}
	    
}