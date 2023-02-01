import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Пожалуйста, введите 2 целых числа");
        int first, second;
        first = scan.nextInt();
        second = scan.nextInt();

        if(Math.abs(first) > Math.abs(second)){
            first /= 2;
        }

        System.out.println("Первое число: " + first);
        System.out.println("Второе число: " + second);
    }
}