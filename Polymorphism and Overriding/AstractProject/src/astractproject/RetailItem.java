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
public interface RetailItem extends Display{
    int count = 0;
    public double get_price();
    public String get_title();
    public String get_artist();
    /*@Override
    public void display();*/
}
