public class Main {
    public static void main(String[] args) {
        int start = 3900, max = 0;
        while(start <= 5000){
            if(start % 39 == 0) max = start;
            start += 1;
        }
        System.out.println("Наибольшее число, которое делится нацело на 39 и меньше 5000: " + max);
    }
}