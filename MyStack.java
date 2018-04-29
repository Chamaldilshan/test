public class MyStack 
{
   private int maxSize;
   // if an array, must have a size;
   private long[] stackArray;
   private int top;
   
   //public MyStack(){}
   // override constructor
 

 public MyStack(int s) // special method - constructor
   {
      maxSize = s; /*s = stack size*/
	  // initializing of an array
      stackArray = new long[maxSize];
      top = -1;// no element 
   }
   
   
   
	public void push(long j) 
	
{
		//check full
		if (isFull()){
			System.out.println("Stack is overflow");
		}
		else{
			stackArray[++top] = j;
			System.out.println("top Value="+top);
		}
   
   }
   
   
   
	public long pop() {
		//check empty
		if (isEmpty()){
			System.out.println("Stack is Empty.");
			return 0;
		}else{
			return stackArray[top--];
		}
	}
	
	
	
	
   public long peek() {
      return stackArray[top];
   }
   
   
   
   public boolean isEmpty() {
      return (top == -1);
   }
   
   
   public boolean isFull() {
      return (top == maxSize - 1);
   }
   

    /*     public void displayMyStack()
   {
	   for(int i=0;i<=top;i++)
		   System.out.print(stackArray[i]+" ");
   } */
   
   
   
   public static void main(String[] args) {
      MyStack theStack = new MyStack(100); 
      theStack.push(10);
      theStack.push(20);
      theStack.push(30);
      theStack.push(40);
      theStack.push(50);
	  theStack.push(60);
      theStack.push(70);
      theStack.push(80);
      theStack.push(90);
      theStack.push(100);
	  theStack.push(110);
      
	  /*  theStack.displayMyStack();
	   System.out.println(" "); */
	   
      while (!theStack.isEmpty()) {
         long value = theStack.pop();
         System.out.print(value+" ");
          

		 }
		
      System.out.println("");
   }
}