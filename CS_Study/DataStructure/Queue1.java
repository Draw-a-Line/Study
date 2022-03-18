package Study.CS_Study.DataStructure;

class Queue2 {

    private int MAX_QUEUE_SIZE = 5;
    private int queue[];
    private int head;
    private int tail;

    public Queue2() {
        head = -1; // 큐의 시작점은 0. 처음 값이 입력되어 +1 됐을 때 그 값이 0이 되게 하기위해 -1로 초기화
        tail = -1;
        queue = new int [MAX_QUEUE_SIZE];
    }

    boolean is_empty() {
        if(head == tail) {
            return true;
        }    
        return false;
    }

    boolean is_full() {
        if((tail+1) % MAX_QUEUE_SIZE == head){
            return true;
        }
        return false;
    }

    // ***
    void enqueue(int item) {
        if(this.is_full()){
            System.out.println("큐에 더이상 데이터를 넣을 수 없습니다.\n");
            return;
        }
        tail = (tail+1) % MAX_QUEUE_SIZE;
        queue[tail] = item;
    }

    int dequeue() {
        if(is_empty()){
            System.out.println("큐가 비어있습니다. \n");
            return -1;
        }
        head = (head+1) % MAX_QUEUE_SIZE;
        return queue[head];
    }
}

public class Queue1 {

    public static void main(String[] args) {
        Queue2 q = new Queue2();
     
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        System.out.println("pop: " + q.dequeue());
        System.out.println("pop: " + q.dequeue());
        System.out.println("pop: " + q.dequeue());

        q.enqueue(4);
        q.enqueue(5);
        q.enqueue(6);
        System.out.println("pop: " + q.dequeue());
        System.out.println("pop: " + q.dequeue());
        System.out.println("pop: " + q.dequeue()); 
    }
}
