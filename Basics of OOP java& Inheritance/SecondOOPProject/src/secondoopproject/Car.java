package secondoopproject;

/**
 *
 * @author M7md_2
 */
public class Car{
    private String maker;
    private int yearModel;
    
    public Car(){
        maker="";
        yearModel=2019;
        System.out.println("Welcome in Constructor of Car");
    }
    public Car(int y){
        System.out.println("For my homies! BRO FIST! ;)");
        yearModel=y;
    }
    public void setMaker(String m){
        maker=m;
    }
    public void setYearModel(int year){
        yearModel=year;
    }
    public String getMaker(){
        return maker;
    }
    public int getYearModel(){
        return yearModel;
    }
   
}
