/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;

public class Book {
    private int ISBN;
    private String B_title;
    private String B_category;
    private int B_edition;
    private int B_price;
    Author B_author;
    Reader reader;
    public Book(int iSBN, String b_title, String b_category, int b_edition, int b_price) {
        this.ISBN = iSBN;
        this.B_title = b_title;
        this.B_category = b_category;
        this.B_edition = b_edition;
        this.B_price = b_price;
       
    }
    public int getISBN() {
        return ISBN;
    }
    public void setISBN(int iSBN) {
        ISBN = iSBN;
    }
    public String getB_title() {
        return B_title;
    }
    public void setB_title(String b_title) {
        B_title = b_title;
    }
    public String getB_category() {
        return B_category;
    }
    public void setB_category(String b_category) {
        B_category = b_category;
    }
    public int getB_edition() {
        return B_edition;
    }
    public void setB_edition(int b_edition) {
        B_edition = b_edition;
    }
    public int getB_price() {
        return B_price;
    }
    public void setB_price(int b_price) {
        B_price = b_price;
    }
    public Author getB_author() {
        return B_author;
    }
     
    public void checkAvailibility(String bookname){
      String queury = "select * from table_name where B_title = "+bookname;


    }
    
  
}

