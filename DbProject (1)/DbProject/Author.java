/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Backend;

import java.util.ArrayList;

public class Author {
    private String A_name;

    public Author(String A_name) {
       this.setA_name(A_name);
        
    }
    private int Author_id;
    int contact;
    int email;
    ArrayList<Book> book;
    
    public int getContact() {
        return contact;
    }
    public void setContact(int contact) {
        this.contact = contact;
    }
    public int getEmail() {
        return email;
    }
    public void setEmail(int email) {
        this.email = email;
    }
    public String getA_name() {
        return A_name;
    }
    public void setA_name(String a_name) {
        A_name = a_name;
    }
    public int getAuthor_id() {
        return Author_id;
    }
    public void setAuthor_id(int author_id) {
        Author_id = author_id;
    }

    public void viewBook(){

        System.out.println("Author Name: "+A_name);

        for (int i=0; i<book.size();i++){
            System.out.println("Book "+(i+1)+": "+book.get(i));
        }
    

    }
}

