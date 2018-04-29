class Stack1{
	int maxsize;
	int top;
	int stackarray[];
	
	public Stack1(int s){
		maxsize=s;
		stackarray=new int[maxsize];
		top=-1;
	}
	
	public void push(int elemnt){
		if(isFull()){
			System.out.println("stack is over load");
		}
		else{
			stackarray[++top]=elemnt;
			
		}
		
	}
	
	public int pop()
	{
		if(isEmpty()){
		
		System.out.println("stack is Over wride");
		return 0;
	}
	else{
		return stackarray[top--];
	}
	}
	
	public int peek(){
		return stackarray[top];
	}
	
	public boolean isFull(){
		return top==maxsize-1;
	}
	
	public boolean isEmpty(){
		return top==-1;
	}
	
	public static void main(String args[]){
		Stack1 ob=new Stack1(5);
		ob.push(1);
		ob.push(2);
		ob.push(3);
		
	
		{int v=ob.pop();
	     System.out.print(v+" ");
	}
	
	}
}