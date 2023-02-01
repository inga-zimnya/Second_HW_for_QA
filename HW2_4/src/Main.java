import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String[] arr = new String[10];
        Scanner scan = new Scanner(System.in);

        for(int i = 0; i < arr.length; i++){
            arr[i] = scan.nextLine();
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        scan.close();

    }
}