package Study.CS_Study.Java_DataStructure.variableArrayLoop;

import java.util.Scanner;

public class VariableArrayLoop03 {

    public static void main(String[] args) {

        int number = 123;

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter an integer: ");

        int input = sc.nextInt();

        if(input == number) {
            System.out.println("Numbers match!");
        } else {
            System.out.println("Numbers does not match!");
        }

        // 메모리 누수 방지
        sc.close();
    }
}