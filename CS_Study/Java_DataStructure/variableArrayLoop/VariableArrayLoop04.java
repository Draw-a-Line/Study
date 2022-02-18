package Study.CS_Study.Java_DataStructure.variableArrayLoop;

import java.util.Scanner;

public class VariableArrayLoop04 {
    public static void main(String[] args) {

         String str = "Hello";
         String input = null;

         Scanner sc = new Scanner(System.in);

         /**
          * @desc
          * next() 메서드는 하나의 문자열을 읽어줌. 하나의 라인을 읽고싶으면 nextLine() 을 사용.
          * ex) Hello World 를 next()로 읽으면 Hello만 읽어옴.
          */
         System.out.println("Please type a string: ");
         input = sc.next();

        /**
         * @desc
         * '==' 연산자는 primitive 타입 데이터에 대해서만 사용 가능. (String 불가능)
         * 문자열을 비교할 때는 equals를 사용해야함.
         * ex) string1.equals(string2) 
         */
         if(str.equals(input)) {
             System.out.println("Strings match!");
         } else {
             System.out.println("Strings do not match!");
         }
         
         sc.close();
    }
}


