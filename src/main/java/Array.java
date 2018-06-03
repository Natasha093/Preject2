import java.util.*;
import java.io.*;
/**
 * Задание №3
 *
 * @author Ежова Наталья
 */
public class Array {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter number of task: (1 - calculator, 2 - string array)");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        switch (n) {
            case 1:
                float d = 0;
                System.out.println("Enter the first number");
                float a = scanner.nextFloat();
                System.out.println("Operator");
                char b = scanner.next().charAt(0);
                System.out.println("Enter the second number");
                float c = scanner.nextFloat();
                //операция сложения
                if (b == '+') {
                    d = a + c;
                }
                //операция вычитания
                else if (b == '-') {
                    d = a - c;
                }
                //операция умножения
                else if (b == '*') {
                    d = a * c;
                }
                //операция деления
                else if (b == '/') {
                    d = a / c;
                }
                //Вывод результата
                System.out.printf("Result " + "%.4f", d);
                break;
            case (2):
                System.out.println("Array length: ");

                int size = scanner.nextInt();
                String stack[] = new String[size];

                System.out.println("Array: ");
                for (int i = 0; i < size; i++) {
                    stack[i] = scanner.next();
                   // System.out.println("Element" + i +": "+ stack[i]);
                }

                //Вывести самое длинное слово

                int stack2[] = new int[size];
                int max = stack2[0];
                int i = 0, j = 0;

                for (i = 0; i < size; i++) {
                    stack2[i] = stack[i].length();
                    // System.out.println(stack2[i]);
                    if (stack2[i] > max) {
                        max = stack2[i];
                        j = i;
                    }
                }
                //System.out.println(max);
                //System.out.println(j);
                System.out.println("Max:" + stack[j]);
                break;
            default:
                System.out.println("You enter wrong number. Try again");
        }
    }
}

