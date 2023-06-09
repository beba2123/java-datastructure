class Node{
    int data;
    Node next;

}
class LinkedList{
     Node head; //this one is used for refrencing our first node
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
       node.next = head;   // this means we make the current id adress the previous home adress
       head = node;  // the new created data will be the head.
       
    }
    public void inasertAtAnywhere(int index, int data){
        Node node = new Node();
        node.data= data;
        node.next = null;

        Node n = head;
        if (index==0){
            insertAtStart(data);
            
        }else{
        for(int i =0; i<index-1;  i++){
            n=n.next;
        }
        node.next = n.next;
        n.next  = node;
    }
    
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





public class runner3 {
    public static void main(String[] args) {
        LinkedList list =  new LinkedList();
        list.insert(23);
        list.insert(42);
        list.insert(32);
        list.insertAtStart(36);
        list.inasertAtAnywhere(0, 49);
        list.show();
} 
}
