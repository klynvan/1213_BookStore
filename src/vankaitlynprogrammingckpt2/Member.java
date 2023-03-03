/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vankaitlynprogrammingckpt2;

import java.util.ArrayList;

/**
 * this is the member class
 * @author kaitlynvan
 */
public class Member {
   
    /**
     *
     */
    protected int idNumber;

    /**
     *
     */
    protected String firstName;

    /**
     *
     */
    protected String lastName;

    /**
     *
     */
    protected double accountTranscation;
    
    /**
     *
     * @param idNumber
     * @param fName
     * @param lName
     * @param accountTranscation
     */
    public Member(int idNumber, String fName, String lName, double accountTranscation) {
        this.idNumber = idNumber;
        this.firstName = fName;
        this.lastName = lName;
        this.accountTranscation = accountTranscation;
    }
    // display member info
    @Override
    public String toString() {
        return "Member Info {" + " Id Number:" + idNumber + ", First Name:" + firstName + ", Last Name:" + lastName + ", Transaction History:" + accountTranscation + '}';
    }
    
    /**
     * sets the id number member
     * @param idNumber
     */
    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    /**
     * set the first name of the member
     * @param firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * set the last name of the member
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * set how much the member has spent
     * @param accountTranscation
     */
    public void setMoneySpent(double accountTranscation) {
        this.accountTranscation = accountTranscation;
    }

    /**
     * gets the id number
     * @return
     */
    public int getIdNumber() {
        return idNumber;
    }

    /**
     * gets the first name of member
     * @return
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * get the last name of member
     * @return
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * get the money spent 
     * @return
     */
    public double getMoneySpent() {
        return accountTranscation;
    }

    /**
     * displays the information od the member
     */
    public void display(){
        System.out.println("Name: " +this.firstName + " " + this.lastName);
        System.out.println("ID: " + this.idNumber);
        System.out.println("Account Transaction: " + this.accountTranscation);
        
    }
    


}


