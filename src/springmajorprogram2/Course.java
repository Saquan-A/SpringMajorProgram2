/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springmajorprogram2;

/**
 *
 * @author saqua
 */
public class Course {
    
    private String courseCode = "";
    
    private int creditHours = 0;
    
    private String startTime = "";
    
    private String endTime = "";
    
    public Course(){
        
    }
    
    public Course(String courseCode, int creditHours, String startTime, String endTime){
        this.courseCode = courseCode;
        
        this.creditHours = creditHours;
        
        this.startTime = startTime;
        
        this.endTime = endTime;
        
    }
    
    @Override
    public String toString(){
        String largeString2 = " ";
        
        largeString2 = courseCode+", "+creditHours+", "+startTime+", "+endTime;
        
        
        return largeString2;
    }

    /**
     * @return the courseCode
     */
    public String getCourseCode() {
        return courseCode;
    }

    /**
     * @param courseCode the courseCode to set
     */
    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
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
     * @return the startTime
     */
    public String getStartTime() {
        return startTime;
    }

    /**
     * @param startTime the startTime to set
     */
    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * @return the endTime
     */
    public String getEndTime() {
        return endTime;
    }

    /**
     * @param endTime the endTime to set
     */
    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }
}
