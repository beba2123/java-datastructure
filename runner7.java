class Dynamicstack{
    int data;
    int capacity=5;
    int stack[] = new int[capacity];
    int lastValue=0;
    public void push(int data){
      {
        if(size()==capacity)
         expand();
        stack[lastValue] = data;
        lastValue++;
    }
}
    private void expand(){
        int length = size();
        int newStack[] = new int[capacity*2];  //create new stack becouse we are going to make expand it..
        System.arraycopy(stack, 0, newStack, 0, length);
        stack = newStack;  //make a newstack name.
        capacity *= 2; //make it capacity always increase when it  reaches it previous capacity.
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("the size is empty we cannot delete it..?");

        }else{
        lastValue--;
        data = stack[lastValue];
        stack[lastValue]=0;   
        shrink();
    }
    return data;
}
    private void shrink(){
        int length = size();
    if(length <= (capacity/2)/2)
      capacity = capacity/2;
    
      int newStack[] = new int[capacity];
      System.arraycopy(stack, 0, newStack, 0, length);
      stack = newStack;
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




public class runner7 {
    public static void main(String[] args) {
        Dynamicstack nums = new Dynamicstack();
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

        nums.pop();
        nums.pop();
        nums.pop();
        nums.pop();
        nums.show();
    }
}

