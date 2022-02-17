package Study.CS_Study.Java_DataStructure.variableArrayLoop;

// 클래스 외부에는 선언 불가능

public class VariableArrayLoop02 {

    /**
     * @desc
     * 메서드 외부 : 전역변수 - static O
     * 클래스 전체에서 사용 가능
     */
    static int num;
    
    public static void main(String[] args) {

        /**
         * @desc
         * 메서드 내부 : 지역변수 - ststic X
         * 메서드 내부에서만 사용 가능
         */
        int anotherNum = 5;
        num = 2;

        System.out.println(num + anotherNum);
        System.out.println("Num: " + num);
        System.out.println("AnotherNum" + anotherNum);  // 문자열 합치기 연산

        /**
         * @left_associativity_연산자_결합_법칙
         * 
         * Sum: 2 + anotherNum (5)
         * Sum: 25
         * 3개의 String이 합쳐진 결과
         */
        System.out.println("Sum: " + num + anotherNum);
    }

    /**
     * @변수-primitive
     * byte, short, int, long, float, double
     * char, boolean, String
     * 
     * 변수는 "적용범위"를 가짐.
     *  메서드 내부에 선언된 변수는 메서드 내부에서만 사용 가능.
     *  메서드 외부에 선언된 변수는 클래스 내에서 가용 가능.
     */
}