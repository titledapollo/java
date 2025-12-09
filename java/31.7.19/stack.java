class stack
{
int [] a;
int top,size,i,n;
stack(int n)
{
	size=n;
	top=-1;
	a=new int[n];
}
void push(int n)
{
	if(top==size-1)
	{
		System.out.println("Stack Overflow");
	}
	else
	{
		a[++top]=n;
	}
}
int pop()
{
	if(top==-1)
	{
		System.out.println("Stack Underflow");
		return 0;
	}
	else{
          return(a[top--]);
	}
}
void display()
{
	if(top!=-1)
	{
for(i=0;i<=top;i++)
		{
			System.out.println(" "+ a[i]);
		}
	}
}
public static void main(String args[])
{
	stack s=new stack(10);
	s.push(5);
    s.push(6);
	s.push(70);
	s.push(30);
	System.out.println(" The deleted stack are " +s.pop());
    s.display();
}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	