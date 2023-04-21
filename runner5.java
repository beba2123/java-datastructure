class stack{
    int data;
    int stack[] = new int[5];
    int lastValue=0;
    public void push(int data){
        stack[lastValue] = data;
        lastValue++;
    }
    public int pop(){
        lastValue--;
        data = stack[lastValue];
        stack[lastValue]=0;
       
        return data;
    }
    public void show(){
        for( int n : stack){
            System.out.println(n + " ");
        }
}

}




public class runner5 {
    public static void main(String[] args) {
        stack nums = new stack();
        nums.push(12);
        nums.push(24);
        nums.push(48);
        nums.push(60);
        
        System.out.println(nums.pop());

        nums.show();
    }
}

