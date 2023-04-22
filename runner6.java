class stack{
    int data;
    int stack[] = new int[5];
    int lastValue=0;
    public void push(int data){
        if(lastValue==5){
            System.out.println("the stack is full...");
        }else{
        stack[lastValue] = data;
        lastValue++;
    }
}
    public int pop(){
        if(isEmpty()){
            System.out.println("the size is empty we cannot delete it..?");

        }else{
        lastValue--;
        data = stack[lastValue];
        stack[lastValue]=0;   
    }
    return data;
}
    public int peek(){
      
        data=stack[lastValue-1];

        return data;
    }
    public int size(){
        return lastValue;
    }
    public boolean isEmpty(){
        return lastValue<=0;
    }

    public void show(){
        for( int n : stack){
            System.out.println(n + " ");
        }
}
  
}




public class runner6 {
    public static void main(String[] args) {
        stack nums = new stack();
        System.out.println("empty = " + nums.isEmpty());
        nums.push(12);
        nums.push(24);
        nums.push(48);
        System.out.println(nums.peek());
        nums.push(60);
        nums.push(76);
        nums.push(4445);
        System.out.println("the size of the stack is " + nums.size());
        System.out.println("empty = " + nums.isEmpty());
        nums.show();
    }
}

