package edu.neu.csye6200;

import java.io.BufferedReader;
import java.io.FileReader;

public class Driver {
	public static void main(String[] args) {
		System.out.println("============Main Execution Start===================\n\n");
		School school = new School();
		try (BufferedReader br = new BufferedReader(new FileReader("students.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                Student student = new Student(
                        Integer.parseInt(values[0]), 
                        values[1], 
                        Integer.parseInt(values[2]), 
                        Double.parseDouble(values[3]), 
                        Integer.parseInt(values[4]),
                        values[5], 
                        Integer.parseInt(values[6]),
                        		values[7]);
                school.addStudentToStudentList(student);
                school.addStudentToPersonList(student);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        school.sortStudentListById();
        school.sortPersonListById();
        System.out.println("Sort by ID: \n"+ school);
        school.sortPersonListByAge();
        System.out.println("Sort by Age: \n"+school);
        school.sortStudentListByLastName();
        school.sortPersonListByLastName();
        System.out.println("Sort by Lastname: \n"+ school);
        school.sortStudentListByGpa();
        school.sortPersonListByGPA();
        System.out.println("Sort by GPA: \n"+ school);
        school.sortStudentListByAge();
        
        System.out.println("\n\n============Main Execution End===================");
    }		 
		
	}
