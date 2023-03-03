/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vankaitlynprogrammingckpt2;

/**
 *
 * @author kaitlynvan
 */
public class PremiumMember extends Member{

    /**
     *
     */
    protected double membershipFee;

    /**
     *
     */
    protected String paymentMethod;

    /**
     *
     */
    protected boolean feePaidOnTime;
    
    /**
     *
     * @param idNumber
     * @param fName
     * @param lName
     * @param accountTranscation
     * @param membershipFee
     * @param paymentMethod
     * @param feePaidOnTime
     */
    public PremiumMember(int idNumber, String fName, String lName, double accountTranscation, double membershipFee, String paymentMethod, boolean feePaidOnTime ) {
        super(idNumber, fName, lName, accountTranscation); // holds info from superclass
        this.membershipFee = membershipFee;
        this.paymentMethod = paymentMethod;
        this.feePaidOnTime = feePaidOnTime;
    }

    /**
     * get the membership fee
     * @return
     */
    public double getMembershipFee() {
        return membershipFee;
    }

    /**
     * gets the payment method 
     * @return
     */
    public String getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * checks if fee was paid on time
     * @return
     */
    public boolean isFeePaidOnTime() {
        return feePaidOnTime;
    }

    /**
     * set the membership fee
     * @param membershipFee
     */
    public void setMembershipFee(double membershipFee) {
        this.membershipFee = membershipFee;
    }

    /**
     * set the payment method
     * @param paymentMethod
     */
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    /**
     * checks if the fee was paid on time
     * @param feePaidOnTime
     */
    public void setFeePaidOnTime(boolean feePaidOnTime) {
        this.feePaidOnTime = feePaidOnTime;
    }
    //displays the info of the premium member
    @Override
    public void display(){
       System.out.println("Name: " +this.firstName + " " + this.lastName);
        System.out.println("ID: " + this.idNumber);
        System.out.println("Account Transaction: " + this.accountTranscation);
        System.out.println("Membership Fee: "+this.membershipFee+ "\tPayment Method: "+this.paymentMethod);
        System.out.println("Fee Paid on Time : " + this.feePaidOnTime);
        
        }
    }

