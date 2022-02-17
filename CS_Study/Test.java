package Study.CS_Study;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        /* java running check */
        Scanner sc = new Scanner(System.in);

        int sum = sc.nextInt();

        for(int i=0; i<=10; i++){
            sum += i;        
        }

        System.out.println("sum : " + sum);

        sc.close();
    }
}