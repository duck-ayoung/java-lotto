package calculator;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CalculatorApplication {

    public static void main(String[] args) {
        System.out.println("계산기");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] numbers = input.split(" ");
        Queue<Integer> queue = new LinkedList<>();
        for (String number : numbers) {
            if(isOperator(number)) {

            }
            queue.add(Integer.parseInt(number));

        }
    }

    private static boolean isOperator(String number) {
        char a = number.charAt(0);
        if(a >= '0' && a <= '9') {
            return  false;
        }
        return  true
    }
}
