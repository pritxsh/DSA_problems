// Impementation of Queue using Stack

import java.util.*;


final class myStack{
    Stack<Integer> stack = new Stack<>(); 

    public void dopush(Integer elem){
        stack.push(elem);
    }

    public Integer dopop(){
       return stack.pop();
    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }

}

class myQueue {

    myStack stack1 = new myStack();
    myStack stack2 = new myStack(); 

    public void enqueue(Integer elem){
         stack1.dopush(elem);
    }
    public Integer dequeue(){


         if(stack2.isEmpty()){
         while(!stack1.isEmpty()){
            stack2.dopush(stack1.dopop());
        }
       }
        
        if(stack2.isEmpty()){
            throw new RuntimeException("Empty queue");
        }

        return stack2.dopop();
    }

}



class OueueUsingStack{

    public static void main(String[] args) {
        
        myQueue queue = new myQueue();
        queue.enqueue(23);
        queue.enqueue(24);
        queue.enqueue(25);
        queue.enqueue(26);

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        // uncomment below print to get empty queue exception.
        // System.out.println(queue.dequeue());
    }
}