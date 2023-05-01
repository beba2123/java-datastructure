public class runner8 {
    public static void main(String[] args) {
        Queue Q = new Queue();
        Q.enQueue(5);
        Q.enQueue(6);
        Q.enQueue(7);
        Q.enQueue(8);

        Q.deQueue();

        Q.show();
    }
}


class Queue{

     int Queue[] = new int[5];
     int size;
     int rear;
     int front=0;
     public void enQueue(int data){
       Queue[rear]= data;
         rear++;
         size++;
     }
     public int deQueue(){
       int data  = Queue[front];
        front++;
        size --;

        return data;
     }
     public void show(){
        System.out.print("elements : " );
         for(int i=0;i<size;i++){
            System.out.print(Queue[i + front] + "  ");
         }
         
     }
     
}
