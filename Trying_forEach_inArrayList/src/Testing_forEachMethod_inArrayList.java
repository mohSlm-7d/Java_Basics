
// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.ArrayList;

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
        }
    }
}