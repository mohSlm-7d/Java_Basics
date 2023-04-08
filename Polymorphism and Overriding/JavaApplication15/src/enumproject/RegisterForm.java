/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumproject;

/**
 *
 * @author M7md_2
 */
enum Gender{Male,Female};
enum Course{Database,HTML,Java,CPP,C,JavaScript};
enum Semester{Summer,Winter,Fall,Spring};
public class RegisterForm {
private String stdName;
private Gender gender;
private Course course;
private Semester semester;

public RegisterForm(){
    
}
public RegisterForm(String stdName, Gender gender, Course course, Semester semester){
this.stdName = stdName;
this.gender = gender;
this.course = course;
this.semester = semester;
}
public void print(){
    System.out.println("Student Name: "+stdName+"\nStudent Gender: "+gender+"\nCourse Name: "+course+"\nSemester: "+semester);
    }
}
