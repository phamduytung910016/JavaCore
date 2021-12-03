package CauTrucDuLieuVaGiaiThuat;


/**
 * Queue-Hàng đợi: là một cấu trúc dữ liệu hoạt động theo nguyên tắc
 * FIFO (vào trước ra sau)
 *
 * */

/**
 * enqueue: Thêm vào một phần từ SnQ
 * dequeue: Lấy ra một phần tử trong SnQ
 * isFull: Kiểm tra SnQ đã đầy chưa
 * isEmpty: Kiểm tra SnQ có empty hay không
 * */



class Node_Queue{
    private int data;

    public Node_Queue(int data){
        this.data = data;
    }

    public void printData(){
        System.out.println("Data = " + this.data + "\n");
    }
}

class Queue_Array{
    private int maxSize;
    private int size;
    private int head;
    private int tail;
    private Node_Queue[] queues;

    public Queue_Array(int maxSize) {
        this.size = 0;
        this.maxSize = maxSize;
        this.head = 0;
        this.tail = 0;
        this.queues = new Node_Queue[maxSize];
    }

    public boolean isEmpty(){
        return (this.size == 0);
    }

    public boolean isFull(){
        return (this.size == this.maxSize);
    }

    public void enqueue(Node_Queue node_queue){
        if(this.isFull()){
            System.out.println("Queue is full \n");
            return;
        }
        this.size++;
        this.queues[this.tail] = node_queue;
        this.tail++;
        if(this.tail == this.maxSize){
            this.tail = 0;
        }
    }

    public Node_Queue dequeue(){
        if(this.isEmpty()){
            System.out.println("Queue is empty \n");
            return null;
        }
        this.size--;
        Node_Queue node_queue = this.queues[this.head];
        this.head++;
        return node_queue;
    }

    public void print(){
        System.out.println("Queue: \n");
        if(this.isEmpty()){
            System.out.println("Queue is empty \n");
            return ;
        }
        int temp = this.head;
        while(true){
            this.queues[temp].printData();
            temp++;
            if(temp == this.maxSize){
                temp = 0;
            }
            if(temp == this.tail){
                break;
            }
        }
    }
}



class Node_Queue_Linked{
    private int data;
    public Node_Queue_Linked next;

    public Node_Queue_Linked(int data) {
        this.data = data;
        this.next = null;
    }

    public void printData(){
        System.out.println("Data = " + this.data + "\n");
    }
}

class Queue_Linked{
    private Node_Queue_Linked head;
    private Node_Queue_Linked tail;
    private int size;

    public Queue_Linked() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public boolean isEmpty(){
        return (this.size == 0);
    }

    public void enqueue(Node_Queue_Linked node_queue_linked){
        if(this.isEmpty()){
            this.head = node_queue_linked;
            this.tail = node_queue_linked;
            this.size++;
            return;
        }
        this.tail.next = node_queue_linked;
        this.tail = node_queue_linked;
        this.size++;
    }

    public Node_Queue_Linked dequeue(){
        if(this.isEmpty()){
            System.out.println("Queue is empty \n");
            return null;
        }
        Node_Queue_Linked node_queue_linked = this.head;
        this.head = this.head.next;
        this.size--;
        return node_queue_linked;

    }

    public void print(){
        System.out.println("Queue: \n");
        Node_Queue_Linked node_queue_linked = this.head;
        while(node_queue_linked != null){
            node_queue_linked.printData();
            node_queue_linked = node_queue_linked.next;
        }
    }
}

public class Queue {
    public static void main(String[] args) {
        //Queue sử dụng Array list

//        System.out.println("Queue - Java \n");
//        Queue_Array queue_array = new Queue_Array(2);
//
//        queue_array.enqueue(new Node_Queue(101));
//        queue_array.enqueue(new Node_Queue(201));
//        queue_array.enqueue(new Node_Queue(301));
//        System.out.println("\n");
//        queue_array.print();
//        System.out.println("\n");
//        System.out.println("\n");
//
//        Node_Queue node_queue = queue_array.dequeue();
//        if(node_queue != null){
//            System.out.println("dequeue\n");
//            node_queue.printData();
//        }
//        System.out.println("\n");
//        queue_array.print();

        //Queue sử dụng Linked-List
        System.out.println("Queue - Java \n");
        Queue_Linked queue_linked = new Queue_Linked();

        queue_linked.enqueue(new Node_Queue_Linked(101));
        queue_linked.enqueue(new Node_Queue_Linked(201));
        queue_linked.enqueue(new Node_Queue_Linked(301));
        System.out.println("\n");
        queue_linked.print();
        System.out.println("\n");
        System.out.println("\n");

        Node_Queue_Linked node_queue_linked = queue_linked.dequeue();
        if(node_queue_linked!= null){
            System.out.println("dequeue\n");
            node_queue_linked.printData();
        }
        System.out.println("\n");
        queue_linked.enqueue(new Node_Queue_Linked(500));
        queue_linked.print();



    }
}
