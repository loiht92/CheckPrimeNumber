import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scanner.nextInt();
        boolean check = true;

        if (number < 2) {
            check = false;

        } else {
//            for (int i = 2; i <= number -1; i++) {
//                if (number % i == 0) {
//                    check = false;
//                    break;
//                }
//            }
            int i = 2;
            check = true ;
            while (i <= number -1 ){
                if (number % i == 0){
                    check =false;
                    break;
                }
                i ++ ;
            }
        }
        if (check) {
            System.out.println(number + "la so nguyen to");
        } else {
            System.out.println(number + "khong phai la so nguyen to");
        }
    }
}
