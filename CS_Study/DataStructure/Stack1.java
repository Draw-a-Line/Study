package Study.CS_Study.DataStructure;

import java.util.*;

public class Stack1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // 클래스명을 Stack으로 지은 상태에서 아래 코드를 구현하니 프로그램이 스택에 대한 인식을 클래스명으로 해서 클래스명 수정.
        Stack<String> stack = new Stack();
        String[]push = sc.next().split("");

        for(int i=0; i<push.length; i++) {
			if(push[i].equals("{")) {
				stack.push("");
			}
			else if(push[i].equals("}")) {
				if(stack.size()==0) {
				}
                else {
					stack.pop();
				}
			}
		}
		if(stack.empty()==true) {
			System.out.println("유효한 중괄호 쌍입니다.");
		}
        else System.out.println("유효하지 않은 중괄호 쌍입니다.");
        
        sc.close();
    }
}