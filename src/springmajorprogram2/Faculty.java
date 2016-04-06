/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springmajorprogram2;

import java.util.ArrayList;

/**
 *
 * @author saqua
 */
public class Faculty extends Employee{
    
    private String rank = "";
    
    private String researchArea = "";
    
    private ArrayList<Course> courses;
    
    public Faculty(){
        super();
        
        rank = "";
        
        researchArea = "";
        
        courses = new ArrayList<Course>();
        
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

    /**
     * @return the rank
     */
    public String getRank() {
        return rank;
    }

    /**
     * @param rank the rank to set
     */
    public void setRank(String rank) {
        this.rank = rank;
    }

    /**
     * @return the area
     */
    public String getArea() {
        return researchArea;
    }

    /**
     * @param area the area to set
     */
    public void setArea(String area) {
        this.researchArea = area;
    }

    /**
     * @return the courses
     */
    public ArrayList<Course> getCourses() {
        return courses;
    }

    /**
     * @param courses the courses to set
     */
    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }
    public String toString(){
        String largeString6 = "";
        
        largeString6 = super.toString()+rank+", "+researchArea+ "\n";
        
        
            largeString6 += courses.toString();
        
        
        return largeString6;
    }
    
    
}
