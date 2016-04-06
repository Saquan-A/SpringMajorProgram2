/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springmajorprogram2;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author saqua
 */
public class Student extends Person{
    
    private String major = "";
    
    private int creditHours = 0;
    
    private float gpa = 0.0f;
    
    private ArrayList<Course> courses;
    
    public Student(){
        super();
        major = "";
        creditHours = 0;
        gpa = (float) 0.0;
        courses = new ArrayList<Course>();
        
    }
    
    public Student(String firstname, String lastname, String bannerID, Date birthDate, String phoneNumber, String major, int creditHours, float gpa){
        super(firstname, lastname, bannerID, birthDate, phoneNumber);
        
        this.major = major;
        
        this.creditHours = creditHours;
        
        this.gpa = gpa;
    }
   
    
    public int getCourse(){
        return courses.size();
    }
    public Course getcoures(int index){
        return courses.get(index); 
    }
    public void setCoureses(int index, Course item ) {
        courses.set(index, item);
    }
    public void addCourse( Course item) {
        courses.add(item);
    }
    public void removecourse(int index){
        courses.remove(index);
    }
    public void clearCourse(){
        for (int i = 0; i<courses.size(); i++){
            courses.remove(i);
        }
    }
    
    @Override
    public String toString(){
        String largeString3 = "";
        
        largeString3 = super.toString()+major+", "+creditHours+", "+gpa+"\n";
        
        largeString3 += courses.toString();
        
        return largeString3;
    }

    /**
     * @return the major
     */
    public String getMajor() {
        return major;
    }

    /**
     * @param major the major to set
     */
    public void setMajor(String major) {
        this.major = major;
    }

    /**
     * @return the creditHours
     */
    public int getCreditHours() {
        return creditHours;
    }

    /**
     * @param creditHours the creditHours to set
     */
    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }

    /**
     * @return the gpa
     */
    public float getGpa() {
        return gpa;
    }

    /**
     * @param gpa the gpa to set
     */
    public void setGpa(float gpa) {
        this.gpa = gpa;
    }
    
    
    
    
    
}
