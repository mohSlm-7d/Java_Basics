/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package astractproject;

/**
 *
 * @author M7md_2
 */
public class CD implements RetailItem{
    private double price;
    private String title;
    private String artist;

    public CD() {
    }
    
    /*public void cd(); if the class has an abstract method,
    the class will be abstract and you're forced 
    to use abstract keyword in the class prototype.*/
    public CD(double price, String title, String artist){
        this.price = price;
        this.title = title;
        this.artist = artist;
    }
    
    public double get_price(){
        return price;
    }    
    public String get_title(){
        return title;
    }
    public String get_artist(){
        return artist;
    }
    
    public void display(){
        System.out.println("The price of the CD: "+get_price());
        System.out.println("The title of the CD: "+get_title());
        System.out.println("The artist of the CD: "+get_artist()+"Count = "+count);
    }
}
