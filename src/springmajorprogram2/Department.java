/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springmajorprogram2;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author saqua
 */
public class Department {
    
    private String name = "";
    
    private String location = "";
    
    private ArrayList<Employee> employees;
    
    private ArrayList<Student> students;
    
    public Department(){
        
        name = "";
        
        location = "";
        
        employees = new ArrayList<Employee>();
        
        students =  new ArrayList<Student>();
        
    }
    
    public int getStudent(){
        return students.size();
    }
    public Student getstudent(int index){
        return students.get(index); 
    }
    public void setStudent(int index, Student item ) {
        students.set(index, item);
    }
    public void addStudent(Student item) {
        students.add(item);
    }
    public void removestudent(int index){
        students.remove(index);
    }
    public void clearstudent(){
        for (int i = 0; i<students.size(); i++){
            students.remove(i);
        }
    }
    
     public int getEmployee(){
        return employees.size();
    }
    public Employee getemployee(int index){
        return employees.get(index); 
    }
    public void setEmployee(int index, Employee item ) {
        employees.set(index, item);
    }
    public void addEmployee( Employee item) {
        employees.add(item);
    }
    public void removeemployee(int index){
        employees.remove(index);
    }
    public void clearemployee(){
        for (int i = 0; i<employees.size(); i++){
            employees.remove(i);
        }
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the location
     */
    public String getLocation() {
        return location;
    }

    /**
     * @param location the location to set
     */
    public void setLocation(String location) {
        this.location = location;
    }
    //string[] tokens = (scanner.nextLine()).split(",")
    
    public void readDepartment(String infileName){
        
        
        try{
        File data = new File(infileName);
        Scanner reader = new Scanner(data);
        
        String[] lineVector;
        
        setName(reader.nextLine());
        setLocation(reader.nextLine());
        
        
        
        
        while(reader.hasNext()){
            
           String type = reader.nextLine();
            
            if(type.equals("F")){
                Faculty nFac = new Faculty();
                
                String line = reader.nextLine();
                
                lineVector = line.split(",");
                
                nFac.setFirstname(lineVector[0].trim());                
                nFac.setLastname(lineVector[1].trim());                
                nFac.setBannerID(lineVector[2].trim());              
                nFac.setBirthDate(stringToDate(lineVector[3].trim()));                
                nFac.setPhoneNumber(lineVector[4].trim());

                line = reader.nextLine();
                
                lineVector = line.split(",");
                
                nFac.setHireDate(stringToDate(lineVector[0].trim()));
                nFac.setStatus(lineVector[1].trim());
                nFac.setDepartment(lineVector[2].trim());
                
                line = reader.nextLine();
                
                lineVector = line.split(",");
                
                
                nFac.setRank(lineVector[0].trim());
                nFac.setArea(lineVector[1].trim());
                
                line = reader.nextLine();

                while(!line.equals("*")){
                Course course = new Course();
                lineVector = line.split(",");
                course.setCourseCode(lineVector[0].trim());
                course.setCreditHours(Integer.parseInt(lineVector[1].trim()));
                course.setStartTime(lineVector[2].trim());
                
                course.setEndTime(lineVector[3].trim());
                nFac.addCourse(course);
                line = reader.nextLine();

                }
                addEmployee(nFac);
                 
                
                
                
                
                
            }
            if(type.equals("S")){
                Staff nSta = new Staff();
                
                String line = reader.nextLine();
                lineVector = line.split(",");
                
                
                nSta.setFirstname(lineVector[0].trim());
                nSta.setLastname(lineVector[1].trim());                
                nSta.setBannerID(lineVector[2].trim());              
                nSta.setBirthDate(stringToDate(lineVector[3].trim()));                
                nSta.setPhoneNumber(lineVector[4].trim());
               
                line = reader.nextLine();
                lineVector = line.split(",");
                
                nSta.setHireDate(stringToDate(lineVector[0].trim()));
                nSta.setStatus(lineVector[1].trim());
                nSta.setDepartment(lineVector[2].trim());
                
                nSta.setJobTitle(reader.nextLine());
                
                line = reader.nextLine();
                lineVector = line.split(",");
                
                Person p = new Person(lineVector[0].trim(), lineVector[1].trim(), lineVector[2].trim(), stringToDate(lineVector[3].trim()), lineVector[4].trim());
                nSta.setSupervisor(p);
                
                line = reader.nextLine();
                lineVector = line.split(",");
                
                nSta.setCareerBand(lineVector[0].trim());
                
                addEmployee(nSta);
                
                
                

                
                
                
            }
            if(type.equals("U")){
                
                Student nStu = new Student();
                
                String line = reader.nextLine();
                lineVector = line.split(",");
                
                nStu.setFirstname(lineVector[0].trim());
                nStu.setLastname(lineVector[1].trim());                
                nStu.setBannerID(lineVector[2].trim());              
                nStu.setBirthDate(stringToDate(lineVector[3].trim()));                
                nStu.setPhoneNumber(lineVector[4].trim());
                
                line = reader.nextLine();
                lineVector = line.split(",");
                
                nStu.setMajor(lineVector[0].trim());
                nStu.setCreditHours(Integer.parseInt(lineVector[1].trim()));
                nStu.setGpa(Float.parseFloat(lineVector[2].trim()));
                
                line = reader.nextLine();
                
                while(!line.equals("*")){
                Course course = new Course();
                lineVector = line.split(",");
                course.setCourseCode(lineVector[0].trim());
                course.setCreditHours(Integer.parseInt(lineVector[1].trim()));
                course.setStartTime(lineVector[2].trim());
                course.setEndTime(lineVector[3].trim());
                
                nStu.addCourse(course);
                
                 line = reader.nextLine();
                 
                }
                
                addStudent(nStu);
                
                
            }
            if(type.equals("G")){
                GraduateStudent gStu = new GraduateStudent();
                
                String line = reader.nextLine();
                lineVector = line.split(",");
                
                gStu.setFirstname(lineVector[0].trim());
                gStu.setLastname(lineVector[1].trim());                
                gStu.setBannerID(lineVector[2].trim());              
                gStu.setBirthDate(stringToDate(lineVector[3].trim()));                
                gStu.setPhoneNumber(lineVector[4].trim());
                
                line = reader.nextLine();
                lineVector = line.split(",");
                
                gStu.setMajor(lineVector[0].trim());
                gStu.setCreditHours(Integer.parseInt(lineVector[1].trim()));
                gStu.setGpa(Float.parseFloat(lineVector[2].trim()));
                
                line = reader.nextLine();
                
                while(!line.equals("*")){
                Course course = new Course();
                lineVector = line.split(",");
                course.setCourseCode(lineVector[0].trim());
                course.setCreditHours(Integer.parseInt(lineVector[1].trim()));
                course.setStartTime(lineVector[2].trim());
                course.setEndTime(lineVector[3].trim());
                
                gStu.addCourse(course);
                
                line = reader.nextLine();
                
                
                }
                line = reader.nextLine();
                
                
                gStu.setThesis(line);
                
                line = reader.nextLine();
                lineVector = line.split(",");
                
                gStu.setConcentration(lineVector[0].trim());
                gStu.setAssistanceType(lineVector[1].trim());
                
                addStudent(gStu);
                   
            }
          if(type.equals("*")){
              type = reader.nextLine();
          }
        }
        
        
            
        } catch (Exception ex){
            JOptionPane.showMessageDialog(null, "Incorrect File Format! Try another file!", "ERROR", JOptionPane.ERROR_MESSAGE);
            
            employees.clear();
            students.clear();
        }
    }
    public String writeDepartment(){
        String largestString = name+"\n"+location;
        for(int i = 0; i<students.size(); i++){
            largestString += getstudent(i).toString()+"\n";
        }
         for(int i = 0; i<employees.size(); i++){
            largestString += getemployee(i).toString()+"\n";
        }
        //argestString += students.toString()+"\n"+employees.toString();
        
        return largestString;
        
    }

    private Date stringToDate(String sDate) {
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy");
        
        try {
            return df.parse(sDate);
            
        } catch (Exception ex){
            System.err.println("Could not convert input date to Date object: "+sDate);
            System.exit(-1);
        }
        return null;
    }
    
}
