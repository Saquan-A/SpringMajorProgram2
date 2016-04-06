/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package springmajorprogram2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author saqua
 */
public class Person {
    
    protected String firstname = "";
    
    protected String lastname = "";
    
    protected String bannerID = "";
    
    protected Date birthDate = null;
    
    protected String phoneNumber = "";
    
    public Person(){
        firstname = "";
        lastname = "";
        bannerID = "";
        birthDate = null;
        phoneNumber = "";
    }
    
    public Person(String firstname, String lastname, String bannerID, Date birthDate, String phoneNumber){
        this.firstname = firstname;
        this.lastname = lastname;
        this.bannerID = bannerID;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
    }

    /**
     * @return the firstname
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * @param firstname the firstname to set
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     * @return the lastname
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * @param lastname the lastname to set
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * @return the bannerID
     */
    public String getBannerID() {
        return bannerID;
    }

    /**
     * @param bannerID the bannerID to set
     */
    public void setBannerID(String bannerID) {
        this.bannerID = bannerID;
    }

    /**
     * @return the birthDate
     */
    public Date getBirthDate() {
        return birthDate;
    }

    /**
     * @param birthDate the birthDate to set
     */
    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    /**
     * @return the phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    private String dateToString(Date date){
        DateFormat df =  new SimpleDateFormat("MM/dd/yyyy");
        return df.format(date);
        
    }
    
    @Override
    public String toString(){
      String largeString = "";
      
      largeString = firstname+", "+lastname+", "+bannerID+", "+dateToString(birthDate)+", "+phoneNumber+"\n";
      
      return largeString;
        
    }
    
    
}
