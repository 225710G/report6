import jp.ac.uryukyu.ie.e225710.*;
import java.util.InputMismatchException;

/**
 * mainクラス
 */
public class Main {
    /**
     * 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        System.out.println("--------Bulls and Cows--------");
        console console = new console();
        number number = new number();
        number.set_number();// 何数生成
        int[] answer_number;
        answer_number = number.return_number();
        for (int i = 0; i < 9; i++) {
            try {
                System.out.println("Insert number.");
                String[] input_number = console.insert();
                compare_machine compare_machine = new compare_machine(input_number, answer_number);// 両数字を比べる機械に入れる。
                String num = console.return_num();
                if (num.length() > 3) {
                    throw new InputMismatchException();
                }
                if (Integer.parseInt(input_number[0]) == Integer.parseInt(input_number[1])
                        || Integer.parseInt(input_number[1]) == Integer.parseInt(input_number[2])
                        || Integer.parseInt(input_number[2]) == Integer.parseInt(input_number[0])) {
                    throw new Exception();
                }
                compare_machine.compare();// compare開始＆結果int型ではないStringを文字に入れたとき。
            } catch (InputMismatchException e) {// 3桁数ではない数を入力したとき。
                System.out.println("You can insert only three-digit number. ex)012, 235");
                console = new console();
                i--;
            } catch (Exception e) {
                System.out.println("Duplicate numbers are not allowed");
                console = new console();
                i--;
            }

        }
        System.out.println("You lose");
    }
}