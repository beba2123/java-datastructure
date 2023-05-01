public class runner8 {
    public static void main(String[] args) {
        Queue Q = new Queue();
        Q.enQueue(5);

        Q.show();
    }
}


class Queue{

     int Queue[] = new int[5];
     int size;
     int rear;
     int front;
     public void enQueue(int data){
       Queue[rear]= data;
         rear++;
         size++;
     }
     public void show(){
        System.out.print("elements : " );
         for(int i=0;i<size;i++){
            System.out.println(Queue[i] + "  ");
         }
         
     }
     
}
