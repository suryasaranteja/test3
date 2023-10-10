package edu.neu.csye6200;

//import Student.Parent;

public class Student extends Person{
    private double gpa;
    class Parent extends Person {
        private String parentContact;

        public Parent(int id, String lastName, int age, String parentContact) {
            super(id,lastName, age);
            this.parentContact = parentContact;
        }

		public String getParentContact() {
			return parentContact;
		}

		public void setParentContact(String parentContact) {
			this.parentContact = parentContact;
		}

		@Override
		public String toString() {
			return "Parent Contact=" + parentContact + ", Parent Id= " + getId() + ", Parent Last Name= "
					+ getLastName() + ", Parent Age= " + getAge() + "";
		}		

    }

    private Parent parent;

    public Student(int id, String lastName, int age, double gpa, int parentid, String parentLastName, int parentAge, String parentContact) {
        super(id,lastName, age);
        this.gpa = gpa;
        this.parent = new Parent(parentid, parentLastName, parentAge, parentContact);
    }

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	public Parent getParent() {
		return parent;
	}

	public void setParent(Parent parent) {
		this.parent = parent;
	}

	@Override
	public String toString() {
		return "Student Id= " + getId() + ", Student LastName= " + getLastName() + ", Student Age= " + getAge() + ", Student GPA= " + gpa + "," + parent + "";
		}
	

	}
