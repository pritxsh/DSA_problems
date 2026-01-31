import java.util.*;

final class myQueue{

    Queue<Integer> queue = new LinkedList<>();

    public void enqueue(Integer elem){
            queue.add(elem);
    }

    public Integer dequeue(){
        return queue.remove();
    }

    public boolean isEmpty(){
        return queue.isEmpty();
    }

    public int size(){
        return queue.size();
    }

}

class myStack{
 myQueue queue1 = new myQueue();
 myQueue queue2 = new myQueue();
 
    public void dopush(Integer elem){
        queue1.enqueue(elem);
    }

    public Integer dopop(){

        if (queue1.isEmpty()) {
            throw new RuntimeException("Empty Stack");
        }
        while(queue1.size()>1){
            queue2.enqueue( queue1.dequeue());
        }
       
        Integer result = queue1.dequeue();
       while (!queue2.isEmpty()) {
           queue1.enqueue(queue2.dequeue());
       }

       return result;
    }
}



public class StackUsingQueue {
    public static void main(String[] args) {
        
        myStack stack = new myStack();
        stack.dopush(33);
        stack.dopush(34);
        stack.dopush(35);
        stack.dopush(36);
        System.out.println(stack.dopop());
        System.out.println(stack.dopop());
        System.out.println(stack.dopop());
        System.out.println(stack.dopop());
        // System.out.println(stack.dopop());
    }
}
