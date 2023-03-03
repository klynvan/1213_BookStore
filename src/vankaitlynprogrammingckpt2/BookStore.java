/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vankaitlynprogrammingckpt2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author kaitlynvan
 */
public class BookStore {

    // creating objects 
    ArrayList<Product> productList = new ArrayList();
    private Books book1 = new Books(010, 5, 5.99, "Tweenty Moons");
    private Books book2 = new Books(015, 5, 13.99, "Twilight");
    private CDs cd1 = new CDs(210, 10, 11.99, "Justice", "Justin Bieber");
    private CDs cd2 = new CDs(215, 12, 14.24, "Chilombo", "Jhene Aiko");
    private DVDs dvd1 = new DVDs(310, 5, 7.99, "The Fault in Our Stars");
    private DVDs dvd2 = new DVDs(315, 7, 5.23, "The Little Mermaid");
    Member member1 = new Member(1234567890, "David", "Yurman", 8.23);

    Member member2 = new Member(1112223333, "Lisa", "Phan", 8.23);
    int addedproduct = 0;
    int transaction = 0;
    int numOfNewMembers = 0;

    /**
     *
     */
    public BookStore() throws FileNotFoundException {
        // adds all the products to the array list
        productList.add(book1);
        productList.add(book2);
        productList.add(cd1);
        productList.add(cd2);
        productList.add(dvd1);
        productList.add(dvd2);
        members.add(member1);
        members.add(member2);

        /**File inventoryFile = new File("/Users/kaitlynvan/Desktop/BookIventory.csv");
        PrintWriter outFS = new PrintWriter(inventoryFile);
        Scanner scnr = new Scanner(new File("ProductInventory.csv"));
        scnr.nextLine();
        ArrayList<Product> itemList = new ArrayList();
        while (scnr.hasNextLine()) {
            String line = scnr.nextLine();
            String[] items = line.split(",");
            //System.out.println(items[1]);
            if (items[1].equals("book")) {
                int itemNumber = Integer.parseInt(items[0]);
                String title = items[2];
                int productAmmount = Integer.parseInt(items[4]);
                double price = Double.parseDouble(items[5]);

                Books newbook = new Books(itemNumber, productAmmount, price, title);
                itemList.add(newbook);
            } else if (items[1].equals("cd")) {
                int itemNumber = Integer.parseInt(items[0]);
                String cdName = items[2];
                String artistName = items[3];
                int productAmmount = Integer.parseInt(items[4]);
                double price = Double.parseDouble(items[5]);

                CDs newCD = new CDs(itemNumber, productAmmount, price, cdName, artistName);
                itemList.add(newCD);
            } else if (items[1].equals("dvd")) {
                int itemNumber = Integer.parseInt(items[0]);
                String dvdName = items[2];
                int productAmmount = Integer.parseInt(items[4]);
                double price = Double.parseDouble(items[5]);

                DVDs newDVD = new DVDs(itemNumber, productAmmount, price, dvdName);
                itemList.add(newDVD);

            }
        }
        for (int i = 0; i < itemList.size(); i++) {
            for (Product items : itemList) {
                if (items instanceof Books) {
                    outFS.println(items.getProductID() + "," + "book" + "," + "," + items.getCount() + "," + items.getPrice());
                } else if (items instanceof CDs) {
                    outFS.println(items.getProductID() + "," + "cd" + "," + items.getCount() + "," + items.getPrice());
                }
                 else if (items instanceof DVDs) {
                    outFS.println(items.getProductID() + "," + "dvd"  + "," + items.getCount() + "," + items.getPrice());
                }
            }
        }
        outFS.close();

        FileOutputStream fss = new FileOutputStream("/Users/kaitlynvan/Desktop/EndofDayReport.txt");
        PrintWriter outFSS = new PrintWriter(fss);
        outFSS.println("End of Day Report:");
        outFSS.println("Ammount of New Members:");
        outFSS.println(numOfNewMembers);
        outFSS.println("Ammount of New products");
        outFSS.println(addedproduct);
        outFSS.println("Ammount of Daily Transactions:");
        outFSS.println(transaction);
        outFSS.println("Book Invetory");
        for (Product newbook : itemList) {
            outFSS.println(newbook.getCount());
        }
        outFSS.println("CD Invetory");
        for (Product newCD : itemList) {
            outFSS.println(newCD.getCount());
        }
        outFSS.println("DVD Invetory");
        for (Product newDVD : itemList) {
            outFSS.println(newDVD.getCount());
        }
        outFSS.close();
        
        
        File updatedinventoryFile = new File("/Users/kaitlynvan/Desktop/updatedinventory .csv");
        PrintWriter outUIF = new PrintWriter(updatedinventoryFile);
        outUIF.println("Updated Inventory:");
        for (Product updateditems : itemList) {
            outUIF.println(updateditems.getCount());
        }
        outUIF.close();
        */
        
    }

    /**
     * method to print out the list of products
     *
     * @return
     */
    public ArrayList<Product> getList() {
        for (int i = 0; i < productList.size(); i++) {
            System.out.println(productList.get(i));
        }
        return productList;
    }

    ArrayList<Member> members = new ArrayList(); // array list for the members 
    private static int nextMember;
    protected int idNumber;
    protected String firstName;
    protected String lastName;
    protected double accountTranscation;

    /**
     * get the nextmemeer
     *
     * @return
     */
    public int getnextOrdernum() {
        return nextMember;
    }

    //moves onto nect member
    private static void incrementNextOrderNum() {
        nextMember = nextMember + 1;
    }

    /**
     * method to get the member array list
     *
     * @return
     */
    public int getOrder() {
        return members.size();
    }

    /**
     * method to add a new member
     *
     * @param idNumber
     * @param firstName
     * @param lastName
     * @param accountTranscation
     * @return
     */
    public int addnewMember(int idNumber, String firstName, String lastName, double accountTranscation) {
        numOfNewMembers = +1;
        Member newMember = new Member(idNumber, firstName, lastName, accountTranscation);
        members.add(newMember);
        int orderID = getnextOrdernum();
        incrementNextOrderNum();
        return orderID;
    }

    /**
     * method to make a purchase
     *
     * @param productID
     * @return
     */
    public boolean buyProduct(int productID) {
        transaction = +1;
        boolean itemID = true;
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).equals(productID)) {
                productList.remove(i);
                itemID = false;

            } else {
                itemID = true;
            }
        }

        return itemID;
    }

    /**
     * method to add book to the product array list
     *
     * @param itemNumber
     * @param productAmmount
     * @param price
     * @param title
     * @return
     */
    public int addBook(int itemNumber, int productAmmount, double price, String title) {
        addedproduct = +1;
        Books newbook = new Books(itemNumber, productAmmount, price, title);
        productList.add(newbook);
        int orderID = getnextOrdernum();
        incrementNextOrderNum();
        return orderID;
    }

    /**
     * method to add cd to the product array list
     *
     * @param itemNumber
     * @param productAmmount
     * @param price
     * @param cdName
     * @param artistName
     * @return
     */
    public int addCD(int itemNumber, int productAmmount, double price, String cdName, String artistName) {
        addedproduct = +1;
        CDs newCD = new CDs(itemNumber, productAmmount, price, cdName, artistName);
        productList.add(newCD);
        int orderID = getnextOrdernum();
        incrementNextOrderNum();
        return orderID;
    }

    /**
     * method to add dvd to the product array list
     *
     * @param itemNumber
     * @param productAmmount
     * @param price
     * @param dvdName
     * @return
     */
    public int addDVD(int itemNumber, int productAmmount, double price, String dvdName) {
        addedproduct = +1;
        DVDs newDVD = new DVDs(itemNumber, productAmmount, price, dvdName);
        productList.add(newDVD);
        int orderID = getnextOrdernum();
        incrementNextOrderNum();
        return orderID;
    }

}
