class Stack
{
	int[] arr;
	int size,top;
	
	public Stack(int size)
	{
		this.size=size;
		arr=new int[size];
		top=-1;
	}
	
	boolean isEmpty()
	{
		if(top==-1)
			return true;
		else
			return false;
	}
	
	boolean isFull()
	{
		if(top==size-1)
			return true;
		else
			return false;
	}
	
	public void push(int element)
	{
		if(isFull())
		{
			System.out.print("Full");
		}
		else
		{
			arr[++top]=element;
		}
	}
	
	public int pop()
	{
		if(isEmpty())
		{
			System.out.print("Empty");
			return -999;
		}
		else
		{
			return arr[top--];
		}
	}
	
	public int peek()
	{
		return arr[top];
	}
}
public class StackDemo
{
	public static void main(String[] args)
	{
		Stack ob=new Stack(5);
		
	
		ob.pop();
		
		System.out.println(ob.pop());
	}
}