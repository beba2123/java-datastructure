public class runner8 {
    public static void main(String[] args) {
        Queue Q = new Queue();
        Q.enQueue(5);
        Q.enQueue(6);
        Q.enQueue(7);
        Q.enQueue(8);

         Q.deQueue();
         Q.deQueue();

        Q.enQueue(18);
        Q.enQueue(28);

        Q.show();
    }
}


class Queue{

     int Queue[] = new int[5];
     int size;
     int rear;
     int front=0;
     public void enQueue(int data){
       if(!isFull()){
        Queue[rear]= data;
        rear = (rear + 1)%5;
        size++;
       }else{
         System.out.println(" The Queue is Full ");
       }
     }
     public int deQueue(){
        int data  = Queue[front];
        if(!isEmpty()){
        front = (front + 1)%5;
        size --;
        }else
          System.out.println(" The stack is Empty.. ");
       
      return data;
     }
     public void show(){
        System.out.print( "elements : " );
         for(int i=0;i<size;i++){
            System.out.print(Queue[(i + front)%5] + "  ");  // we add front  becouse let say we remove an elements
            // from the array soo the moment we remove the first elemet the front  value will  be the second value that is the reason.
         }
         System.out.println("  ");
         for(int n : Queue ){
            System.out.print(n + " ");
         }
     }
     public int getSize(){
        return size;
     }
     public boolean isEmpty(){
        return getSize()==0;
     }
     public boolean isFull(){
        return getSize()==5;
     }
     
}
