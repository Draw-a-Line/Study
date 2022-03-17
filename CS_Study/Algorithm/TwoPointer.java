package Study.CS_Study.Algorithm;

import java.util.Scanner;

public class TwoPointer {
    public static void main(String[] args) {
        
        int N, arr[], M; // 수의 갯수, 배열, 구해야하는 수
        int start=0, end=0, partial_sum=0, answer=0;

        // 수 입력받기
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        arr = new int [N];
        for(int i=0; i<N; i++) {
            arr[i] = sc.nextInt();
        }
        M = sc.nextInt();

        while(start < N){
            // >M이 먼저인 이유 : if조건을 건너뛰고 elif 가 먼저 실행되어야해서?
            if(partial_sum > M || end >= N)
                partial_sum -= arr[start++];
            else if(partial_sum <= M)
                partial_sum += arr[end++];
            if (partial_sum == M)
                answer++;
        }

        System.out.println(answer);

        sc.close();
    }
}
