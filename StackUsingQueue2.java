
import java.util.*;

final class myQueue{

    Queue<Integer> queue = new LinkedList<>();

    public void enqueue(int elem){
            queue.add(elem);
    }

    public int dequeue(){
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

 myQueue queue = new myQueue();

 public void dopush(Integer elem){
    queue.enqueue(elem);
   
   for(int i=1;i<queue.size();i++){
         queue.enqueue(queue.dequeue());
   }
 }

 public Integer dopop(){
   if(queue.isEmpty()){
     throw new RuntimeException("Stack is empty");
   }
    return queue.dequeue();
 }
}

public class StackUsingQueue2 {
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
