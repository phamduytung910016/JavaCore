package CauTrucDuLieuVaGiaiThuat;


/**
 * Stack-ngăn xếp: là một cấu trúc dữ liệu hoạt động theo nguyên tắc FILO(vào sau ra trước)
 *
 * */

/**
 * push: Thêm vào một phần từ SnQ
 * pop: Lấy ra một phần tử trong SnQ
 * isFull: Kiểm tra SnQ đã đầy chưa
 * isEmpty: Kiểm tra SnQ có empty hay không
 * */



class Node_Stack_Array{
    private int data;

    public Node_Stack_Array(int data) {
        this.data = data;
    }

    public void printData(){
        System.out.println("Data = " + this.data);
    }
}

class Stack_Array{

    private int top;
    private Node_Stack_Array[] stack;

    public Stack_Array(int maxSize) {
        this.stack = new Node_Stack_Array[maxSize];
        this.top = -1;

    }

    public void push(Node_Stack_Array node_stack_array){
        if(this.isFull()){
            System.out.println("Stack is full\n");
            return;
        }
        this.top++;

        this.stack[this.top] = node_stack_array;
    }

    public Node_Stack_Array pop(){
        if(this.isEmpty()){
            System.out.println("Stack is empty \n");
            return null;
        }
        Node_Stack_Array node_stack_array = this.stack[this.top];
        this.top--;

        return node_stack_array;
    }

    public Node_Stack_Array peek(){
        return this.stack[this.top];
    }

    public boolean isFull(){
        return (this.top + 1 == this.stack.length);
    }

    public boolean isEmpty(){
        return (this.top == -1);
    }

    public void print(){
        System.out.println("Stack: \n");
        for (int i = 0; i <= this.top; i++) {
            this.stack[i].printData();
        }
    }
}

public class Stack {
    public static void main(String[] args) {
        System.out.println("Stack - Java \n");
        Stack_Array stack = new Stack_Array(6);
        stack.push(new Node_Stack_Array(12));
        stack.push(new Node_Stack_Array(11));
        stack.push(new Node_Stack_Array(10));
        stack.push(new Node_Stack_Array(9));
        stack.push(new Node_Stack_Array(8));

        stack.print();

        stack.pop();
        stack.print();
    }
}
