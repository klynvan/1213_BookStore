/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vankaitlynprogrammingckpt2;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author kaitlynvan
 */
public class VanKaitlynProgrammingCkpt2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
        

        System.out.println("Welcome to Kaitlyn's Book Store");
        BookStore kaitlynbookstore = new BookStore();
        MainMenu myMain = new MainMenu(kaitlynbookstore);
        myMain.setVisible(true);
        Scanner sc = new Scanner(System.in);

        while (kaitlynbookstore.getOrder() != 1) {

// see if user wants to add an order
            System.out.println("Please select from the following Book Store  options, by typing a number:");
            //if user wants to sign up
            System.out.println("\t 1. Sign Up To Become a Member");
            //if user wants to make a purchase
            System.out.println("\t 2. Complete a Purchase");
            //if user would like to sell product
            System.out.println("\t 3. Sell A Book, CD, or DVD");

            int num = sc.nextInt();
            switch (num) {
                case 1:
                    //creates a new member object
                    try {
                    System.out.println("What is your phone number witout area code? (This will be used as your id #) ");
                    int idNumber = sc.nextInt();
                    sc.nextLine();

                    System.out.println("What is your first name?");
                    String fName = sc.nextLine();

                    System.out.println("What is your last name");
                    String lName = sc.nextLine();

                    System.out.println("Account Transaction?");
                    double accountTranscations = sc.nextDouble();

                    kaitlynbookstore.addnewMember(idNumber, fName, lName, accountTranscations);

                    System.out.println("Thank-you " + fName + " " + lName + " for signing up! Your ID Number is:" + idNumber);
                    System.out.println();
                } catch (InputMismatchException ex) {
                    System.out.println("Error!, Try Again");
                } catch (Exception e) {
                    System.out.println("Error!, Try Again");
                    e.printStackTrace();
                } finally {
                }

                break;

                // allows user to buy a product    
                case 2:
                    try {
                    System.out.println("Here is our selction of books, cds, and dvds:");
                    kaitlynbookstore.getList();

                    System.out.println("What is your member #ID?");
                    int idNumber = sc.nextInt();

                    System.out.println("What is the Item ID # of the book you want?");
                    int productID = sc.nextInt();
                    sc.nextLine();

                    System.out.println("Would You like to pay with Cash or Card?");
                    String payment = sc.nextLine();

                    boolean completePurchase = false;
                    if (payment == "Cash" || payment == "Card") {
                        completePurchase = true;
                    }
                    kaitlynbookstore.buyProduct(productID);

                    System.out.println("Thank You for your purchase!");
                    System.out.println();
                } catch (InputMismatchException ex) {
                    System.out.println("Error!, Try Again");
                } catch (Exception e) {
                    System.out.println("Error!, Try Again");
                    e.printStackTrace();
                } finally {
                }
                break;
                // allows user to make a product sale
                case 3:
                    try {
                    while (kaitlynbookstore.getOrder() != 1) {
                        System.out.println(" What item did you want to sell?");
                        System.out.println("\t 1. Sell Books");
                        System.out.println("\t 2. Sell CDS");
                        System.out.println("\t 3. Sell DVDS");
                        int numbers = sc.nextInt();
                        switch (numbers) {
                            case 1:
                                int itemNumber = ((int) Math.random());
                                System.out.println("What is the name of the book?");
                                sc.nextLine();
                                String title = sc.nextLine();

                                System.out.println("How many copies do you have?");
                                int productAmmount = sc.nextInt();

                                System.out.println("How much do you want to sell it for?");
                                double price = sc.nextDouble();
                                if (price >= 15.00) {
                                    System.out.println("Sorry, we would have to decline your offer. That price is too much for the value of the book.");
                                    System.out.println();
                                } else {
                                    kaitlynbookstore.addBook(itemNumber, productAmmount, price, title);
                                    System.out.println("Thank You for selling " + title + " and for your business.");
                                    System.out.println();
                                }
                                break;
                            case 2:
                                itemNumber = ((int) Math.random());
                                System.out.println("What is the name of the CD?");
                                sc.nextLine();
                                String cdName = sc.nextLine();

                                System.out.println("Who is the artist?");
                                sc.nextLine();
                                String artistName = sc.nextLine();

                                System.out.println("How many copies do you have?");
                                productAmmount = sc.nextInt();

                                System.out.println("How much do you want to sell it for?");
                                price = sc.nextDouble();

                                if (price >= 10.00) {
                                    System.out.println("Sorry, we would have to decline your offer. That price is too much for the value of the book.");
                                    System.out.println();
                                } else {
                                    kaitlynbookstore.addCD(itemNumber, productAmmount, price, cdName, artistName);
                                    System.out.println("Thank You for selling " + cdName + " by " + artistName + " and for your business.");
                                    System.out.println();
                                }
                                break;
                            case 3:
                                itemNumber = ((int) Math.random());
                                System.out.println("What is the name of the DVD?");
                                sc.nextLine();
                                String dvdName = sc.nextLine();

                                System.out.println("How many copies do you have?");
                                productAmmount = sc.nextInt();

                                System.out.println("How much do you want to sell it for?");
                                price = sc.nextDouble();

                                if (price >= 9.99) {
                                    System.out.println("Sorry, we would have to decline your offer. That price is too much for the value of the book.");
                                    System.out.println();
                                } else {
                                    kaitlynbookstore.addDVD(itemNumber, productAmmount, price, dvdName);
                                    System.out.println("Thank You for selling " + dvdName + " and for your business.");
                                    System.out.println();
                                }
                                break;
                            default:
                                System.out.println("Sorry, but you need to enter a 1, 2,or 3");
                        }
                    }
                } catch (InputMismatchException ex) {
                    System.out.println("Error!, Try Again");
                } catch (Exception e) {
                    System.out.println("Error!, Try Again");
                    e.printStackTrace();
                } finally {
                }

                default:
                    System.out.println("Sorry, but you need to enter a 1, 2,or 3");

            }
        }
    }
}
