import java.util.Scanner;
class Stack
{
    private int maxsize;
    private long[] stackarray;
    private int top;
    public Stack(int s)
    {
        maxsize = s;
        stackarray = new long[maxsize];
        top = -1;
    }
    public void push(long j)
    {
        stackarray [++top] = j;
    }
    public long pop()
    {
        return stackarray[top--];
    }
    public void display()
    {
        System.out.println("\n Stack = ");
        if(isempty())
        {
            System.out.println("Stack is Empty");
        }
        else
        {
            for(int i = top; i >= 0; i--)
                System.out.println(stackarray[i]+"");
        }
    }
    public boolean isempty()
    {
        return (top == -1);
    }
    public boolean iffull()
    {
        return (top == maxsize - 1);
    }
}
        class StackArray
        {
            public static final void main(String args)
            {
                try
                {
                    System.out.println("Size of the stack:");
                    Scanner s = new Scanner(System.in);
                    int n = s.nextInt();
                    Stack newStack = new Stack(n);
                    for(;;)
                    {
                        System.out.println("Menu\n1-Push\n2-Pop\n3-Display\n4-Exit\nEnter your choice");
                        int ch = s.nextInt();
                        switch(ch)
                        {
                            case 1:
                                if(newStack.iffull())
                                {
                                    System.out.println("Stack is full");
                                }
                                else
                                {
                                    System.out.println("Item to be pushed");
                                    int dataStack = s.nextInt();
                                    newStack.push(dataStack);
                                }
                                break;
                            case 2:
                                if (newStack.isempty())
                                {
                                    System.out.println("Stack is Empty");
                                }
                                else
                                {
                                    long popeddata = newStack.pop();
                                    System.out.println(popeddata);
                                }
                                break;
                            case 3:
                                newStack.display();
                                break;
                            case 4:
                                break;
                        }
                        if(ch == 4)
                            break;
                    }
                }
                catch (Exception e)
                {
                    System.out.println(e.getMessage());
                }
            }
        }
        