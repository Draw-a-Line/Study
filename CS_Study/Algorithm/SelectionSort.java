package Study.CS_Study.Algorithm;

public class SelectionSort {

    public static void main(String[] args) {
        int [] arr = {9, 6, 7, 3, 5};
        int tmp;    // 교환용 변수
        int min;    // 최솟값 저장용 변수
    
        for(int i=0; i<arr.length - 1; i++) {
            // 가장 앞의 원소를 최솟값으로 설정
            min = i;

            // 탐색을 통해 가장 최솟값 찾기
            for(int j=i+1; j<arr.length; j++) { // j는 i보다 1 큰 수 이어야 하기 때문 
                if(arr[min] > arr[j]) {
                    min = j;
                }
            }

            // 탐색이 완료되면 최솟값과 가장 앞의 원소의 자리를 바꿈.
            tmp = arr[min];
            arr[min] = arr[i];
            arr[i] = tmp;
        }
        System.out.println("정렬 완료✌️");
        for(int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
