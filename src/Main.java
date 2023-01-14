import java.util.Arrays;

import jp.ac.uryukyu.ie.e225710.*;

public class Main {
    public static void main(String[] args) throws Exception {
        number number = new number();

        number.set_number();
        int[] answer_number;
        int[] input_number = {1, 2, 3};
        answer_number = number.return_number();
        compare_machine compare_machine = new compare_machine(input_number, answer_number);
        compare_machine.compare();
       }
}
 