class Queue
{
	int[] arr;
	int size2,front,rear;
	
	
	public Queue(int size)
	{
		this.size2=size;
		arr=new int[size];
		front=0;
		rear=-1;
	}
	
	
	
	boolean isFull()
	{
		if(front==size-1)
			return true;
		else
			return false;
	}
	
	
	boolean isEmpty()
	{
		if(rear<front || front<0)
			return true;
		else
			return false;
	}
	public void enqueue(int element)
	{
		if(isFull())
		{
			System.out.print("Full");
		}
		else
		{
			arr[++rear]=element;
		}
	}
	
	public int dequeue()
	{
		if(isEmpty())
		{
			System.out.print("Empty");
			return -1;
		}
		else
		{
			return arr[front++];
		}
	}
	
	public int peek()
	{
		if(isEmpty())
			return -999;
		else
			return arr[front];
	}


	public static void main(String[] args)
	{
		Queue ob=new Queue(5);
		
		ob.enqueue(10);
		ob.enqueue(12);
		ob.enqueue(14);
		ob.enqueue(14);
		ob.dequeue();
		
		System.out.println(ob.dequeue()+" ");
		System.out.println(ob.dequeue()+" ");
		System.out.println(ob.dequeue()+" ");
	}

}