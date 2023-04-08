/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalproject;

/**
 *
 * @author M7md_2
 */
public class Date {
    private int day;
    private int month;
    private int year;
    
    public Date(int day, int month, int year){
        this.day = day;
        this.month = month;
        this.year = year;
    }
    protected void set_day(int day){
        this.day = day;
    }
    protected void set_month(int month){
        this.month = month;
    }
    protected void set_year(int year){
        this.year = year;
    }
    protected int get_day(){
        return day;
    }
    protected int get_month(){
        return month;
    }
    protected int get_year(){
        return year;
    }
    protected boolean checkDate(){
        boolean check = false;
        if(this.year >= 1900 && this.year <= 2021){
            switch(this.month){
                case 1:{
                    if(this.day>0 && this.day<=31)
                        check = true;
                    break;
                }
                case 2:{
                    if(this.year % 4 == 0){
                        if(this.day > 0 && this.day <= 29)
                            check = true;
                    }
                    else{
                        if(this.day > 0 && this.day <= 28)
                            check = true;
                        }
                    break;
                }
                case 3:{
                    if(this.day > 0 && this.day <= 31)
                        check = true;
                    break;                    
                }
                case 4:{
                    if(this.day > 0 && this.day <= 30)
                        check= true;
                    break;
                }
                case 5:{
                    if(this.day > 0 && this.day <= 31)
                        check =true;
                    break;
                }
                case 6:{
                    if(this.day > 0 && this.day <= 30){
                        check = true;                        
                    }
                    break;
                }
                case 7:{
                    if(this.day > 0 && this.day <= 31)
                        check = true;
                    break;
                }
                case 8:{
                    if(this.day > 0 && this.day <= 31)
                        check = true;
                    break;
                }
                case 9:{
                    if(this.day > 0 && this.day <= 30)
                        check = true;
                    break;
                }
                case 10:{
                    if(this.day > 0 && this.day <= 31)
                        check = true;
                    break;
                }
                case 11:{
                    if(this.day > 0 && this.day <= 30)
                        check = true;
                    break;
                }
                case 12:{
                    if(this.day >0 && this.day <= 31)
                        check = true;
                    break;
                }
                default:break;
            }
        }
        
        return check;
    }
}