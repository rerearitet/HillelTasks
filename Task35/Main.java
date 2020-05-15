package task35_try2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ATM atm = new ATM(" ");
        while (true) {
            String input = sc.nextLine();
            if (!input.equals("")) atm.input(input);
            else {
                System.out.println("ATM stopped.");
                break;
            }
        }
    }
}