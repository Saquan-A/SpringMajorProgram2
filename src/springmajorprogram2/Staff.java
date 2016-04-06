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
public class Staff extends Employee {
    
    private String jobTitle = "";
    
    private Person supervisor = new Person();
    
    private String careerBand = "";
    
    public Staff(){
        super();
        
        jobTitle = "";
        
        supervisor = new Person();
        
        careerBand = "";
    }

    /**
     * @return the jobTitle
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * @param jobTitle the jobTitle to set
     */
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    /**
     * @return the supervisor
     */
    public Person getSupervisor() {
        return supervisor;
    }

    /**
     * @param supervisor the supervisor to set
     */
    public void setSupervisor(Person supervisor) {
        this.supervisor = supervisor;
    }

    /**
     * @return the careerBand
     */
    public String getCareerBand() {
        return careerBand;
    }

    /**
     * @param careerBand the careerBand to set
     */
    public void setCareerBand(String careerBand) {
        this.careerBand = careerBand;
    }
    
    public String toString(){
        String largeString7 = "";
        
        largeString7 = super.toString()+jobTitle+"\n"+"Supervisor\n"+supervisor.toString()+careerBand+"\n";
        
        return largeString7;
    }
    
    
    
}
