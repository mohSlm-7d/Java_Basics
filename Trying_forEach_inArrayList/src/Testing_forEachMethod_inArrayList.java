
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
class Testing_forEachMethod_inArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> test = new ArrayList<Integer>();
        try {

            int i = 0;
            while (i < test.size()) {
                test.set(i, 0);
                i++;
            }

            test.forEach((element) -> System.out.println(element));
        } catch (Exception RunTimeError) {
            System.out.println(RunTimeError.getMessage());
        } finally {
            test.add(2);
            test.add(0);
            test.add(1);
            test.add(9);
            test.add(0);
            test.add(9);
            test.add(0);
            test.add(1);

            test.forEach((element) -> System.out.println(element));

            //HashSet<Integer[]>ttt = new HashSet<Integer[]>();
            HashMap<Character, Integer> Colors = new HashMap<Character, Integer>();
            String colors= "abaca";
            int i=0;
            while(i< colors.length()){
                Character toMap = (Character)colors.charAt(i);
                if(Colors.containsKey(colors.charAt(i))){
                    Colors.put(toMap, Colors.get(toMap) + 1);
                }
                else{
                    Colors.put(toMap, 1);
                }
                i++;
            }
            int edges [][]= new int [5][2];
            Colors.forEach((key, val)->System.out.println(key +" mapped to "+val));
        }

        int edges [][]= new int [5][2];
        int i=0, j=0;
        HashMap<Integer, ArrayList<Integer>> adj =new HashMap<Integer, ArrayList<Integer>>();
        while(j< edges.length){
            ArrayList <Integer> toBeMapped = new ArrayList<Integer>();
            if(edges[j][0] == i){
                toBeMapped.add(edges[j][1]);
            }
            j++;
        }

        enum DAYS {
            SUNDAY,
            MOONDAY,
            SATURDAY
        }
        
        
        DAYS today = DAYS.SUNDAY;

        /*ystem.out.println(today.toString());
        String test="Mohammad";
        Integer ASCII= (int)t.charAt(0);
        System.out.println(ASCII);*/
        
    }
}
