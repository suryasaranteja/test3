package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class School {
	List <Student> studentRoster = new ArrayList<>();
	List <Person> personRoster = new ArrayList<>();
	public void addStudentToStudentList(Student student) {
        studentRoster.add(student);
    }

    public void addStudentToPersonList(Student student) {
        personRoster.add(student);
    }

    public void sortStudentListById() {
        studentRoster.sort(Comparator.comparingInt(s -> s.getId()));
    }

    public void sortPersonListById() {
    	personRoster.sort(Comparator.comparingInt(p -> p.getId()));

    }
    public void sortStudentListByLastName() {
        studentRoster.sort(Comparator.comparing(Student::getLastName));
    }

    public void sortPersonListByLastName() {
        personRoster.sort(Comparator.comparing(Person::getLastName));
    }
    public void sortStudentListByAge() {
        studentRoster.sort(Comparator.comparingInt(s -> s.getAge()));
    }

    public void sortPersonListByAge() {
    	personRoster.sort(Comparator.comparingInt(p -> p.getAge()));
    }
    public void sortStudentListByGpa() {
        studentRoster.sort(Comparator.comparingDouble(s -> s.getGpa()));
    }

    public void sortPersonListByGPA() {
        personRoster.sort(Comparator.comparingDouble(person -> ((Student) person).getGpa()));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("Student Roster:\n");
        for (Student student : studentRoster) {
            sb.append(student).append("\n");
        }

        sb.append("\nPerson Roster:\n");
        for (Person person : personRoster) {
            sb.append(person).append("\n");
        }

        return sb.toString();
    }    
    }

