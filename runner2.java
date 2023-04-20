

class Node{
    int data;
    Node next;

}
class LinkedList{
     Node head; //this one is used for refrencing our first noad
    public void insert(int data){   //every time that we an insert we create a node which has data and adress of next node.
      Node node = new Node();
      node.data = data;
      node.next =null;
       if(head==null){
        head = node;
       }else {
          Node n = head;
           while(n.next!=null){
              n = n.next;
           }
           n.next = node;
       }
    }


    public void insertAtStart(int data){

       Node node = new Node(); // don't forget everytime that we create an object it creates an id.. for that location that we created
       node.data = data;
       //node.next = null;
       node.next = head;
       head = node;
       
    }

    public void show(){

        Node node = head;
        while(node.next != null){
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }
}





public class runner2 {
    public static void main(String[] args) {
        LinkedList list =  new LinkedList();
        list.insert(23);
        list.insert(42);
        list.insert(32);
        list.insertAtStart(36);
        list.show();
}
}
